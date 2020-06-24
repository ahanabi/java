package GuessNumberGame;

import java.util.Random;
public class guess2 {
public static void main(String[] args) {
    ThreadOne one = new ThreadOne();
    one.start();
    ThreadTwo two = new ThreadTwo("猜题线程1");
    two.start();
    ThreadTwo three = new ThreadTwo("猜题线程2");
    try {
        Thread.sleep(2000);
} catch (InterruptedException e) {
     e.printStackTrace();
}
    
three.start();

while(true){
//如果有猜对的就停止所有线程
    if(two.getGuessResult().equals("猜对了")||three.getGuessResult().equals("猜对了")){
    one.interrupt();
    two.interrupt();
    three.interrupt();
    break;
    }
}
}
}
//出题线程
class ThreadOne extends Thread{
private static int theNumber;//存放要猜的数字
public void run() {
Random random = new Random();
theNumber = random.nextInt(100);
System.out.println("出题线程出的题为："+theNumber);
}
//猜数字
public static String guessNumber(int number){
if(theNumber>number){
return "小了";
}else if(theNumber<number){
return "大了";
}else{
return "猜对了";
}
}
}
//猜题线程
class ThreadTwo extends Thread{
private String threadName;
private int minNum = 0;
private int maxNum = 100;
String guessResult = "";
public ThreadTwo(String threadName) {
this.threadName = threadName;
}
public String getGuessResult(){
return guessResult;
}
public void run() {
while(true){
try {
sleep(4000);
} catch (InterruptedException e) {
e.printStackTrace();
}
int nowNum;
Random random = new Random();
//生成最小值和最大值之间的一个数
nowNum = minNum + random.nextInt(maxNum-minNum);
//把生成的数发到出题线程上，返回结果
guessResult = ThreadOne.guessNumber(nowNum);
if(guessResult.equals("大了")){
maxNum = nowNum;
System.out.println(threadName+" 猜:"+nowNum+" "+guessResult);
}else if(guessResult.equals("小了")){
minNum = nowNum;
System.out.println(threadName+" 猜:"+nowNum+" "+guessResult);
}else{
System.out.println(threadName+" 猜对了,结果是:"+nowNum);
}
}
}
}
