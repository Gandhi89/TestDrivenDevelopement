
public class Scream {

	public String scream(String name) {
		if(name == name.toUpperCase()) {
			return name.toUpperCase();
		}
		if( name == "") {
			return "you is amazing";
		}
		else {
			return name+" is amazing";
		}
	}
}
