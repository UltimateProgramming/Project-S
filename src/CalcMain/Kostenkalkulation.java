package CalcMain;

import java.util.Scanner;

public class Kostenkalkulation {
  public static void main(String[] args) {
    double fixKosten = 0;
    double varKosten = 0;
    int personen = 0;
    double properson = 0;
    int programmstatus = 0;
    int abfrage = 0;
    Scanner tastatur = new Scanner(System.in);
    try{
      while (programmstatus <3) { 
        
        
        switch (programmstatus) {
          case 0 : 
            System.out.println("Bitte gib die Fixkosten ein.");
            fixKosten = tastatur.nextDouble();
            programmstatus++;
            break;
          case 1 : 
            System.out.println("Bitte gib die variablen Kosten (pro Person) ein.");
            varKosten = tastatur.nextDouble();
            programmstatus++;
            break;
          case 2 :
            System.out.println("Bitte gib die Anzahl der Personen ein");
            personen = tastatur.nextInt();
            properson = (fixKosten + (varKosten * personen)) / personen;
            System.out.println("Die Fixkosten betragen " + fixKosten + " Euro.");
            System.out.println("Die variablen Kosten betragen " + varKosten + " Euro.");
            System.out.println("Es werden " + personen + " Personen erwartet.");
            System.out.println("Sind die Angaben korrekt ? ja=1 / nein=0");
            abfrage = tastatur.nextInt();
            if (abfrage == 0) {
              System.out.println("Bitte Angaben wiederholen");
              programmstatus = 0;
              } else {
              
                System.out.println("Die Kosten pro Person betragen " + properson + " Euro.");
                  System.out.println("Soll eine weitere Berechnung durchgeführt werden? ja=1 / nein=0");
                  abfrage = tastatur.nextInt();
                if (abfrage == 1) {
                  programmstatus = 0;
                  } else {
                programmstatus++;
                  } // end of if-else
                  }
                break;
                  default: 
              } // end of while
            }
              } catch (java.util.InputMismatchException e)
              {
              System.out.println("falsches Datenformat");
              }
              } // end of main
                
              } // end of class Kostenkalkulation
                
