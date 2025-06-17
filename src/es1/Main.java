package es1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------STRINGA PARI DISPARI------------------------------------------");
            stringaPariDispari();
        System.out.println("------------------------------ANNO BISESTILE------------------------------------------");
            annoBisestile();
        }
        public static void stringaPariDispari(){
            Scanner string = new Scanner(System.in);
            System.out.println("inserisci una parola: ");

            String str = string.nextLine();
            if(str.length() % 2 == 0){
                System.out.println("la stringa è pari");
            }else {
                System.out.println("la stringa è dispari");
            }
        }
        public static void annoBisestile(){
            int anno = 900;
            if(anno % 4 == 0 && anno % 100 == 0 && anno % 400 == 0) {
                System.out.println("l'anno "+ anno +" è bisestile");
            }else {
                System.out.println("l'anno "+ anno +" non è bisestile");
            }
        }

    }
