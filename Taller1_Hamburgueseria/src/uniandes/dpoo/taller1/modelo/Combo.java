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
	
	public void agregarItemACombo(String ItemCombo) {
		
		String cambioNombre = nombreCombo + ItemCombo + "; ";
		
		this.nombreCombo = cambioNombre;
	
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
