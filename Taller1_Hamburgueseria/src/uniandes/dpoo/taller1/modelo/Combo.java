package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Combo implements Producto{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private double descuento;
	
	private String nombreCombo;
	
	private ArrayList<ProductoMenu> productosMenu;
	
	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	public Combo(String nombreCombo ,double descuento)
	{
		
		this.nombreCombo = nombreCombo;
		this.descuento = descuento;
		ArrayList<ProductoMenu> productosMenu = new ArrayList<ProductoMenu>();
		this.productosMenu = productosMenu;
		
	}
	
	// ************************************************************************
	// Métodos para consultar los atributos
	// ************************************************************************
	
	public String getNombre() {
		
		return nombreCombo;
	}
	
	public void agregarItemACombo(ProductoMenu ItemCombo) {
		
		ArrayList<ProductoMenu> lista = productosMenu;
		lista.add(ItemCombo);
		this.productosMenu = lista;
		
	
	}
	
	public ArrayList<ProductoMenu> getProductosMenu()
	{
		return productosMenu;
	}
	
	public int getPrecio() {
		
		double suma = 0;
		
		Iterator<ProductoMenu> iterador = productosMenu.iterator();
		while(iterador.hasNext() == true)
		{
			ProductoMenu productoMenu = iterador.next();
			double precio = productoMenu.getPrecio() * descuento;
			
			suma = suma + precio;
		}
		
		return (int)suma;
		
	}
		
	public String generarTextoFactura()
	{
		return nombreCombo + ": " + Integer.toString(getPrecio());
	}
		
}
