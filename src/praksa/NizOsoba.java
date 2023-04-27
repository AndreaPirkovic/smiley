package praksa;
import java.util.LinkedList;



public class NizOsoba {
	
	
	LinkedList<Osoba>osobe=new LinkedList<Osoba>(); // kreiranje niza tj liste osoba
	
	String podaci = FileHelper.loadMetaData();
	
	// regularni izraz za odvajanje posebnih linija teksta
	String[] pomocna = podaci.split("\\r?\\n|\\r");{
	
	for(int i = 1; i < pomocna.length; i++) {
		
	String[] ostatak = pomocna[i].split(",");// odvajanje podataka u nizu stringova, koji su odvojeni zarezom
	
	String name= ostatak[0]; // izdvajanje stringa na nultom indeksu za ime osobe
	
	String allegiance=ostatak[1]; // izdvajanje stringa na indeksu 1 za allegiance
	
	String MessageLogNo=ostatak[2]; // izdvajanje stringa sa indeksom 2 za MessageLogNo
	Osoba os= new Osoba(); // kreiranje objekta klase Osoba i postavljanje imena, allegiance i MessageLogNo koji su izdvojeni iz procitanog stringovnog niza
	os.setName(name);
	os.setAllegiance(allegiance);
	os.setMessageLogNo(MessageLogNo);
	
	if(!osobe.contains(os))
		osobe.add(os); // popunjavanje niza osoba
	
	}}
		
			// Pretraziti sve poruke jedne osobe za happy, sad i InLove smajlice
			int countHappy=0;
			int countSad=0;
			int countInLove=0;
			int brojac=0;{
			
			for(int i=0;i<osobe.size();i++) {
			if(osobe.get(i).getMessageLogNo().contains(Emoji.happy.getEmoji())) {
				countHappy++;}
			if(osobe.get(i).getMessageLogNo().contains(Emoji.sad.getEmoji())) {
								countSad++;}		
			if(osobe.get(i).getMessageLogNo().contains(Emoji.inLove.getEmoji())) {
				countInLove++;}
			osobe.get(i).setCountHappy(countHappy);
			osobe.get(i).setCountSad(countSad);
			osobe.get(i).setCountInLove(countInLove);
			
			String Input = osobe.get(i).getMessageLogNo();// uzimanje text fajla sa porukama od svake osobe
			String[] brojac = Input.split("\r\n|\r|\n");// deljenje na linije teksta sa porukama
			osobe.get(i).setTotalMessageCount(brojac.length);	
			}}			
			
			public  void ispisDany() { // Ako je osoba Deneris, odstampati sve poruke osobe Deneris
				for(int i=0;i<osobe.size();i++) {
					if(osobe.get(i).getName().contains("Daenerys"))
						System.out.println("Poruke od Daenerys: " + FileHelper.loadMessages("messages82387561293.txt"));
					}}
			public  void ispisBrojPoruka() { // Obavestenje koliko poruka je poslao svaki karakter
				for(int i=0;i<osobe.size();i++) {
					System.out.println("Ime osobe: "+ osobe.get(i).getName() + " i broj poruka: " + osobe.get(i).getTotalMessageCount());
					}}
			
			public  void SadOrHappy() { // Obavestenje koliko je sad i happy svaki karakter
				for(int i=0;i<osobe.size();i++) {
					System.out.println("Ime osobe: " + osobe.get(i).getName() + " Broj Happy poruka: " +osobe.get(i).getCountHappy() + " Broj Sad poruka: " +osobe.get(i).getCountSad()+" dispozicija " + osobe.get(i).Dispozicija());
					}}
					
					
		}
	
				
				
			
						
					
						
			
		
	   		
	
	


	



	
	
