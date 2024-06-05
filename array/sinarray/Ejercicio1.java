package sinarray;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		int tabla [] = new int [10];
		
		Random rand = new Random();
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rand.nextInt(1,101);
		}
		
		System.out.println(Arrays.toString(tabla));
	}

}
