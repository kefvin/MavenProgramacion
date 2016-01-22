package MavenProgramacion.SubvencionsDeNadal;

public class Personatjes {
	
	String nom="";
	int regals = 0;
	
	public Personatjes(String nom){
		this.nom=nom;
	}
	
	
	@Override
	public String toString() {
		return "Personatjes [nom=" + nom + ", regals=" + regals + "]";
	}


	public void setRegals(int quantitat){
		regals = regals + quantitat + 1;
	}
	
	public int getRegals(){
		return regals;
	}
	
	public String getNom(){
		return nom;
	}
	
	
	
	
	
	
	
	
	
}
