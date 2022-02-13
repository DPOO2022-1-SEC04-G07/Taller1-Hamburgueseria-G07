package uniandes.dpoo.taller1.modelo;

public class Pedido {
	
	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	private static int numeroPedidos = 0;
	
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
		Pedido.numeroPedidos = numeroPedidos + 1;
		this.idPedido = numeroPedidos * 13;
		
	}
	
	public int getIdPedido() {
		
		return idPedido;
		
	}

}
