package Cliente;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente 
{

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		String mensaje = "";
		String nombre;
		
		try
		{
			Socket s = new Socket("localhost", 12334);
			PrintWriter salida = new PrintWriter(s.getOutputStream(), true);
			BufferedReader entrada = new BufferedReader (new InputStreamReader(s.getInputStream()));
			
			do
			{
				mensaje = entrada.readLine();
				if (mensaje.startsWith("01"))
				{
					System.out.println(mensaje);
				}
				else if (mensaje.startsWith("02"))
				{
					System.out.println(mensaje);
					nombre = teclado.nextLine();
					salida.println(nombre);
				}

				else if (mensaje.startsWith("03"))
				{
					System.out.println(mensaje);
				}
				
				
			}
			while(!mensaje.startsWith("03"));
			
			teclado.close();
			salida.close();
			entrada.close();
			s.close();
		}
		
		catch(Exception e)
		{
			
		}
	}

}
