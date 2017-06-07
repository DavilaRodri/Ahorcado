package Servidor;

import java.io.*;;

/**
 * Clase que que se encarga de gestionar la horca
 * 
 * @version 1.0
 * @author Rodrigo Dávila y Guillermo Cortés
 * 
 */
public class Ahorcado 
{
	
	private PrintWriter salida;
	int fallo;
	
	public Ahorcado(PrintWriter salida)
	{
		this.salida = salida;
		fallo = 0;
	}
	
	
	public int getFallo()
	{
		return fallo;
	}
	
	
	
	public void incrementarFallo(boolean error)
	{
		if (error)
		{
			fallo++;
		}
		
			switch (fallo)
			{
			case 0:
				pintarhorca();
				break;
			case 1:
				fallo1();
				break;
			
			case 2:
				fallo2();
				break;
			
			case 3:
				fallo3();
				break;
			
			case 4:
				fallo4();
				break;
			
			case 5:
				fallo5();
				break;
				
			case 6:
				fallo6();
				break;
			}
			
		}
	
	public void pintarhorca()
	{
		salida.println("01 +------+");
		salida.println("01 |      |");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 +---------------");
	}
	
	private void fallo1()
	{
		salida.println("01 +------+");
		salida.println("01 |      |");
		salida.println("01 |      #");
		salida.println("01 |     (_)");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 +---------------");
	}
	
	private void fallo2()
	{
		salida.println("01 +------+");
		salida.println("01 |      |");
		salida.println("01 |      #");
		salida.println("01 |     (_)");
		salida.println("01 |     [ ]");
		salida.println("01 |     [_]");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 +---------------");
	}
	
	private void fallo3()
	{
		salida.println("01 +------+");
		salida.println("01 |      |");
		salida.println("01 |      #");
		salida.println("01 |     (_)");
		salida.println("01 |  x--[ ]");
		salida.println("01 |     [_]");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 +---------------");
	}
	
	private void fallo4()
	{
		salida.println("01 +------+");
		salida.println("01 |      |");
		salida.println("01 |      #");
		salida.println("01 |     (_)");
		salida.println("01 |  x--[ ]--x");
		salida.println("01 |     [_]");
		salida.println("01 |");
		salida.println("01 |");
		salida.println("01 +---------------");
	}
	
	private void fallo5()
	{
		salida.println("01 +------+");
		salida.println("01 |      |");
		salida.println("01 |      #");
		salida.println("01 |     (_)");
		salida.println("01 |  x--[ ]--x");
		salida.println("01 |     [_]");
		salida.println("01 |    _|");
		salida.println("01 |");
		salida.println("01 +---------------");
	}
	
	private void fallo6()
	{
		salida.println("01 +------+");
		salida.println("01 |      |");
		salida.println("01 |      #");
		salida.println("01 |     (_)");
		salida.println("01 |  x--[ ]--x");
		salida.println("01 |     [_]");
		salida.println("01 |    _| |_");
		salida.println("01 |");
		salida.println("01 +---------------");
	}


}
