package MODEL;

public class Dipendenti {

	private int ID;
	private String Nome;
	private String Cognome;
	private int Eta;
	private String RuoloAziendale;
	private double Stipendio;
	private String TitoloStudio;
	
//|-----------------------------------------------------------------------------------------|
//SET METHOD
//|-----------------------------------------------------------------------------------------|
	
	public void setNome(String Nome)
	{
		this.Nome=Nome;
	}
	
	public void setID(int ID)
	{
		this.ID=ID;
	}
	
	public void setCognome(String Cognome)
	{
		this.Cognome=Cognome;
	}
	
	public void setEta(int Eta)
	{
		this.Eta=Eta;
	}
	
	public void setRuoloAziendale(String RuoloAziendale)
	{
		this.RuoloAziendale=RuoloAziendale;
	}
	
	public void setStipendio(double Stipendio)
	{
		this.Stipendio=Stipendio;
	}
	
	public void setTitoloStudio(String TitoloStudio)
	{
		this.TitoloStudio=TitoloStudio;
	}

//|-----------------------------------------------------------------------------------------|	
//GET METHOD
//|-----------------------------------------------------------------------------------------|
	
	public String getNome()
	{
		return Nome;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getCognome()
	{
		return Cognome;
	}
	
	public int getEta()
	{
		return Eta;
	}
	
	public String getRuoloAziendale()
	{
		return RuoloAziendale;
	}
	
	public double getStipendio()
	{
		return Stipendio;
	}
	
	public String getTitoloStudio()
	{
		return TitoloStudio;
	}

//|-----------------------------------------------------------------------------------------|
//Builder
//|-----------------------------------------------------------------------------------------|	
	
	public Dipendenti()
	{
		super(); //SUPERFLUO
	}

	Dipendenti(String Nome, int ID, String Cognome, int Eta, String RuoloAziendale, double Stipendio, String TitoloStudio)
	{
		this.Nome=Nome;
		this.ID=ID;
		this.Cognome=Cognome;
		this.Eta=Eta;
		this.RuoloAziendale=RuoloAziendale;
		this.Stipendio=Stipendio;
		this.TitoloStudio=TitoloStudio;
	}


//|-----------------------------------------------------------------------------------------|
//OVERRIDE
//|-----------------------------------------------------------------------------------------|
	
	@Override//hashCode
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((RuoloAziendale == null) ? 0 : RuoloAziendale.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Stipendio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((TitoloStudio == null) ? 0 : TitoloStudio.hashCode());
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
		Dipendenti other = (Dipendenti) obj;
		if (RuoloAziendale == null) {
			if (other.RuoloAziendale != null)
				return false;
		} else if (!RuoloAziendale.equals(other.RuoloAziendale))
			return false;
		if (Double.doubleToLongBits(Stipendio) != Double.doubleToLongBits(other.Stipendio))
			return false;
		if (TitoloStudio == null) {
			if (other.TitoloStudio != null)
				return false;
		} else if (!TitoloStudio.equals(other.TitoloStudio))
			return false;
		return true;
	}

//|-----------------------------------------------------------------------------------------|	

	@Override
	public String toString() {
		return 
				"|-----------------|"+
				"\n|-- Dipendenti --| "
				+"\n|-----------------|"
				+"\n - ID --> " + ID + 
				" \n - Nome --> " + Nome + 
				" \n - Cognome --> " + Cognome + 
				" \n - Eta --> " + Eta + 
				" \n - RuoloAziendale --> "+ RuoloAziendale + 
				" \n - Stipendio --> " + Stipendio + 
				" \n - TitoloStudio --> " + TitoloStudio+
				"\n|-----------------|" ;
				
	}

//|-----------------------------------------------------------------------------------------|
	

}

	
	
	
	

