package uniandes.dpoo.taller1.modelo;

public class Pedido {
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private static int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;

	// ************************************************************************
	// Constructores
	// ************************************************************************
	
	public Pedido(String nombreCliente, String direccionCliente)
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	
	public int getIdPedido() {
		
		return idPedido;
		
	}

}
