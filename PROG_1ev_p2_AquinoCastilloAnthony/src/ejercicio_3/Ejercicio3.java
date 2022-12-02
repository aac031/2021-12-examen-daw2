package ejercicio_3;

import entrada.Teclado;

public class Ejercicio3 {

	public static void escribirMenuOpciones() {
		System.out.println("(0) Salir del programa.");
		System.out.println("(1) Leer por teclado un número válido.");
		System.out.println("(2) Visualizar en consola el número.");
		System.out.println("(3) Sumar el número más otro número.");
		System.out.println("(4) Determinar si el número es mayor que otro número.");

	}

	public static Numero leerNumeroValido() {
		int num;
		Numero numero;
		num = Teclado.leerEntero("¿Numero Entero? ");
		while (! Numero.validar(num)) {
			System.out.println("El número entero no es válido.");
			num = Teclado.leerEntero("¿Numero Entero? ");
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
			opcion = Teclado.leerEntero("¿Opción (0-8)? ");
			System.out.println();
			switch(opcion) {
			case 0:
				System.out.println("Ha salido del programa.");
				break;
			case 1:
				numero = leerNumeroValido();
				System.out.println("Se ha creado un número válido.");	
				System.out.println();
				break;
			case 2:
				if (numero == null) {
					System.out.println("No existe ningún racional válido.");
					System.out.println();
				}
				else {
					System.out.println(numero.obtenerEstado());
					System.out.println();
				}
				break;
			case 3:
				if (numero == null) {
					System.out.println("No existe ningún racional válido creado.");
					System.out.println();
				}
				else {
					otroNumero = new Numero();
					System.out.println("Se ha creado un número aleatorio.");
					System.out.println(numero.obtenerEstado() + " + ");
					System.out.println(otroNumero.obtenerEstado() + " = ");
					numero.sumar(otroNumero);
					System.out.println(numero.obtenerEstado());
					System.out.println();
				}
				break;
			case 4:
				if (numero == null) {
					System.out.println("No existe ningún racional válido creado.");
					System.out.println();
				}
				else {
					otroNumero = new Numero();
					System.out.println("Se ha creado un número aleatorio.");
					System.out.println(numero.obtenerEstado() + " es mayor que ");
					System.out.println(otroNumero.obtenerEstado() + " ? ");
					numero.esMayorQue(otroNumero);
					System.out.println(numero.obtenerEstado());
					System.out.println();
				}
				break;
			default:
				System.out.println("La opción de menú debe estar comprendida entre 0 y 4.");
				break;
			}

		}

		while (opcion != 0);

	}

}