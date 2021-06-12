package edu.escuelaing.arsw.networking.app.url;

import java.net.MalformedURLException;
import java.net.URL;
/**
 * Esta clase nos provee información de una variable tipo URL
 * @author Jose Maria Castro Ortega
 * @author Daniel Benavides
 *
 */
public class Url {
	public static  URL link ;
	/**
	 * Constructor de la clase Url 
	 * @throws MalformedURLException
	 */
	public Url() throws MalformedURLException {
		URL linked = new URL("https://campusvirtual.escuelaing.edu.co:80/moodle/course/view.php?id=2660#arsw");
		link = linked;
	}
	
	/**
	 * 
	 * @param args que son los argumentos de la clase main
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws MalformedURLException {
		URL linkPersonal = new URL("https://campusvirtual.escuelaing.edu.co:80/moodle/course/view.php?id=2660#arsw");
		link = linkPersonal;
		System.out.println("Authority : " + authority(linkPersonal));
		System.out.println("Host : " + getHost(linkPersonal));
		System.out.println("Port : " + getPort(linkPersonal));
		System.out.println("Path : " + getPath(linkPersonal));
		System.out.println("Query : " + getQuery(linkPersonal));
		System.out.println("File : " + getFile(linkPersonal));
		System.out.println("Ref : " + getRef(linkPersonal));	
	}
	/**
	 * Esta clase retorna el authority de una url
	 * @param  url de tipo URL que es la variable a leer 
	 * @return authority de tipo String
	 */
	public static  String authority(URL url) {
		String authority = "";
		authority = url.getAuthority();
		return authority;
	} 
	/**
	 * Esta clase retorna el host de una url
	 * @param  url de tipo URL que es la variable a leer 
	 * @return host de tipo String
	 */
	public static String getHost(URL url) {
		String host = "";
		host = url.getHost();
		return host;
	} 
	/**
	 * Esta clase retorna el port de una url
	 * @param  url de tipo URL que es la variable a leer 
	 * @return port de tipo String
	 */
	public static int getPort(URL url) {
		int port ;
		port = url.getPort();
		return port;
	} 
	/**
	 * Esta clase retorna el path de una url
	 * @param  url de tipo URL que es la variable a leer 
	 * @return path de tipo String
	 */
	public static String getPath(URL url) {
		String path = "";
		path = url.getPath();
		return path;
	} 
	/**
	 * Esta clase retorna el query de una url
	 * @param  url de tipo URL que es la variable a leer 
	 * @return query de tipo String
	 */
	public static String getQuery(URL url) {
		String query = "";
		query = url.getQuery();
		return query;
	} 
	/**
	 * Esta clase retorna el file de una url
	 * @param  url de tipo URL que es la variable a leer 
	 * @return file de tipo String
	 */
	public static String getFile(URL url) {
		String file = "";
		file = url.getFile();
		return file;
	}
	/**
	 * Esta clase retorna el ref de una url
	 * @param  url de tipo URL que es la variable a leer 
	 * @return ref de tipo String
	 */
	public static String getRef(URL url) {
		String ref = "";
		ref = url.getRef();
		return ref;
	} 
}
