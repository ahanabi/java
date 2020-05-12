package 多线程猜数字游戏;

	public class 多线程猜数字游戏 implements Runnable{
	    final int SMALLER=-1,LARGER=1,SUCCESS=0;
	    private static int theNumber;
	    int guessNumber1,guessNumber2,min1=0,max1=100,min2=0,max2=100,message=SMALLER,message2=SMALLER;
	    boolean pleaseGuess=false,isGiveNumber=false,pleaseGuess2=false,isGiveNumber2=false;
	    Thread giveNumberThread,guessNumberThread1,guessNumberThread2;
	    多线程猜数字游戏(){
	        giveNumberThread=new Thread(this);
	        guessNumberThread1 = new Thread(this);
	        guessNumberThread2 = new Thread(this);
	    }
	    public void run() {
	        for(int count=1;true;count++) {
	            setMessage(count);
	            if(message==SUCCESS||message2==SUCCESS)
	                return;
	        }
	    }
	    //随机数
	    private static int getRandom(int x, int y) {
	        int num = -1;
	        //说明：两个数在合法范围内，并不限制输入的数哪个更大一些
	        if (x < 0 || y < 0) {
	            return num;
	        } else {
	            int max = Math.max(x, y);
	            int min = Math.min(x, y);
	            int mid = max - min;//求差
	            //产生随机数
	            num = (int) (Math.random() * (mid + 1)) + min;
	        }
	        return num;
	    }
	    public synchronized void setMessage(int count) {
	        //给出要猜的数字
	        if(Thread.currentThread()==giveNumberThread&& !isGiveNumber) {
	            theNumber=(int)(Math.random()*100)+1;
	            System.out.println("随机给你一个1至100之间的数，猜猜是多少？"+theNumber);
	            isGiveNumber=true;
	            pleaseGuess=true;
	            pleaseGuess2=true;
	        }
	        //判断是否猜中
	        if(Thread.currentThread()==giveNumberThread) {
	            while(pleaseGuess || pleaseGuess2)
	                try { wait();
	                }
	                catch(InterruptedException e) {}
	            if(theNumber==guessNumber1){
	                message=SUCCESS;
	                System.out.println("恭喜A，你猜对了");
	                return;
	            }if(theNumber==guessNumber2){
	                message=SUCCESS;
	                System.out.println("恭喜B，你猜对了");
	                return;
	            }
	            pleaseGuess=true;
	            pleaseGuess2=true;
	        }
	        if(Thread.currentThread()==guessNumberThread1&& isGiveNumber) {
	            while(!pleaseGuess)
	                try { wait();
	                }
	                catch(InterruptedException e) {}
	            if(message==SMALLER) {
	                min1=guessNumber1+1;
	                guessNumber1=getRandom(min1,max1);
	                System.out.println("A第"+count+"次猜这个数是："+guessNumber1);
	            }
	            else if(message==LARGER) {
	                max1=guessNumber1-1;
	                guessNumber1=getRandom(min1,max1);
	                System.out.println("A第"+count+"次猜这个数是："+guessNumber1);
	            }
	            if(theNumber>guessNumber1) {
	                message=SMALLER;
	                System.out.println("你猜小了");
	            }
	            else if(theNumber<guessNumber1) {
	                message=LARGER;
	                System.out.println("你猜大了");
	            }

	            pleaseGuess=false;
	        }
	        if(Thread.currentThread()==guessNumberThread2&& isGiveNumber) {
	            while(!pleaseGuess2)
	                try { wait();
	                }
	                catch(InterruptedException e) {}
	            if(message2==SMALLER) {
	                min2=guessNumber2+1;
	                guessNumber2=getRandom(min2,max2);
	                System.out.println("B第"+count+"次猜这个数是："+guessNumber2);
	            }
	            else if(message2==LARGER) {
	                max2=guessNumber2-1;
	                guessNumber2=getRandom(min2,max2);
	                System.out.println("B第"+count+"次猜这个数是："+guessNumber2);
	            }
	            if( theNumber>guessNumber2) {
	                message2=SMALLER;
	                System.out.println("你猜小了");
	            }
	            else if(theNumber<guessNumber2) {
	                message2=LARGER;
	                System.out.println("你猜大了");
	            }
	            pleaseGuess2=false;
	        }
	        notifyAll();
	    }
	    public static void main(String[] args) {
	        多线程猜数字游戏 number=new 多线程猜数字游戏();
	        number.giveNumberThread.start();
	        number.guessNumberThread1.start();
	        number.guessNumberThread2.start();

	    }
	}