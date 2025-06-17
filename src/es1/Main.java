package es1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------STRINGA PARI DISPARI------------------------------------------");
            stringaPariDispari();
        System.out.println("------------------------------ANNO BISESTILE------------------------------------------");

        System.out.println(annoBisestile(900));
        System.out.println(annoBisestile(400));
        System.out.println(annoBisestile(1900));
        System.out.println(annoBisestile(2020));
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
    public static boolean annoBisestile(int anno) {
        
        if ((anno % 4 == 0) && ((anno % 100 != 0) || (anno % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }


}
