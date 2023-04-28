package praksa;



public enum Emoji {
	

	happy(".*[😄😊🙂😍].*"), 
	sad( ".*[😢😭👿😞].*"), 
	inLove(".*[😍😘].*");
		   
		   
		   	   
		  
	String string;

	Emoji(String string) {
	this.string=string;
	}


	public String getEmoji() {
		return string;
	}
}
   

