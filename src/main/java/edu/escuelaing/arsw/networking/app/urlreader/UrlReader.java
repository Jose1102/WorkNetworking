package edu.escuelaing.arsw.networking.app.urlreader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlReader {
	private static final int PI = 0;

	// Desarrollado en conjunto con el profesor
		public static void main(String[] args) throws Exception {
			
			String sCarpAct = System.getProperty("user.dir");
			//File carpeta = new File(sCarpAct);
			String a =  "\\";
			String myString = sCarpAct.replace(a,"/");
			myString = myString+"/WWW/resultado.html";
			
			System.out.println(myString);
			 
			
			FileWriter archive = new FileWriter(myString);
			
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

	        System.out.println("Por favor ingrese la URL a agregar");//Se pide un dato al usuario

	        String nombreUrl = br.readLine(); //Se lee el nombre con readLine() que retorna un String con el dato

	        URL urlFile = new URL(nombreUrl);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlFile.openStream()))) {
				String inputLine = null;
				while ((inputLine = reader.readLine()) != null) {
					System.out.println(inputLine);
					archive.write(inputLine);
				}
			} catch (IOException x) {
				System.err.println(x);
			}


		}
			
}
