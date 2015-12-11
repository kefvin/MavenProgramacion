package MavenProgramacion.MavenProgramacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.Reader;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	//FileReader fr = new FileReader("/home/alumne1daw/git/MavenProgramacion/MavenProgramacion/src/main/resources/MonAscii.txt");
    	
    	
    	
    	String casa;
    	String papa = "*<]:-DOo";
    	String reno = ">:o)";
    	String elfo = "<]:-D";
    	
    	try{
    		BufferedReader br = new BufferedReader(new InputStreamReader(
        			App.class.getResource("/MonAscii.txt").openStream()));
    		
    		while((casa = br.readLine()) != null) { 
    			/* Llamar funciones como comprovarPapa 
    			 * y apartir del primer caràcter de los personajes
    			 * crear substring de la misma longitud y comparar*/
    		}
    	}catch(Exception e){
    		
    	}
    	
    }
}
