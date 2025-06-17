package es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        contoRovescia();
    }

    public static void contoRovescia() {
        Scanner intero = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int num = intero.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
