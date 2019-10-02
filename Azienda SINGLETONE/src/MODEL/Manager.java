package MODEL;

public class Manager extends Dipendenti {

	private String ResponsabilitaArea;
	
//|-----------------------------------------------------------------------------------------|
//SET METHOD
//|-----------------------------------------------------------------------------------------|
	
	public void setResponsabilitaArea(String ResponsabilitaArea)
	{
		this.ResponsabilitaArea=ResponsabilitaArea;
	}
	
//|-----------------------------------------------------------------------------------------|	
//GET METHOD
//|-----------------------------------------------------------------------------------------|
	
	public String getResponsabilitaArea()
	{
		return ResponsabilitaArea;
	}
	
//|-----------------------------------------------------------------------------------------|
//Builder
//|-----------------------------------------------------------------------------------------|	
	
	public Manager()
	{
	super();
	}
	
	public Manager(String Nome, int ID, String Cognome, int Eta, String RuoloAziendale, double Stipendio, String TitoloStudio,String ResponsabilitaArea)
	{
		super(Nome, ID, Cognome, Eta, RuoloAziendale, Stipendio, TitoloStudio);
		this.ResponsabilitaArea=ResponsabilitaArea;
	}


	
//|-----------------------------------------------------------------------------------------|
//OVERRIDE
//|-----------------------------------------------------------------------------------------|
	
	@Override//hashCode
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ResponsabilitaArea == null) ? 0 : ResponsabilitaArea.hashCode());
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
		Manager other = (Manager) obj;
		if (ResponsabilitaArea == null) {
			if (other.ResponsabilitaArea != null)
				return false;
		} else if (!ResponsabilitaArea.equals(other.ResponsabilitaArea))
			return false;
		return true;
	}

//|-----------------------------------------------------------------------------------------|	

	@Override
	public String toString() {
		return 
				"|-----------------|"+
				"\n|-- Manager --|" 
				+"\n|-----------------|" 
				+"\n - ID --> " + getID() + 
				"\n - Nome --> " + getNome() + 
				"\n - Cognome --> " + getCognome() + 
				"\n - Età --> " + getEta() + 
				"\n - RuoloAziendale --> "+ getRuoloAziendale() + 
				"\n - Stipendio --> " + getStipendio() + 
				"\n - TitoloStudio --> " + getTitoloStudio() +
				"\n - Responsabilità Area --> " + ResponsabilitaArea+
				"\n|-----------------|" ;
	}

	

	
//|-----------------------------------------------------------------------------------------|
	


	

}
