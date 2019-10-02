package VIEW;

import java.util.*;
import MODEL.*;

public class View {

	Scanner s=new Scanner(System.in);
		
//INSERISCI
	
	public void Inserisci(Dipendenti d)
	{
		if(d instanceof Dirigente)
		{
			Dirigente other=(Dirigente)d;//CAST
			
			other.setID(leggiIntero("Inserisci ID Dirigente: "));
			other.setNome(leggiStringa("Inserisci Nome Dirigente: "));
			other.setCognome(leggiStringa("Inserisci Cognome Dirigente: "));
			other.setEta(leggiIntero("Inserisci Età Dirigente: "));
			other.setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale Dirigente: "));
			other.setTitoloStudio(leggiStringa("Inserisci Titolo di Studio Dirigente: "));
			other.setStipendio(leggiIntero("Inserisci Stipendio Dirigente: "));
			other.setResponsabilitaArea(leggiStringa("Inserisci Area di Responsabilità Dirigente"));
			
			
		}		
		else if(d instanceof Manager)
		{
			Manager other=(Manager)d;//CAST
			
			other.setID(leggiIntero("Inserisci ID Manager: "));
			other.setNome(leggiStringa("Inserisci Nome Manager: "));
			other.setCognome(leggiStringa("Inserisci Cognome Manager: "));
			other.setEta(leggiIntero("Inserisci Età Manager: "));
			other.setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale Manager: "));
			other.setTitoloStudio(leggiStringa("Inserisci Titolo di Studio Manager: "));
			other.setStipendio(leggiIntero("Inserisci Stipendio Manager: "));
			other.setResponsabilitaArea(leggiStringa("Inserisci Area di Responsabilità Manager: "));
			
		}
		else
		{
			d.setID(leggiIntero("Inserisci ID Dipendente: "));
			d.setNome(leggiStringa("Inserisci Nome Dipendente: "));
			d.setCognome(leggiStringa("Inserisci Cognome Dipendente: "));
			d.setEta(leggiIntero("Inserisci Età Dipendente: "));
			d.setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale Dipendente: "));
			d.setTitoloStudio(leggiStringa("Inserisci Titolo di Studio Dipendente: "));
			d.setStipendio(leggiIntero("Inserisci Stipendio Dipendente: "));
			
		}
		
	}

//STAMPA NORMALE

	public void Stampa(ArrayList<Dipendenti> a)
	{
			for(int i=0; i<a.size(); i++)
			{
				System.out.println(a.get(i));
			}
	}
	
//STAMPA VERTICALE
	public void stampaSchede(ArrayList<Dipendenti> a)
	{
		for(int i=0; i<a.size(); i++)
		{
			if(a.get(i) instanceof Dirigente)
			{
				Dirigente other=(Dirigente)a.get(i);
				
				System.out.println("DIRIGENTE");
				System.out.println("|------------------|");
				
				System.out.println(" ID --> " + other.getID());
				System.out.println(" Nome --> " + other.getNome());
				System.out.println(" Cognome --> " + other.getCognome());
				System.out.println(" Età --> " + other.getEta());
				System.out.println(" Ruolo Aziendale --> " + other.getRuoloAziendale());
				System.out.println(" Titolo Di Studio -->"  + other.getTitoloStudio());
				System.out.println(" Stipendio --> " + other.getStipendio());
				System.out.println(" Area Responsabilità --> " + other.getResponsabilitaArea());
				System.out.println("  Livello Funzionale --> " + other.getLivelloFunzionale());			
			}
			else if(a.get(i) instanceof Manager)
			{
				Manager other=(Manager)a.get(i);
				
				System.out.println("MANAGER");
				System.out.println("|------------------|");
				
				System.out.println(" ID -->" + other.getID());
				System.out.println(" Nome -->" + other.getNome());
				System.out.println(" Cognome -->" + other.getCognome());
				System.out.println(" Età -->" + other.getEta());
				System.out.println(" Ruolo Aziendale -->" + other.getRuoloAziendale());
				System.out.println(" Titolo Di Studio -->" + other.getTitoloStudio());
				System.out.println(" Stipendio -->" + other.getStipendio());
				System.out.println(" Area Responsabilità -->" + other.getResponsabilitaArea());
			}
			else
			{
				Dipendenti other=(Dipendenti)a.get(i);
				
				System.out.println("DIPENDENTE");
				System.out.println("|------------------|");
				
				System.out.println(" ID -->" + other.getID());
				System.out.println(" Nome -->" + other.getNome());
				System.out.println(" Cognome -->" + other.getCognome());
				System.out.println(" Età -->" + other.getEta());
				System.out.println(" Ruolo Aziendale -->" + other.getRuoloAziendale());
				System.out.println(" Titolo Di Studio -->" + other.getTitoloStudio());
				System.out.println(" Stipendio -->" + other.getStipendio());
			}
		}
	}
	
//|-------------------------------------------------------|	
//OTHER
//|-------------------------------------------------------|	
	
	
//MENU'
	
	public void StampaMenu()
	{
		System.out.println("Benvenuto nella Creazione del Database del Personale Aziendale!!");
		System.out.println("|--------------------------------------------------------------|");
		System.out.println("1 - Inserisci Dirigente");
		System.out.println("2 - Inserisci Manager");
		System.out.println("3 - Inserisci Dipendente");
		System.out.println("4 - Esci");
		System.out.println("|--------------------------------------------------------------|");		
	}
//LEGGI STRINGA
	
	public String leggiStringa(String s2)
	{
		System.out.println(s2);
		return s.nextLine();
		
	}
	
//LEGGI INTERO
			
	public int leggiIntero(String s1)
		{
			System.out.println(s1);
				
			boolean flag;
			int N=0;
			do {
					
				flag=false;
					
					try 
					{
						N=Integer.parseInt(s.nextLine());
					}catch(NumberFormatException e)
					{
						System.out.println("ERRORE!! Inserire un Numero: ");
							flag=true;
					}
						
			}while(flag);
				
			return N;
		}
			
//LEGGI DOUBLE	
		public double leggiDouble(String s2)
		{
			System.out.println(s2);
				
			boolean flag;
			double N=0;
			
			do {
				
				flag=false;
					
					try 
					{
						N=Double.parseDouble(s.nextLine());
					}catch(NumberFormatException e)
					{
						System.out.println("ERRORE!! Inserire un Numero: ");
						flag=true;
					}
						
			}while(flag);
				
			return N;
				
	
		}
}
