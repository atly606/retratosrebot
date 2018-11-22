package EjerciciosArray;
import java.util.Random;
import java.util.Scanner;

public class SegunEjercicio {

	Scanner in = new Scanner(System.in);
	int n;
	do {
		System.out.println("Tamaño del vector (entre 10 y 1.000.000): ");
		n = in.nextInt();
		if (n < 10 || n > 1000000)
			System.out.println("Tamaño incorrecto, tiene que estar comprendido entre 10 y 1.000.000");
	} while (n < 10 || n > 1000000);
	int [] vector = new int[n];
	Random r = new Random();
	long t0 = System.nanoTime();
	for (int i=0; i<n; i++) {
		int valor;
		do {
			valor = r.nextInt(2000000) - 999999;
		} while (repetido(vector, valor, i - 1));
		vector[i] = valor;
	}
	
	void tiempoTranscurrido("Tiempo empleado en crear el vector", System.nanoTime() - t0);
	
	t0 = System.nanoTime();
	
	int mayor = vector[0];
	int menor = vector[0];
	
	for(int i = 1; i < vector.length; i++) {
		if(menor > vector [i])
			menor = vector [i];
		if(mayor< vector [i])
			mayor = vector [i]; 
	}
	System.out.println("Número mayor= " + mayor);
	System.out.println("Número menor= " + menor);
	System.out.println("Diferencia = " + (mayor - menor));
			
	tiempoTranscurrido("Tiempo empleado en calcular la diferencia entre el mayor y el menor", System.nanoTime() - t0);
}

static boolean repetido(int [] vector, int valor, int p) {
	for (int i=0; i<=p; i++) {
		if (vector[i] == valor) {
			return true;
		}
	}
	return false;
}

static void tiempoTranscurrido(String msg, long t) {
	long m = t / 60000000000L;
	t = t % 60000000000L;
	long s = t / 1000000000L;
	t = t % 1000000000L;
	System.out.print(msg + ": ");
	System.out.println(m + "m " + s + "s " + t + "ns");
}

}
}