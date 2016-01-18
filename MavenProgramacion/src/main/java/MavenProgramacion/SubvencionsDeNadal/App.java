package MavenProgramacion.SubvencionsDeNadal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class App {
	
	public int Pare = 0;
	public int Reis = 0;
	public int Tio = 0;
	public int Christkind = 0;
	
	
	
	public static void main( String[] args ) throws IOException    {
		String linia;
		
		
	
		BufferedReader br = new BufferedReader( new InputStreamReader(
			App.class.getResource("/SubvencionsDeNadal.txt").openStream()));
	
		while((linia = br.readLine()) != null){
		
			buscar(linia);
		}
	
    }

	// Busca usando la linea dada por el while
	public static void buscar(String linia) {
		//[^:]+: (.*?)- (.*)
		String personaInici = "([^:]+:) ";
		String resta = "(.*)";
		String regals = "(.*?)-";
		String separaGent = "([^:]+): (.*?)(- |$)";
		
		//Matcher es donde buscar y pattern es la expresión regular que busco
		Pattern p = Pattern.compile(personaInici+resta);
		Matcher m = p.matcher(linia);
		m.matches();
		
		
		
		String descarte = m.group(2);
		
		
		p = Pattern.compile(separaGent);
		m = p.matcher(descarte);
		
		//Necesito conseguir los nombres y quedarme con el resto
		while(m.find()){
			System.out.println(m.group(1));
			System.out.print("...."+m.group(2));
			System.out.println();
			//Hay que comprovar quien da el regalo y sumarle los regalos que entregue
			// (se hace contando las comas +1)
		}
		
	}
}
