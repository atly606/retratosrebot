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
		for (int i = 0; i < s.length(); i++) {
//			char c = palabra.charAt(i);
//			if (c == 'a' || c == '�') 
//				contadorA++;
//       	else if (c == 'e' || c == '�')
//			     contadorE++;
//		    else if (c == 'i' || c == '�')
//			     contadorI++;
//		    else if (c == 'o' || c == '�')
//			     contadorO++;
//		    else if (c == 'u' || c == '�' || c == '�')
//			contadorU++;
			switch (s.charAt(i)) {
			case 'a':
			case '�':
				contadorA++;
				break;
			case 'e':
			case '�':
				contadorE++;
				break;
			case 'i':
			case '�':
				contadorI++;
				break;
			case 'o':
			case '�':
				contadorO++;
				break;
			case 'u':
			case '�':
			case '�':
				contadorU++;
				break;
			}

		}
		System.out.println("El numero de vocales a =" + contadorA);
		System.out.println("El numero de vocales e =" + contadorE);
		System.out.println("El numero de vocales i =" + contadorI);
		System.out.println("El numero de vocales o =" + contadorO);
		System.out.println("El numero de vocales u =" + contadorU);
	}
}
