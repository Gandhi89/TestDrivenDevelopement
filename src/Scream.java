
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
		String amazingPeople = "";
		for(int i=0;i< names.length;i++) {
			if(i == names.length-1) {
				amazingPeople += " and " + names[i] + " are amazing";
			}
			else if(i==0) {
				amazingPeople = names[0];
			}
			else {
				amazingPeople += " and " + names[i]  ;
			}
		}
		return amazingPeople;
	}
}
