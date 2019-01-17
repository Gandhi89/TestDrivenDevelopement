
public class Scream {

	public String scream(String name) {
		if(name == name.toUpperCase()) {
			return name.toUpperCase()+" IS AMAZING";
		}
		if( name == "") {
			return "you is amazing";
		}
		else {
			return name+" is amazing";
		}
	}
	
	public String scream(String[] names) {
		return names[0] + " and " + names[1] + " and " + names[2] + " are amazing";
	}
}
