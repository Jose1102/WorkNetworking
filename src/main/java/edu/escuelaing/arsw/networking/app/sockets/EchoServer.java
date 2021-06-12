package edu.escuelaing.arsw.networking.app.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * Esta clase es la clase Servidor de un echo
 */
public class EchoServer {
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
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						clientSocket.getInputStream()));
		String inputLine, outputLine;
		while ((inputLine = in.readLine()) != null) {
			System.out.println("Mensaje recibido: " + inputLine);
			outputLine = "Respuesta de servidor: " + inputLine ;
			out.println(outputLine);
			if (outputLine.equals("Respuesta de servidor: Bye."))
				break;
			}
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
		}
}
