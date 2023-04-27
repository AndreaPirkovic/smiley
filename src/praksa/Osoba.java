package praksa;

public class Osoba {
	String name;
	String allegiance;
	String MessageLogNo;
	int countHappy;
	int countSad;
	int countInLove;
	int TotalMessageCount;
	
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
	public void setMessageLogNo(String messageLogNo) {
		this.MessageLogNo = messageLogNo;
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
	public int getCountInLove() {
				return countInLove;
			}
	public void setCountInLove(int countInLove) {
				this.countInLove = countInLove;
	}
	public int getTotalMessageCount() {
		return TotalMessageCount;
	}
	public void setTotalMessageCount(int TotalMessageCount) {
		this.TotalMessageCount =TotalMessageCount;
}	
	public String Dispozicija() {
		if (getCountSad()>getCountHappy())
			return "SAD";
		else 
			return "HAPPY";
		
		
	
	}

	}
	
