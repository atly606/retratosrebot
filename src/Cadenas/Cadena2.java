package Cadenas;

import java.util.Scanner;

public class Cadena2 {
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Escribe una cadena de texto:");
	   String s = in.nextLine();
	   for (int i = s.length() - 1; i >= 0; i--);
	      System.out.print(s.charAt(1));
   }
}
