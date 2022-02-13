package uniandes.dpoo.taller1.consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import uniandes.dpoo.taller1.modelo.Combo;
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
	
	public void ejecutarOpcion(int opcionSeleccionada, ArrayList<Ingrediente> ingredientes, ArrayList<ProductoMenu> productosMenu, ArrayList<Combo> combos) {
		
		if (opcionSeleccionada == 1) {
			System.out.println("\nProductos:");
			Iterator<ProductoMenu> iterator = productosMenu.iterator();
			while (iterator.hasNext())
			{
				ProductoMenu productoMenu = iterator.next();
				String nombre = productoMenu.getNombre();
				System.out.println(nombre);
			}
			
			System.out.println("\nCombos:");
			Iterator<Combo> iterator2 = combos.iterator();
			while(iterator2.hasNext())
			{
				Combo combo = iterator2.next();
				String nombre2 = combo.getNombre();
				System.out.print(nombre2+"\n");
			}
			
			System.out.println("\nAdiciones:");
			Iterator<Ingrediente> iterator3 = ingredientes.iterator();
			while(iterator3.hasNext())
			{
				Ingrediente ingrediente = iterator3.next();
				String nombre3 = ingrediente.getNombre();
				System.out.println(nombre3);
			}
			
		}
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
		
		ArrayList<Ingrediente> ingredientes = restaurante.getIngredientes();
		ArrayList<ProductoMenu> productosMenu = restaurante.getMenuBase();
		ArrayList<Combo> combos = restaurante.getCombos();
		
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
				consola.ejecutarOpcion(opcionSeleccionada,ingredientes, productosMenu, combos);
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
