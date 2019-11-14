/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.11.2019
  * @author 
  */
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
    
    while (programmstatus <3) {
      try{         
        switch (programmstatus) {
          case 0 : 
            System.out.println("Bitte gib die Fixkosten ein.");
            fixKosten = tastatur.nextDouble();
            programmstatus = 1;
            break;
          case 1 : 
            System.out.println("Bitte gib die variablen Kosten (pro Person) ein.");
            varKosten = tastatur.nextDouble();
            programmstatus++;
            break;
          case 2 :                                                                      
            System.out.println("Bitte gib die Anzahl der Personen ein");
            personen = tastatur.nextInt();
            if (personen <= 0){
              throw new ArithmeticException();
            }
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
        }
      } catch (java.util.InputMismatchException b)
      {
        System.out.println("falsches Datenformat");
        tastatur.next();
      } catch (ArithmeticException e)
      {
        if (personen < 0) {
          System.out.println("Für die Anzahl der Personen wird eine positive ganze Zahl erwartet.");
        } 
        if (personen == 0) {
          System.out.println("Division durch 0. Die Anzahl der Personen darf nicht null betragen");
        }       
      }
    } // end of while
  } // end of main
    
} // end of class Kostenkalkulation
              
