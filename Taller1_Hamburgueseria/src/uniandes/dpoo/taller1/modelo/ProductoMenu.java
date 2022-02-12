package uniandes.dpoo.taller1.modelo;

public class ProductoMenu  implements Producto{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private String nombre;
	
	private int precioBase;
	
	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	public ProductoMenu(String nombre, int precioBase)
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	// ************************************************************************
	// Métodos para consultar los atributos
	// ************************************************************************
	
	public String getNombre() {
		
		return nombre;
	}
	
	
	public int getPrecio() {
		
		return precioBase;
		
	}
	
	

}
