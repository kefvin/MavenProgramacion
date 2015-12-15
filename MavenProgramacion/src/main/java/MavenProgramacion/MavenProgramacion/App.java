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
	
	public static int Ncasa = 0;
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
    			System.out.println("0");
    			Ncasa++;
    			/* Llamar funciones como comprovarPapa 
    			 * y apartir del primer caràcter de los personajes
    			 * crear substring de la misma longitud y comparar*/
    			
    			System.out.println("Casa "+Ncasa);
    			
    			app.comprovarPapa();
    			System.out.println("1");
    			app.comprovarReno();
    			System.out.println("2");
    			app.comprovarElfo();
    			System.out.println("3");
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
		System.out.print("Papa Noel "+Cpapa);
	}
	
	public void comprovarReno(){
		Creno=0;
		String comprovaReno;
		char primerReno = reno.charAt(0);
		
		for(int i=0; i<casa.length(); i++){
			if(casa.charAt(i) == primerReno){
				comprovaReno = casa.substring(casa.charAt(i), (casa.charAt(i)+reno.length()-1));
				if(comprovaReno.equals(reno)){
					Creno++;
				}
			}
		}
		System.out.print("Reno "+Creno);
	}
	
	public void comprovarElfo(){
		Celfo=0;
		String comprovaElfo;
		char primerElfo = elfo.charAt(0);
		
		for(int i=0; i<casa.length(); i++){
			if(casa.charAt(i) == primerElfo){
				comprovaElfo = casa.substring(casa.charAt(i), (casa.charAt(i)+elfo.length()-1));
				if(comprovaElfo.equals(elfo)){
					Celfo++;
				}
			}
		}
		System.out.print("Elfo "+Celfo);
	}
	
}

