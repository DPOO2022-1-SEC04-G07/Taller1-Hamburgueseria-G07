package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;


import uniandes.dpoo.taller1.procesamiento.LoaderInformacionArchivos;

public class Restaurante {
	
	private ArrayList<Ingrediente> ingredientes;
	
	private ArrayList<ProductoMenu> productosMenu;
	
	private ArrayList<Combo> combos;
	
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
	
	public ArrayList<ProductoMenu> getMenuBase(){
		
		return productosMenu;
		
	}
	
	
	public ArrayList<Ingrediente> getIngredientes(){
		
		return ingredientes;
		
	}
	
	
	public void cargarInformacionRestaurante(String archivoIngredientes, String archivoMenu, String archivoCombos) {
		
		cargarIngredientes(archivoIngredientes);
		cargarMenu(archivoMenu);
		///cargarCombos(archivoCombos, productosMenu);
		
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
		
		this.ingredientes = ingredientes;
	}
	
	private void cargarMenu(String archivoMenu)
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
	    
	    this.productosMenu = productosMenu;
	}

	private void cargarCombos(String archivoCombos, ArrayList<ProductoMenu> productosMenu) {
		// Instrucciones para usar la lectura del archivo combos.txt
	    // La informacion de los combos queda en el ArrayList combos
	    ArrayList<Combo> combos = new ArrayList<Combo>();
	    try
	    {
	    	combos = LoaderInformacionArchivos.leerInfoArchivoCombos("./data/combos.txt", productosMenu);
	    	System.out.println("OK Se cargó el archivo combos.txt con información de los Combos.");
	    }
	    catch (Exception e)
	    {
	    	
	    	System.out.println("ERROR: Problema al leer el archivo combos.txt");
	    	System.out.println(e.getMessage());
		
	    }
	    this.combos = combos;
	}
}
