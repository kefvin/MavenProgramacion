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
public class App{
	
	public static String casa;
	public static final String papa = "*<]:-DOo";
	public static int Cpapa;
	public static final String reno = ">:o)";
	public static int Creno;
	public static final String elfo = "<]:-D";
	public static int Celfo;
	
    public static void main( String[] args ) throws IOException
    {
    	//FileReader fr = new FileReader("/home/alumne1daw/git/MavenProgramacion/MavenProgramacion/src/main/resources/MonAscii.txt");
    	App app = new App();
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(
    			App.class.getResource("/MonAscii.txt").openStream()));
    	
    	try{
    		while((casa = br.readLine()) != null) { 
    			/* Llamar funciones como comprovarPapa 
    			 * y apartir del primer caràcter de los personajes
    			 * crear substring de la misma longitud y comparar*/
    			app.comprovarPapa();
    		}
    	}catch(Exception e){
    		System.out.println(e);
    	}finally{
    		br.close();
    	}
    	
    }
    
	public void comprovarPapa(){
		Cpapa=0;
		String comprovaPapa;
		char primerPapa = papa.charAt(0);
		
		for(int i=0; i<casa.length(); i++){
			if(casa.charAt(i) == primerPapa){
				comprovaPapa = casa.substring(casa.charAt(i), (casa.charAt(i)+papa.length()-1));
				if(comprovaPapa.equals(papa)){
					Cpapa++;
				}
			}
			
		}
		
	}
}

