 package org.example;

 import java.util.Scanner;

 public class EqualHeights {

     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         System.out.println("What's the highest peak that you've climbed?");
         String yourPeak = scan.nextLine();

         String myPeak = "Ararat";
         System.out.println("Mine is Ararat. Are they the same high?" );

         System.out.println(yourPeak.equals(myPeak));

    }
}
