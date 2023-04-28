package praksa;

import java.util.ArrayList;
import java.util.List;



public class NizOsoba {
	
	
	List<Osoba>osobe=new ArrayList<Osoba>(); // kreiranje niza tj liste osoba
	
	String podaci = FileHelper.loadMetaData();
	
	// regularni izraz za odvajanje posebnih linija teksta
	String[] pomocna = podaci.split("\\r?\\n|\\r");{
	
	for(int i = 1; i < pomocna.length; i++) {
		
	String[] ostatak = pomocna[i].split(",");// odvajanje podataka u nizu stringova, koji su odvojeni zarezom
	
	String name= ostatak[0].trim(); // izdvajanje stringa na nultom indeksu za ime osobe
	
	String allegiance=ostatak[1].trim(); // izdvajanje stringa na indeksu 1 za allegiance
	
	String MessageLogNo=ostatak[2].trim(); // izdvajanje stringa sa indeksom 2 za MessageLogNo
	Osoba os= new Osoba(); // kreiranje objekta klase Osoba i postavljanje imena, allegiance i MessageLogNo koji su izdvojeni iz procitanog stringovnog niza
	os.setName(name);
	os.setAllegiance(allegiance);
	os.setMessageLogNo(MessageLogNo);
	
	if(!osobe.contains(os))
		osobe.add(os); // popunjavanje niza osoba
	
	
	}//ispis Dany
	for(Osoba o : osobe) {
		    if(o.getName().contains("Daenerys"))
					System.out.println("Poruke od Daenerys: " + o.getSadrzajPoruka());
	}
	//Broj poruka koje je svaka osoba poslala
	for(Osoba o : osobe) {
	int brojac=0;
			for(int i = 1; i < o.getSadrzajPoruka().size(); i++) {
				if (o.getSadrzajPoruka().get(i).trim().isEmpty()) {
				continue;}
				else
				brojac++;
	}
			System.out.println("Ime osobe: "+ o.getName() + " i broj poruka: " + brojac);
	}
	// Pretraziti sve poruke jedne osobe za happy, sad i InLove smajlice
				
			for(Osoba o : osobe) {
			int countHappy=0;
			int countSad=0;
			int countInLove=0;
			
			
			for(String s : o.getSadrzajPoruka()){
			
				if(s.matches(Emoji.happy.getEmoji())) 
				countHappy++;
				if(s.matches(Emoji.sad.getEmoji()))
				countSad++;		
				if(s.matches(Emoji.inLove.getEmoji())) 
				countInLove++;}
				if (countSad>countHappy) 
						System.out.println( o.getName() + " is more sad than happy.");
					else 
						System.out.println( o.getName() + " is more happy than sad.");
				// Obavestenje koliko je sad i happy svaki karakter
					}
		}
			
			
}
		
		
		
			
			
	
			
			