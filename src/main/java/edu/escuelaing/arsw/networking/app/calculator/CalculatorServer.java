package edu.escuelaing.arsw.networking.app.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Esta clase es el servidor de la calculadora trigonom�trica
 * @author Jose Maria Castro Ortega
 * @author Daniel Benavides
 *
 */
public class CalculatorServer {
	
	public static String[] parts = null;
	public static String part1 = "cos";
	/**
	 * 
	 * @param args que son los argumentos de la clase main
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
			String valor = operation(inputLine, outputLine);
			if (inputLine.equals("Bye.")) {
				
				outputLine = "Respuesta de servidor: se cerr� el servidor" ;
				out.println(valor);
				
				break;
			}
			out.println(valor);
		}
		System.out.println("Cerrando el servidor");
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
	
	/**
	 * Esta clase realiza las operaciones trigonom�tricas
	 * @param inputLine es un String que es el n�mero tipo string o operaci�n a realizar
	 * @param outputLine es un String 
	 * @return outputLine que es una String con la operaci�n realizada
	 */
	public static String operation(String inputLine, String outputLine) {
		outputLine = "";
	
		System.out.println("Mensaje recibido: " + inputLine);
		
		if (inputLine.contains(":")) {
			parts = inputLine.split(":");
			part1 = parts[1];
			outputLine = "Modificando operaci�n";
		} else if (!inputLine.contains(":")) {
			Double inputCal = Double.parseDouble(inputLine);
			double b = Math.toRadians(inputCal);
			double total = 0;

			if (part1.equals("sin")) {
				total = Math.sin(b);
			} else if (part1.equals("cos")) {
				total = Math.cos(b);
			}
			else if (part1.equals("tan")) {
				total = Math.tan(b);
			}
			outputLine = "Respuesta de servidor: " + part1 + " " + total;
		}
		return outputLine;
	}
}


