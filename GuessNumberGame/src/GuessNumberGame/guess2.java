package GuessNumberGame;

import java.util.Random;
public class guess2 {
public static void main(String[] args) {
    ThreadOne one = new ThreadOne();
    one.start();
    ThreadTwo two = new ThreadTwo("�����߳�1");
    two.start();
    ThreadTwo three = new ThreadTwo("�����߳�2");
    try {
        Thread.sleep(2000);
} catch (InterruptedException e) {
     e.printStackTrace();
}
    
three.start();

while(true){
//����в¶Եľ�ֹͣ�����߳�
    if(two.getGuessResult().equals("�¶���")||three.getGuessResult().equals("�¶���")){
    one.interrupt();
    two.interrupt();
    three.interrupt();
    break;
    }
}
}
}
//�����߳�
class ThreadOne extends Thread{
private static int theNumber;//���Ҫ�µ�����
public void run() {
Random random = new Random();
theNumber = random.nextInt(100);
System.out.println("�����̳߳�����Ϊ��"+theNumber);
}
//������
public static String guessNumber(int number){
if(theNumber>number){
return "С��";
}else if(theNumber<number){
return "����";
}else{
return "�¶���";
}
}
}
//�����߳�
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
//������Сֵ�����ֵ֮���һ����
nowNum = minNum + random.nextInt(maxNum-minNum);
//�����ɵ������������߳��ϣ����ؽ��
guessResult = ThreadOne.guessNumber(nowNum);
if(guessResult.equals("����")){
maxNum = nowNum;
System.out.println(threadName+" ��:"+nowNum+" "+guessResult);
}else if(guessResult.equals("С��")){
minNum = nowNum;
System.out.println(threadName+" ��:"+nowNum+" "+guessResult);
}else{
System.out.println(threadName+" �¶���,�����:"+nowNum);
}
}
}
}
