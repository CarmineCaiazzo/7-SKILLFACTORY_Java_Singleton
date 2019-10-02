package MODEL;

public class Dirigente extends Manager {

	private String LivelloFunzionale;

//|-----------------------------------------------------------------------------------------|
//SET METHOD
//|-----------------------------------------------------------------------------------------|
	
	public void setLivelloFunzionale(String LivelloFunzionale)
	{
		this.LivelloFunzionale=LivelloFunzionale; 
	}																										
	
//|-----------------------------------------------------------------------------------------|
//GET METHOD
//|-----------------------------------------------------------------------------------------|
	
	public String getLivelloFunzionale()
	{
		return LivelloFunzionale;
	}
	
//|-----------------------------------------------------------------------------------------|
//Builder
//|-----------------------------------------------------------------------------------------|	
	public Dirigente()
	{
		super();
	}
	
	public Dirigente(String Nome, int ID, String Cognome, int Eta, String RuoloAziendale, double Stipendio, String TitoloStudio,String ResponsabilitaArea,String LivelloFunzionale)
	{
		super( Nome, ID, Cognome, Eta, RuoloAziendale, Stipendio, TitoloStudio, ResponsabilitaArea);
		this.LivelloFunzionale=LivelloFunzionale;
	}

//|-----------------------------------------------------------------------------------------|
//OVERRIDE
//|-----------------------------------------------------------------------------------------|	
	

	@Override//hashCode
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((LivelloFunzionale == null) ? 0 : LivelloFunzionale.hashCode());
		return result;
	}

//|-----------------------------------------------------------------------------------------|	
	
	@Override//equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dirigente other = (Dirigente) obj;
		if (LivelloFunzionale == null) {
			if (other.LivelloFunzionale != null)
				return false;
		} else if (!LivelloFunzionale.equals(other.LivelloFunzionale))
			return false;
		return true;
	}

//|-----------------------------------------------------------------------------------------|	
	
	@Override
	public String toString() {
		return 
				"|-----------------|" +
				"\n|-- Dirigente --|" 
				+"\n|-----------------|" 
				+"\n - ID --> " + getID() + 
				"\n - Nome --> " + getNome() + 
				"\n - Cognome --> " + getCognome() + 
				"\n - RuoloAziendale --> "+ getRuoloAziendale() + 
				"\n - Stipendio --> " + getStipendio() + 
				"\n - TitoloStudio --> " + getTitoloStudio() +
				"\n - Responsabilità Area --> " + getResponsabilitaArea()+
				"\n - Livello Funzionale --> "+ LivelloFunzionale+
				"\n|-----------------|" ;
	}


//|-----------------------------------------------------------------------------------------|	

	
	
}
