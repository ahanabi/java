package ryc001;

import java.util.Scanner;

public class ryc0 {

    static int f(int i) {
        if (i <= 1)
            return 1;
        else
            return i * f( i - 1 );
    }
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );

        double x, t = 1, i = 1, sum = 0;
        int sign = 1;

        x = in.nextDouble();
        do {
            t = t * x/i;
            sum += sign*t;
            sign = -sign;
            ++i;
        } while(t >= 1e-5);

        System.out.printf( "%.2f", sum );
    }
}