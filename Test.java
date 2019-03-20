package Fibonacci;

import java.util.Scanner;

public class Test {
    public static void main(String [] args){

        int a = 1;
        int b = 1;
        int n;
        int sum;
        Scanner fib = new Scanner(System.in);
        n = fib.nextInt();
        for(int i = 0; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}
