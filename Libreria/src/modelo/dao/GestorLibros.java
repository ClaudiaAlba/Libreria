package modelo.dao;

import java.util.ArrayList;

import modelo.entidad.Genero;
import modelo.entidad.Libro;
import modelo.util.Util;

public class GestorLibros {
	
	private ArrayList< Libro> listaLibros;
	
	public GestorLibros() {
		listaLibros = new ArrayList<Libro>();
	}
	
	public void agregarLibro(Libro nuevoLibro) {
		listaLibros.add(nuevoLibro);
	}
	
	public void borrarLibro(Libro libro) {
		listaLibros.remove(libro);
	}
	
	public Libro buscarLibro(int id) {
		for (Libro libro : listaLibros) {
			if (libro.getId() == id) {
				return libro;
			}
		}
		return null;
	}
	
	public void editarLibro(Libro libroAntiguo, Libro libroNuevo) {
		listaLibros.set(listaLibros.indexOf(libroAntiguo), libroNuevo);
	}
	
	public static Libro crearSitio(String nombre, String descripcion,
			String valor, Genero genero) {
		if (Util.validarValor(valor)) {
			return new Libro(nombre, descripcion, Double.parseDouble(valor), genero);
		}
		return null;
	}
	
	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}
}
