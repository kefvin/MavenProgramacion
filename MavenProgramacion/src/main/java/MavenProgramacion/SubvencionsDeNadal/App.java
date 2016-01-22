package MavenProgramacion.SubvencionsDeNadal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class App {
	
	
	public static Map<String,Personatjes> personatjesMap = new HashMap<String,Personatjes>();
	public static int total = 0;
	
	public static void main( String[] args ) throws IOException    {
		String linia;
		
	
		BufferedReader br = new BufferedReader( new InputStreamReader(
			App.class.getResource("/SubvencionsDeNadal.txt").openStream()));
	
		while((linia = br.readLine()) != null){
		
			buscar(linia);
		}
		

		for (String key : personatjesMap.keySet()) {
			Personatjes nom = personatjesMap.get(key);
			System.out.print(nom.getNom()+": "+nom.getRegals()*100/total+"% ");
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
			if(personatjesMap.containsKey(m.group(1))){
				
				int quantitat=comptarRegals(m.group(2));
				String nomPersonatge = m.group(1).trim();
				
				Personatjes pe = personatjesMap.get(nomPersonatge);
				pe.setRegals(quantitat);
				total = total + quantitat + 1;
			}else{
				personatjesMap.put(m.group(1), new Personatjes(m.group(1)));
				int quantitat=comptarRegals(m.group(2));
				
				Personatjes pe = personatjesMap.get(m.group(1));
				pe.setRegals(quantitat);
				total = total + quantitat + 1;
			}
			
		}
		
	}

	private static int comptarRegals(String regals) {
		Pattern coma = Pattern.compile(",");
		Matcher match = coma.matcher(regals);
		int encontrados = 0;
		
		while(match.find()){
			encontrados++;
		}
		return encontrados;
	}
}
