package ejercicio_3;

import java.util.Random;

public class Numero {
	private int num;
	private int centena;
	private int decena;
	private int unidad;

	public Numero(int num) {
		int centena;
		int decena;
		int unidad;

		centena = (num % 1000)/100;
		decena = (num % 100)/10;
		unidad = num % 10;

		this.centena = centena;
		this.decena = decena;
		this.unidad = unidad;

	}
	
	public Numero() {
		
		Random aleatorio = new Random();
		this.num = aleatorio.nextInt(751) + 251;
		int centena;
		int decena;
		int unidad;

		centena = (num % 1000)/100;
		decena = (num % 100)/10;
		unidad = num % 10;

		this.centena = centena;
		this.decena = decena;
		this.unidad = unidad;
		
	}

	public static boolean validar(int num) {
		if (num >= 0 && num <= 999) {
			return true;
		}
		else {
			return false;
		}
	}

	public String obtenerEstado() {

		return "Número [Centena = " + centena + ", Decena = " + decena + ", Unidad = " + unidad + "]";   
	}
	
	public void sumar(Numero otro) {
		this.centena = this.centena + otro.centena;
		this.decena = this.decena + otro.decena;
		this.unidad = this.unidad + otro.unidad;
	}
	
	public boolean esMayorQue(Numero otro) {
		boolean mayorQue = false;
		if (this.centena > otro.centena && this.decena > otro.decena && this.unidad > otro.unidad) {
			mayorQue = true;
		}
		return mayorQue;
	}

}
