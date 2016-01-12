package MavenProgramacion.SubvencionsDeNadal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class App {
	
	public static void main( String[] args ) throws IOException
    {
		String linia;
		String nenMolestes = "^\\w+:";
		String personatje = "(.*):";
		String seguent = "-";
		
	
		BufferedReader br = new BufferedReader( new InputStreamReader(
			App.class.getResource("/SubvencionsDeNadal.txt").openStream()));
	
		while((linia = br.readLine()) != null){
		
			buscar()
	}
	
	
	
    }
}
