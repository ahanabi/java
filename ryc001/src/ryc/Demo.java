package ryc;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int oper1 = 0;   
        int oper2 = 0;      
        Scanner s = new Scanner( System.in );
        try {
            System.out.print( "请输入被除数:" );
            oper1 = s.nextInt();
            System.out.print( "请输入除数:" );
            oper2 = s.nextInt();
            System.out.println( "计算结果：" + oper1 / oper2 );
        } catch (ArithmeticException e2) {
            System.out.println( "异常1:除数为零!，请重新输入除数" );
            oper2 = s.nextInt();
            System.out.println( "计算结果：" + oper1 / oper2 );
        } catch (InputMismatchException e1) {
            System.out.println( "异常2:输入不为数字!,请重新输入" );
            System.out.print( "请输入被除数:" );
            String a = s.next();
            oper1 = s.nextInt();
            System.out.print( "请输入除数:" );
            oper2 = s.nextInt();
            System.out.println( "计算结果：" + oper1 / oper2 );
        }

        finally {
            System.out.println( "程序结束" );
        }
    }
}