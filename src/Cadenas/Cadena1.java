package Cadenas;

import java.util.Scanner;

public class Cadena1 {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Escribe una xcadena de texto:");
        String s = in.nextLine().toLowerCase();
    	int contadorA = 0;
    	int contadorE = 0;
    	int contadorI = 0;
    	int contadorO = 0;
    	int contadorU = 0;
    	for (int i = 0; i<s.length(); i++) {
    		if(c =='a' || c == 'a') {
    			contadorA++;
    			break;
    	    case 'a';
    		case 'á';
    }
    		if(s.charAt(i)=='e') {
    			contadorE++;
    			
    		}
    		if(s.charAt(i)== 'i') {
    			contadorI++;
    		}
    		if(s.charAt(i)=='o') {
    			contadorO++;
    			
    		}
    		if(s.charAt(i)=='u') {
    			contadorU++;
    		}
    		
    	}
    	System.out.println("El numero de vocales a =" + contadorA);
    	System.out.println("El numero de vocales e =" + contadorE);
    	System.out.println("El numero de vocales i =" + contadorI);
    	System.out.println("El numero de vocales o =" + contadorO);
    	System.out.println("El numero de vocales u =" + contadorU);
    }
}
