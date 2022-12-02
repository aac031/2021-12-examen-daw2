package ejercicio4;

import entrada.Teclado;

public class Ejercicio4 {
	
	public static int contarEspacios(String frase) {
		int contadorEspacios = 0;
		for (int pos = 0; pos < frase.length(); pos++) {
			char caracter = frase.charAt(pos);
			if (frase.charAt(pos) == ' ') {
			contadorEspacios++;
			}
		}
		return contadorEspacios;
	}
	
	public static boolean letrasMayusculas(String mensaje) {	
		boolean todoLetrasMayusculas = true;
		for (int pos = 0; pos < mensaje.length(); pos++) {
			char caracter = mensaje.charAt(pos);
			if ((caracter >= 'a' && caracter <= 'z')) {
				todoLetrasMayusculas = false;
			}
		}
		return todoLetrasMayusculas;
	}
	
	public static String leerFraseValida(String mensaje) {
		String frase = Teclado.leerCadena(mensaje);
		int contadorEspacios = contarEspacios(frase);
		while (! letrasMayusculas(frase) || contadorEspacios != 1) {
			System.out.println("La frase no debe contener letras mayúsculas y espacios en blanco.");
			System.out.println("La frase no debe contener ningún otro carácter.");
			System.out.println();
			frase = Teclado.leerCadena(mensaje);
		}
		return frase;
	}

	public static void main(String[] args) {
		String frase = leerFraseValida("¿Frase? ");
		int desplazamiento = Teclado.leerEntero("¿Despalazamiento? ");
		final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	}

}