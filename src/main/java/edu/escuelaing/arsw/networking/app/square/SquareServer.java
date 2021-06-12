package edu.escuelaing.arsw.networking.app.square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * Este es el servidor que calcular el cuadrado de un número
 * @author Jose Maria Castro Ortega
 * @author Daniel Benavides
 *
 */
public class SquareServer {
	/**
	 * 
	 * @param args que son los argumentos que le ingresa a la clase main
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(35000);
		} catch (IOException e) {
			System.err.println("Could not listen on port: 35000.");
			System.exit(1);
		}
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("Accept failed.");
			System.exit(1);
		}
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String inputLine;
		String outputLine= "" ;

		while ((inputLine = in.readLine()) != null) {
			if (inputLine.equals("Bye.")) {
				System.out.println("Se cerró el servidor");
				outputLine = "Respuesta de servidor: se cerró el servidor";
				out.println(outputLine);
				
				break;
			}
			String valor = operation(inputLine,outputLine);
			out.println(valor);
		}

		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
	/**
	 * Esta clase realiza el cuadrado de un número
	 * @param inputLine es un String que es el número 
	 * @param outputLine es un String 
	 * @return outputLine que es una String con la operación realizada
	 */
	public static String operation(String inputLine, String outputLine) {
		int inputInt = Integer.parseInt(inputLine);
		int resultado = inputInt * inputInt;
		System.out.println("Mensaje recibido: " + resultado);
		outputLine = "Respuesta de servidor: " + resultado;
		
		return outputLine;
		
	}

}
