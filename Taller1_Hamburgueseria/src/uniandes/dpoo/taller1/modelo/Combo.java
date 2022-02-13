package uniandes.dpoo.taller1.modelo;

public class Combo implements Producto{
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private double descuento;
	
	private String nombreCombo;
	
	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	public Combo(String nombreCombo ,double descuento)
	{
		this.nombreCombo = nombreCombo;
		this.descuento = descuento;
	}
	
	// ************************************************************************
	// Métodos para consultar los atributos
	// ************************************************************************
	
	public String getNombre() {
		
		return nombreCombo;
	}
	
	public void agregarItemACombo(Producto ItemCombo) {
		
		String cambioNombre = nombreCombo + 
		
		
	}
	
	public int getPrecio() {
		
	}
}
