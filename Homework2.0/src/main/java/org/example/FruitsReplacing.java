 package org.example;

 import java.util.Scanner;

 public class FruitsReplacing {

     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         String fruit = ("Hello. Did you know that my favorite fruit  is apple?");
         System.out.println(fruit);

         System.out.println("What is your favorite fruit?");
         String newFruit = scan.nextLine();

         String fixedFruit = fruit.replace("apple" , newFruit);

         System.out.println(fixedFruit);





    }
}
