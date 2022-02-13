package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;

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
		
		String[] partes = nombreCombo.split(":");
		
		String[] partes2 = partes[1].split(";");
		
		for (int i=0; i<partes2.length;i++)
		{
			System.out.println(partes2[i]);
		}
		
		
		
		
		
	}
}
