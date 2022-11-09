package SWP_RubnS_Sepetavc;

import java.util.Scanner;

public class SummenfunktionRekursion{

    static int calcSum(int x){
        if(x>0) {
            return x + calcSum(x - 1);
        }
        return 0;
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