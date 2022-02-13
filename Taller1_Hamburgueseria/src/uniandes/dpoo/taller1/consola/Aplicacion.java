package uniandes.dpoo.taller1.consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.ProductoMenu;
import uniandes.dpoo.taller1.modelo.Restaurante;

public class Aplicacion {
	
	
	public void mostrarMenu() {
		
				System.out.println("\n1. Mostrar el menú");
				System.out.println("2. Iniciar un nuevo pedido");
				System.out.println("3. Agregar un elemento a un pedido");
				System.out.println("4. Cerrar un pedido y guardar la factura");
				System.out.println("5. Consultar la información de un pedido dado su id");
				System.out.println("6. Salir de la aplicación");

	}
	
	public void ejecutarOpcion(int opcionSeleccionada) {
		
		if (opcionSeleccionada == 1)
			System.out.println("\n1");
		else if (opcionSeleccionada == 2) {
			String nombreCliente = input("Ingrese su nombre: "); 
			String direccionCliente = input("Ingrese su dirección: ");
			
		}    
		else if (opcionSeleccionada == 3)
			System.out.println("\n3");
		else if (opcionSeleccionada == 4)
			System.out.println("\n4");
		else if (opcionSeleccionada == 5)
			System.out.println("\n5");
		else if (opcionSeleccionada == 6)
		{
			System.out.println("Saliendo de la aplicación ... ");
		}
		else
		{
			System.out.println("Por favor seleccione una opción válida.");
		}
	}
			
		

	public static void main(String[] args) {
		
		Aplicacion consola = new Aplicacion();
		
		Restaurante restaurante = new Restaurante();
		
		boolean continuar = true;
		while (continuar == true)
		{
		
			System.out.println("\nBienvenido, las opciones del menú son: ");
			consola.mostrarMenu();
			int opcionSeleccionada = Integer.parseInt(input("\nSeleccione una opción: "));
			if (opcionSeleccionada == 6) 
			{
				continuar = false;
				System.out.println("Saliendo de la aplicación ... ");
			}
			else
			{
				consola.ejecutarOpcion(opcionSeleccionada);
			}
		}
	}

	private static String input(String stringP) {
		try
		{
			System.out.print(stringP);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

}
