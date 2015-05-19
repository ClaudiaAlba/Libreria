package modelo.dao;

import modelo.entidad.Libro;

public class GestorLibreria {
	
	private GestorLibros gestorLibros;
	private GestorClientes gestorClientes;
	
	public GestorLibreria() {
		gestorClientes = new GestorClientes();
		gestorLibros = new GestorLibros();
	}
	
	public Libro getLibroMasCaro() { 
		Libro libroCaro = gestorLibros.getListaLibros().get(0);
		for (int i = 1; i <  gestorLibros.getListaLibros().size(); i++) {
			if(gestorLibros.getListaLibros().get(i).getValor() > libroCaro.getValor()) {
				libroCaro = gestorLibros.getListaLibros().get(i);
			}
		}
		
		return libroCaro;
	}
	
	public Libro getLibroMasEconomico() { 
		Libro libroEconomico = gestorLibros.getListaLibros().get(0);
		for (int i = 1; i <  gestorLibros.getListaLibros().size(); i++) {
			if(gestorLibros.getListaLibros().get(i).getValor() < libroEconomico.getValor()) {
				libroEconomico = gestorLibros.getListaLibros().get(i);
			}
		}
		
		return libroEconomico;
	}
	
	public Libro getLibroMasVendido() { 
		Libro libroVendidoMas = gestorLibros.getListaLibros().get(0);
		for (int i = 1; i <  gestorLibros.getListaLibros().size(); i++) {
			if(gestorLibros.getListaLibros().get(i).getNumeroVentas() >
					libroVendidoMas.getNumeroVentas()) {
				libroVendidoMas = gestorLibros.getListaLibros().get(i);
			}
		}
		
		return libroVendidoMas;
	}
	
	public Libro getLibrMenosVendido() { 
		Libro libroVendidoMenos = gestorLibros.getListaLibros().get(0);
		for (int i = 1; i <  gestorLibros.getListaLibros().size(); i++) {
			if(gestorLibros.getListaLibros().get(i).getNumeroVentas() <
					libroVendidoMenos.getNumeroVentas()) {
				libroVendidoMenos = gestorLibros.getListaLibros().get(i);
			}
		}
		
		return libroVendidoMenos;
	}

}
