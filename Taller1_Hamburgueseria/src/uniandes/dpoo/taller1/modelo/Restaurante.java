package uniandes.dpoo.taller1.modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import uniandes.dpoo.taller1.procesamiento.LoaderInformacionArchivos;

public class Restaurante {
	
	public Restaurante() {
		
		String archivoIngredientes = "./data/ingredientes.txt";
		String archivoMenu = "./data/menu.txt";
		String archivoCombos = "./data/combos.txt";
		
		cargarInformacionRestaurante(archivoIngredientes, archivoMenu, archivoCombos);
		
	
	}
	
	public void inicarPedido(String nombreCliente, String direccionCliente)
	{
		Pedido pedido = new Pedido (nombreCliente, direccionCliente);
		
	}
	
	public ArrayList<Ingrediente> getIngredientes(){
		return ingredientes
	}
	
	public void cargarInformacionRestaurante(String archivoIngredientes, String archivoMenu, String archivoCombos) {
		
		cargarIngredientes(archivoIngredientes);
		
	}
	
	private void cargarIngredientes(String archivoIngredientes) {
		
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		try
		{
			ingredientes = LoaderInformacionArchivos.leerInfoArchivoIngredientes(archivoIngredientes);
			System.out.println("OK Se cargó el archivo ingredientes.txt con información de los Ingredientes.");		
		}
		catch (Exception e)
	    {
			System.out.println("ERROR: Problema al leer el archivo menu.txt");
			System.out.println(e.getMessage());
	    }
		
	}
	
	private void CargarMenu(String archivoMenu)
	{
		// Instrucciones para realizar la lectura del archivo menu.txt.
	    // La informacion de los productos queda en el ArrayList productosMenu
	    ArrayList<ProductoMenu> productosMenu = new ArrayList<ProductoMenu>();
	    try
	    {
		productosMenu = LoaderInformacionArchivos.leerInfoArchivoProductosMenu("./data/menu.txt");
		System.out.println("OK Se cargó el archivo menu.txt con información de los Productos Menu.");
	    }
	    catch (Exception e)
	    {
		System.out.println("ERROR: Problema al leer el archivo menu.txt");
		System.out.println(e.getMessage());
	    }
	}

}
