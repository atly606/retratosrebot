package Cadenas;

import java.util.Scanner;

public class Cadena3 {
	 public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		   do {
		   System.out.println("Escribe la primera cadena:");
		   String s1 = in.nextLine();
		   while (s1.length() > 0);
		   do {
		   System.out.println("Escribe la segunda cadena:");
		   String s2 = in.nextLine();
		   while (s2.length() == 0 || s2.length() > s1.length());
		  	   
		   }		   
}
	 }
	 }
