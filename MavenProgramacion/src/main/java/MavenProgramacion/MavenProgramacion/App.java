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

	public static boolean gion = true;
	public static String casa;
	public static final String papa = "*<]:-DOo";
	public static final String reno = ">:o)";
	public static final String elfo = "<]:-D";
	public static int Cuenta;
	
	
    public static void main( String[] args ) throws IOException
    {
    	//FileReader fr = new FileReader("/home/alumne1daw/git/MavenProgramacion/MavenProgramacion/src/main/resources/MonAscii.txt");
    	App app = new App();
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(
    			App.class.getResource("/MonAscii.txt").openStream()));
    	
    	String papa = "*<]:-DOo";
    	String reno = ">:o)";
    	String elfo = "<]:-D";
    	
    	
    	try{
    		while((casa = br.readLine()) != null) { 
    			
    			/* Llamar funciones como comprovarPapa 
    			 * y apartir del primer caràcter de los personajes
    			 * crear substring de la misma longitud y comparar*/
    			
    			
    			app.buscarAscii(papa,"Papa Noel");
    			app.buscarAscii(reno, "Reno");
    			app.buscarAscii(elfo, "Elfo");
    			
    			System.out.println();
    		}
    	}catch(Exception e){
    		System.out.println(e);
    	}finally{
    		br.close();
    	}
    	
    }
    
	public void buscarAscii(String buscar, String quien){
		
		Cuenta=0;
		int comprova=0;
		
			while(comprova!=-1){
				comprova = casa.indexOf(buscar, comprova);
				
					
					if(comprova!=-1){
						Cuenta++;
						comprova+=1;
						gion = false;
					}
			}
		
		if(gion==false){
			System.out.print(quien+" ("+Cuenta+") ");
			gion = true;
		}else if(quien.equals("Elfo")){
			System.out.print("-");
		}
	}
	
}

