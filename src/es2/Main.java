package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------SWITCH------------------------------------------");
        numeriLettere();
    }
    public static void numeriLettere(){
        Scanner number = new Scanner(System.in);
        System.out.println("inserisci un numero compreso tra 1 e 3: ");
        int num = number.nextInt();
        switch (num) {
            case 1-> System.out.println("uno");
            case 2-> System.out.println("due");
            case 3-> System.out.println("tre");
            default -> System.out.println("il numero inserito non è compreso tra 1 e 3");
        }
        }
    }


