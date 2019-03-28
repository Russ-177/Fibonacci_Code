package PerfectNumber;

import java.util.Scanner;

public class PerfectNumber1 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
        {
            Scanner reader = new Scanner(System.in);
            int number = 0;
            int divisor = 1;

            System.out.println("Введите число");
            number = reader.nextInt();

            for(divisor = 1; divisor < number; divisor++)
            {
                isDivisor(number, divisor);
                if(isDivisor(number, divisor) == true)
                {
                    System.out.println(divisor);
                }
            }
        }
    }

    static boolean isDivisor(int number, int divisor)
    {
        if (number % divisor == 0)
            return true;
        else
            return false;
    }
}
