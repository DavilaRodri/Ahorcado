package Servidor;

import java.io.*; 
import java.net.*;

public class Servidor 
{

	public static void main(String[] args) throws IOException 
	{
		try
		{
			ServerSocket serv = new ServerSocket(12334, 5);
			
			while (true)
			{
			
				Socket c = serv.accept();
				//Esto va en el cliente y en el servidor.
				PrintWriter salida = new PrintWriter(c.getOutputStream(), true);
				BufferedReader entrada = new BufferedReader(new InputStreamReader(c.getInputStream()));
				
				new JuegoAhorcado().ejecutar(salida, entrada);
				
				entrada.close();
				salida.close();
				c.close();
			}
		}
		
		catch(IOException e)
		{
			System.err.println(e);
		}
		
		catch(SecurityException e)
		{
			System.err.println(e);
		}
		
	}

}
