package com.cip.prog;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Miguel de Cervantes", "El Quijote de La Mancha", 2);
		Libro libro2 = new Libro("Arturo Pérez Reverte", "El Capitán Alatriste", 1);
		
		//----- EJEMPLO DE FUNCIONAMIENTO -----------------------------------------------------
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("SE REALIZAN VARIOS PRESTAMOS, 1 DE CADAS: ");
		
		if(!libro1.prestamo()) {
			System.out.println("No se pudo realizar el prestamos del libro " + libro1.getNombre());
		}

		if(!libro2.prestamo()) {
			System.out.println("No se pudo realizar el prestamos del libro " + libro2.getNombre());
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("SE REALIZA LA DEVOLUCION DE LOS LIBROS: ");
		
		if(!libro1.devolucion()) {
			System.out.println("No se pudo realizar la devolución del libro " + libro1.getNombre());
		}

		if(!libro2.devolucion()) {
			System.out.println("No se pudo realizar la devolucón del libro " + libro2.getNombre());
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("SE COMPRUEBA QUE NO SE PUDEN DEVOLVER MÁS LIBROS DE LOS EXISTENTES EN TOTAL: ");
		System.out.println("------------------------------------------------------------");
		
		if(!libro1.devolucion()) {
			System.out.println("No se pudo realizar la devolución del libro " + libro1.getNombre());
		}

		if(!libro2.devolucion()) {
			System.out.println("No se pudo realizar la devolucón del libro " + libro2.getNombre());
		}
	}

}
