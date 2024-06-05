package sinarray;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double numUsuario;
		double[] tablaConNumeros = new double [5];
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0 ; i < tablaConNumeros.length ; i++) {
			System.out.println("Introduzca un número decimal");
			numUsuario = sc.nextDouble();
			tablaConNumeros[i] = numUsuario;
		}
		
		for (double numImprimir : tablaConNumeros) {
			System.out.println(numImprimir);
		}
		sc.close();

	}

}
