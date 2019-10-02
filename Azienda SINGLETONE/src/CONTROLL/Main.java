package CONTROLL;
import VIEW.*;
import MODEL.*;

public class Main {

	public static void main(String[] args) {
		
		View v=new View();
		
		Dipendenti d;
		Manager m;
		Dirigente dir;
		int risposta=0;
		Repository i=Repository.getInstance();

		do {
			
		v.StampaMenu();
		int scelta=v.leggiIntero("Scegli il tipo di Dipendente da creare: ");
		
		switch(scelta)
		{		
		case 1:	
			dir=new Dirigente();
			v.Inserisci(dir);
			i.setDipendente(dir);
			break;
		case 2:	
			m=new Manager();
			v.Inserisci(m);
			i.setDipendente(m);			
			break;
		case 3:
			d=new Dipendenti();
			v.Inserisci(d);
			i.setDipendente(d);
			break;
		case 4:System.out.println("Sei Uscito dal Programma!! UWU");//FARE METODO
			break;
			
		default:
			break;
					
		}
		
		risposta=v.leggiIntero("Scegli la Prossima Operazione da Eseguire: |-- 1° Stampa -- 2° Inserisci Nuovo Dipendente --| ");
		}while(risposta == 2);
		
		v.stampaSchede(i.getDipendenti());
		
		
	}

}
