package ���̲߳�������Ϸ;

	public class ���̲߳�������Ϸ implements Runnable{
	    final int SMALLER=-1,LARGER=1,SUCCESS=0;
	    private static int theNumber;
	    int guessNumber1,guessNumber2,min1=0,max1=100,min2=0,max2=100,message=SMALLER,message2=SMALLER;
	    boolean pleaseGuess=false,isGiveNumber=false,pleaseGuess2=false,isGiveNumber2=false;
	    Thread giveNumberThread,guessNumberThread1,guessNumberThread2;
	    ���̲߳�������Ϸ(){
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
	    //�����
	    private static int getRandom(int x, int y) {
	        int num = -1;
	        //˵�����������ںϷ���Χ�ڣ�����������������ĸ�����һЩ
	        if (x < 0 || y < 0) {
	            return num;
	        } else {
	            int max = Math.max(x, y);
	            int min = Math.min(x, y);
	            int mid = max - min;//���
	            //���������
	            num = (int) (Math.random() * (mid + 1)) + min;
	        }
	        return num;
	    }
	    public synchronized void setMessage(int count) {
	        //����Ҫ�µ�����
	        if(Thread.currentThread()==giveNumberThread&& !isGiveNumber) {
	            theNumber=(int)(Math.random()*100)+1;
	            System.out.println("�������һ��1��100֮��������²��Ƕ��٣�"+theNumber);
	            isGiveNumber=true;
	            pleaseGuess=true;
	            pleaseGuess2=true;
	        }
	        //�ж��Ƿ����
	        if(Thread.currentThread()==giveNumberThread) {
	            while(pleaseGuess || pleaseGuess2)
	                try { wait();
	                }
	                catch(InterruptedException e) {}
	            if(theNumber==guessNumber1){
	                message=SUCCESS;
	                System.out.println("��ϲA����¶���");
	                return;
	            }if(theNumber==guessNumber2){
	                message=SUCCESS;
	                System.out.println("��ϲB����¶���");
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
	                System.out.println("A��"+count+"�β�������ǣ�"+guessNumber1);
	            }
	            else if(message==LARGER) {
	                max1=guessNumber1-1;
	                guessNumber1=getRandom(min1,max1);
	                System.out.println("A��"+count+"�β�������ǣ�"+guessNumber1);
	            }
	            if(theNumber>guessNumber1) {
	                message=SMALLER;
	                System.out.println("���С��");
	            }
	            else if(theNumber<guessNumber1) {
	                message=LARGER;
	                System.out.println("��´���");
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
	                System.out.println("B��"+count+"�β�������ǣ�"+guessNumber2);
	            }
	            else if(message2==LARGER) {
	                max2=guessNumber2-1;
	                guessNumber2=getRandom(min2,max2);
	                System.out.println("B��"+count+"�β�������ǣ�"+guessNumber2);
	            }
	            if( theNumber>guessNumber2) {
	                message2=SMALLER;
	                System.out.println("���С��");
	            }
	            else if(theNumber<guessNumber2) {
	                message2=LARGER;
	                System.out.println("��´���");
	            }
	            pleaseGuess2=false;
	        }
	        notifyAll();
	    }
	    public static void main(String[] args) {
	        ���̲߳�������Ϸ number=new ���̲߳�������Ϸ();
	        number.giveNumberThread.start();
	        number.guessNumberThread1.start();
	        number.guessNumberThread2.start();

	    }
	}