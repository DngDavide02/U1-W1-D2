package es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        stringaInCaratteri();
    }

    public static void stringaInCaratteri() {
        Scanner scanner = new Scanner(System.in);
        String str;

        while (true){
            System.out.print("Scrivi una stringa (digita ':q' per uscire): ");
            str = scanner.nextLine();

            if(str.equals(":q")){
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                if (i < str.length() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
            }
        scanner.close();
        }
    }
