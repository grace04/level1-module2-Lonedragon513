
public class Minion {
	
	private String name; 
	private int eyes; 
	private String color; 
	private String master;

	 
public static void main(String[] args) {
	
}

	public  Minion (String name, int eyes, String color, String master) {
	this.name = name;
	this.eyes = eyes;
	this.color = color;
	this.master = master;
}
	String  getName() {
		return name;
	
	}
	
	 int getEyes() {
	
		return eyes;
	}
	
	String getColor() {
		
		return color;
	}
	
	void setMaster (String master) {
		this.master = master;
	}
	
	String getMaster() {
	
		return master;
	}
}
