package MavenProgramacion.SubvencionsDeNadal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class App {
	
	public static int Pare = 0;
	public static int Reis = 0;
	public static int Tio = 0;
	public static int Christkind = 0;
	
	/*Map< String,joguina> joguinesMap = new HashMap<String,joguina>();
if(joguinesMap.containsKey(regal))
joguinesMap.put(regal, objecte);*/
	
	/*public static Map< String,personatjes> personatjesMap = new HashMap<String,personatjes>();*/
	
	
	public static void main( String[] args ) throws IOException    {
		String linia;
		
	
		BufferedReader br = new BufferedReader( new InputStreamReader(
			App.class.getResource("/SubvencionsDeNadal.txt").openStream()));
	
		while((linia = br.readLine()) != null){
		
			buscar(linia);
		}
		
		int total = Pare+Reis+Tio+Christkind;
		
		
		System.out.println("Pare Noel: "+Pare*100/total+"% Tió: "+Tio*100/total+"% Tres reis: "+Reis*100/total
				+"% Christkind: "+(float)Christkind/total*100+"%");
	
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
			switch (m.group(1)){
			case "Pare Noel": int quantitat1=comptarRegals(m.group(2)); Pare+=quantitat1+1; break;
			case "Tió": int quantitat2=comptarRegals(m.group(2)); Tio+=quantitat2+1; break;
			case "Tres reis": int quantitat3=comptarRegals(m.group(2)); Reis+=quantitat3+1; break;
			case "Christkind": int quantitat4=comptarRegals(m.group(2)); Christkind+=quantitat4+1; break;
			
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
