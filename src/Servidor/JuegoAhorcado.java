package Servidor;
import java.io.*;

/**
 * Clase que inicia la aplicación y gestiona el Juego
 * 
 * @version 1.0
 * @author Rodrigo Dávila y Guillermo Cortés
 * 
 */

public class JuegoAhorcado {
	
	private Palabra palabra;
	private Ahorcado ahorcado;
	String letra;
	String nombre;
	String miPeli;
	
	
	public JuegoAhorcado()
	{
	}
	
	public void ejecutar(PrintWriter salida, BufferedReader entrada)
	{
		try
		{
			
			salida.println("01 Bienvenido al juego del ahorcado");
			salida.println("01 Descubre la película");
			salida.println("02 ¿Como te llamas?");
			nombre = entrada.readLine();
			System.out.println("El jugador se llama: " +nombre);
			
			ahorcado = new Ahorcado(salida);
			ahorcado.pintarhorca();
			palabra = new Palabra(salida);
						
				do
				{
					System.out.println("La pelicula a buscar es: ");
					palabra.getpeliGuionEscogida();
					palabra.pintar();
					salida.println("02 Elige una letra: ");
					letra = entrada.readLine();
					System.out.println("Letra escogida: " +letra);
					boolean acertada = palabra.comprobar(letra);
					if (acertada == false)
					{
						salida.println("\n01 Letra no encontrada! Estás mas cerca de que te ahorquen");
						ahorcado.incrementarFallo(true);
					}

					else if (acertada == true)
					{
						salida.println("\n01 Letra encontrada!");
						ahorcado.incrementarFallo(false);
					}
					
					
					if(palabra.victoria())
					{
						palabra.getpeliGuionEscogida();
						salida.println("01 Numero de fallos: " +ahorcado.getFallo());
						salida.println("03 HAS GANADO!");
					}
				}
				
			
				while(ahorcado.getFallo() != 6);
				{
					palabra.getpeliGuionEscogida();
					salida.println("03 HAS PERDIDO!");
				}
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
			
			
	}

		
}
