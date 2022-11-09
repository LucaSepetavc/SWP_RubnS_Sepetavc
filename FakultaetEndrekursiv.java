package SWP_RubnS_Sepetavc;

import java.util.Scanner;

public class FakultaetEndrekursiv {

    static int calcFakultaet(int x, int y){
        if(y == 0) {
            return x;
        }
        return calcFakultaet(x*y, y-1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Fakultät:");
        System.out.println("=========");
        System.out.print("Zahl: ");
        int y = reader.nextInt();

        System.out.printf("Ergebnis: %d", calcFakultaet(1, y));
    }
}
