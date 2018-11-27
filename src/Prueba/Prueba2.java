package Prueba;

import java.util.Random;

public class Prueba2 {
  public static void main(String[] args) {
	  Random r = new Random();
	  int [][] matriz;
	  matriz = new int[7][5];
	  for(int i=0; i<7; i++)
		  for (int j=0; j<5; j++)
			  matriz[i][j] = r.nextInt(100);
	  
	  for (int i=0; i<7; i++)
		  for (int j=0; j<5; j++)
			  System.out.println(matriz[i][j]);
  }
}
