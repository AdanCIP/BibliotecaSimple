package com.cip.prog;

public class Libro {
	//----- ATRIBUTOS -------------------------
	private String autor;
	private String nombre;
	private int num_ejemplares;
	private int num_totales;
	
	//----- CONSTRUCTOR -----------------------
	public Libro(String autor, String nombre, int num_ejemplares) {
		this.autor = autor;
		this.nombre = nombre;
		this.num_ejemplares = num_ejemplares;
		this.num_totales = num_ejemplares;
	}

	//----- GETTER - SETTER -------------------
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum_ejemplares() {
		return num_ejemplares;
	}

	public void setNum_ejemplares(int num_ejemplares) {
		this.num_ejemplares = num_ejemplares;
	}
	
	//----- MÉTODOS -----------------------------
	
	public String toString() {
		return nombre + ", " + autor + " (" + num_ejemplares + " ejemplares).";
	}
	
	public boolean prestamo() {
		if (num_ejemplares < 1) {
			return false;
		} else {
			num_ejemplares--;
			return true;
		}
	}
	
	public boolean devolucion() {
		if (num_totales == num_ejemplares) {
			return false;
		} else {
			num_ejemplares++;
			return true;
		}
	}
	
	

}
