package praksa;

import java.util.ArrayList;
import java.util.Comparator;
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
			System.out.println("Ime osobe: "+ o.getName() + " i ukupan broj poruka: " + brojac);
	}
	// Pretraziti sve poruke jedne osobe za happy i sad smajlice
				
			for(Osoba o : osobe) {
			int countHappy=0;
			int countSad=0;
						
			for(String s : o.getSadrzajPoruka()){
				
				if(s.matches(Emoji.happy.getEmoji())) 
				countHappy++;
				if(s.matches(Emoji.sad.getEmoji()))
				countSad++;		
				
			}
			o.setCountHappy(countHappy);
			o.setCountSad(countSad);

			// Obavestenje koliko je sad i happy svaki karakter
				if (countSad>countHappy) 
						System.out.println( o.getName() + " is more sad than happy." +  "Happy emoji: " + o.getCountHappy() + " Sad messages " + o.getCountSad());
					else 
						System.out.println( o.getName() + " is more happy than sad." + "Happy messages: " + o.getCountHappy() + " Sad messages " + o.getCountSad());
					
				  		}
			
			
			// Obavestenje ko je najtuznija a ko najsrecnija osoba, konvertovanjem liste osoba u  tok , a zatim se koristi Stream().max ili Stream().min metod koji prihvata Comparator 
			//za upoređivanje objekata na osnovu vrednosti polja getCountHappy i vraća onaj objekat koji sadrži maksimalan ili minimalan getCountHappy u toku
				Osoba o1 = osobe.stream()
                        .min(Comparator.comparingInt(Osoba::getCountHappy))
                        .get();
				Osoba o2 = osobe.stream()
                .max(Comparator.comparingInt(Osoba::getCountHappy))
                .get();
			
				System.out.println("Najtuznija osoba je: " + o1.getName());
				System.out.println("Najsrecnija osoba je: " + o2.getName());
			
			
	          		
			
			// Obavestenje da li je Daenerys poslala vise loving poruka od Jon-a ili obrnuto
				for(Osoba o : osobe) {
				int countInLoveDaenerys=0;
				int countInLoveJon=0;
				for(String s : o.getSadrzajPoruka()){
				if (o.getName().contains("Daenerys"))
						 if (s.matches(Emoji.inLove.getEmoji())) 
							countInLoveDaenerys++;
				if(o.getName().contains("Jon")) 
					if (s.matches(Emoji.inLove.getEmoji()))
							countInLoveJon++;}
				
				if (o.getName().contains("Daenerys")) 
					System.out.println( "Daenerys je poslala "   + countInLoveDaenerys + " loving poruke Jon-u.");
				else if(o.getName().contains("Jon")) 
					System.out.println("Jon je poslao " + countInLoveJon + " loving poruka Daenerys");}
			
			}
		
	
	}
		
			
			

		
		
		
			
			
	
			
			