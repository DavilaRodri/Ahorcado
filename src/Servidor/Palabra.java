package Servidor;

import java.io.*;
/**
 * Clase que ocupa de controlar la visualizacion de la palabra
 * 
 * @version 1.0
 * @author Rodrigo Dávila y Guillermo Cortés
 * 
 */
public class Palabra 
{	
	private PrintWriter salida;
	char peliGuionLetra [];
	char almacenGeneral [];
	String peliGuion;
	String peliculaEscogida;
	String peliGuionEscogida = "";
	String[] pelicula = {"La Vida es Bella", "El Padrino", "Intocable", "La Red Social", "La lista de Schindler", "Forest Gump", "Star Wars", 
			"Cadena Perpetua", "El Lobo de Wall Street", "El Señor de los Anillos", "Avatar", "Gran Torino", "Slumdog Millonaire", "Diamantes De Sangre", 
			"Ocho Apellidos Vascos", "Invictus", "Shrek", "Lo Imposible", "La Vida De Pi", "Hotel Ruanda", "El Jardinero Fiel", "El Discurso Del Rey", 
			"Interstellar", "Million Dollar Baby", "Gladiator", "Braveheart", "Toy Story", "Regreso Al Futuro", "Indiana Jones", "Batman Begins", 
			"Infiltrados", "Terminator", "El Sexto Sentido", "El Show De Truman", "Piratas Del Caribe", "Doctor Zhivago", "Harry Potter", 
			"Jurassic Park", "Salvar Al Soldado Ryan", "Una Mente Maravillosa", "Deja Vu", "Ciudad De Dios", "Matrix", "El Rey Leon", "Eduardo Manostijeras",
			"El Pianista"};

	
	
	public Palabra(PrintWriter salida)
	{
		this.salida = salida;
		random();
	}
	
	public void random()
	{
		int peliculaRandom = (int) Math.round(Math.random() * 46 ) ;
		peliculaEscogida = pelicula[peliculaRandom];
		convertirGuion();
		
	}
	
	private void convertirGuion()
	{
		String peli = null;
		peliGuionLetra = peliculaEscogida.toCharArray();
		for (int i = 0; i < peliculaEscogida.length(); i++)
		{
			if (i == 0)
				peli = "-";
			else
			{
				if (peliGuionLetra[i] == ' ')
					peli = peli + " ";
				else 
					peli = peli + "-";
			}

		}
		peliGuion = peli;
		almacenGeneral = peliGuion.toCharArray();
	}
	
	public boolean comprobar(String letra)
	{		
		boolean acertada = false;
		
		char peliLetra [] = peliculaEscogida.toCharArray();
		for (int i = 0; i < peliculaEscogida.length(); i++)
		{
			if (letra == null)
			{
				System.exit(0);
			}
			
			if (peliLetra[i] == letra.charAt(0) || Character.toUpperCase(letra.charAt(0)) == peliLetra[i])
			{
				acertada = true;
				
				almacenGeneral[i] = Character.toUpperCase(letra.charAt(0));				
			}
					
		}
		return (acertada);
		
		
	}
	
	public void pintar()
	{
		System.out.println(peliculaEscogida);	
	}
	
	public void getpeliGuionEscogida()
	{
		for (int i = 0; i < peliculaEscogida.length(); i++)
		{
			peliGuionEscogida = peliGuionEscogida.concat(Character.toString(almacenGeneral[i]));
		}
		salida.println("01 Pelicula: " +peliGuionEscogida);
		peliGuionEscogida = "";
	}
	
	
	public boolean victoria()
	{
		boolean victoria = false;
		for (int i = 0; i < peliculaEscogida.length(); i++)
		{
			if (almacenGeneral[i] == peliculaEscogida.charAt(i) || Character.toUpperCase(almacenGeneral[i]) == Character.toUpperCase(peliculaEscogida.charAt(i)))
			{
				victoria = true;
			}
			else
			{
				victoria = false;
				break;
			}
		}
		return victoria;
	}
	
}



