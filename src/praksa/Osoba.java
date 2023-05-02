package praksa;

import java.util.List;

public class Osoba {
	String name;
	String allegiance;
	String MessageLogNo;
	private int countHappy;
	private int countSad;
	

	
	public Osoba() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAllegiance() {
		return allegiance;
	}
	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}
	public String getMessageLogNo() {
		return MessageLogNo;
	}
	public void setMessageLogNo(String MessageLogNo) {
		this.MessageLogNo = MessageLogNo;
	}
	public List<String> getSadrzajPoruka(){
		return FileHelper.loadMessages(MessageLogNo);
	}

	

	public int getCountHappy() {
		return countHappy;
	}

	public void setCountHappy(int countHappy) {
		this.countHappy = countHappy;
	}

	public int getCountSad() {
		return countSad;
	}

	public void setCountSad(int countSad) {
		this.countSad = countSad;
	}

	}
	
	
		
	
		
		
				
		
		
	
	

	
	