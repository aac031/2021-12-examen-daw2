package ejercicio_3;

import entrada.Teclado;

public class Ejercicio3 {

	public static void escribirMenuOpciones() {
		System.out.println("(0) Salir del programa.");
		System.out.println("(1) Leer por teclado un n�mero v�lido.");
		System.out.println("(2) Visualizar en consola el n�mero.");
		System.out.println("(3) Sumar el n�mero m�s otro n�mero.");
		System.out.println("(4) Determinar si el n�mero es mayor que otro n�mero.");

	}

	public static Numero leerNumeroValido() {
		int num;
		Numero numero;
		num = Teclado.leerEntero("�Numero Entero? ");
		while (! Numero.validar(num)) {
			System.out.println("El n�mero entero no es v�lido.");
			num = Teclado.leerEntero("�Numero Entero? ");
		}
		numero = new Numero(num);
		return numero;
	}

	public static void main(String[] args) {
		int opcion;
		Numero numero = null;
		Numero otroNumero = null;

		do {
			escribirMenuOpciones();
			opcion = Teclado.leerEntero("�Opci�n (0-8)? ");
			System.out.println();
			switch(opcion) {
			case 0:
				System.out.println("Ha salido del programa.");
				break;
			case 1:
				numero = leerNumeroValido();
				System.out.println("Se ha creado un n�mero v�lido.");	
				System.out.println();
				break;
			case 2:
				if (numero == null) {
					System.out.println("No existe ning�n racional v�lido.");
					System.out.println();
				}
				else {
					System.out.println(numero.obtenerEstado());
					System.out.println();
				}
				break;
			case 3:
				if (numero == null) {
					System.out.println("No existe ning�n racional v�lido creado.");
					System.out.println();
				}
				else {
					otroNumero = new Numero();
					System.out.println("Se ha creado un n�mero aleatorio.");
					System.out.println(numero.obtenerEstado() + " + ");
					System.out.println(otroNumero.obtenerEstado() + " = ");
					numero.sumar(otroNumero);
					System.out.println(numero.obtenerEstado());
					System.out.println();
				}
				break;
			case 4:
				if (numero == null) {
					System.out.println("No existe ning�n racional v�lido creado.");
					System.out.println();
				}
				else {
					otroNumero = new Numero();
					System.out.println("Se ha creado un n�mero aleatorio.");
					System.out.println(numero.obtenerEstado() + " es mayor que ");
					System.out.println(otroNumero.obtenerEstado() + " ? ");
					numero.esMayorQue(otroNumero);
					System.out.println(numero.obtenerEstado());
					System.out.println();
				}
				break;
			default:
				System.out.println("La opci�n de men� debe estar comprendida entre 0 y 4.");
				break;
			}

		}

		while (opcion != 0);

	}

}