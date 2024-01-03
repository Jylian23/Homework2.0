 package org.example;

 public class LengthCheck {

     public static void main(String[] args) {

         String measured = "This is my test String.";

         String[] testStr = measured.split("[\\s ]");

         System.out.print("My first string length is:");
         System.out.print(testStr.length);
         System.out.print(" words long.");

    }
}
