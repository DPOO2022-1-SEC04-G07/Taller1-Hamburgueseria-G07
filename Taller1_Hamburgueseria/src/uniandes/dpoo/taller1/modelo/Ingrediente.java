package uniandes.dpoo.taller1.modelo;

public class Ingrediente {
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private String nombre;
	
	private int costoAdicional;
	
	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	public Ingrediente(String nombre, int costoAdicional)
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	
	// ************************************************************************
	// M�todos para consultar los atributos
	// ************************************************************************
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getCostoAdicional()
	{
		return costoAdicional;
	}
	
	

}
