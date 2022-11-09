package SWP_RubnS_Sepetavc;

import java.util.Scanner;

public class SummenfunktionIterativ{

    static int calcSum(int x){
        int sum=0;
        while(x>0){
            sum+=x;
            x--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Summenfunktion:");
        System.out.println("===============");
        System.out.print("Zahl: ");
        int x = reader.nextInt();

        System.out.printf("Ergebnis: %d", calcSum(x));
    }
}