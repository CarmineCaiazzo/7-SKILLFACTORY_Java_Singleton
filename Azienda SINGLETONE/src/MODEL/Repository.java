package MODEL;

import java.util.*;

public class Repository {
			
	private ArrayList<Dipendenti> a; 
	
	private static Repository Instance;
	
	public static Repository getInstance() //CONTROLLO ARRAY VUOTO/PIENO.
	{
		if(Instance==null)
		{
			Instance = new Repository();
		}
		return Instance;
	}
	
	
	private Repository() 
	{
		a=new ArrayList<Dipendenti>();
	}
	
	
	public  ArrayList<Dipendenti> getArrayList()
	{
		a=new ArrayList<Dipendenti>();
		return a;
	}
	
//INSERISCI 
	
	public  void setDipendente(Dipendenti d)
	{
		a.add(d);
	}

//STAMPA
	
	public  ArrayList<Dipendenti> StampaArray(Dipendenti d)
	{
		return a;
	}

	public Dipendenti getDipendente(int i)
	{
		return a.get(i);
	}
	

	public ArrayList<Dipendenti> getDipendenti()
	{
		return a;
	}
	
	
	

}
