import java.util.ArrayList;

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
		Boolean isUpperCase = false;
		for(String name:names) {
			if(name == name.toUpperCase()) {
				isUpperCase = true;
			}
		}
		if(isUpperCase) 
		{
			
			ArrayList<String> lowerCase = new ArrayList<>();
			ArrayList<String> upperCase = new ArrayList<>();
			
			for(String name:names) {
				if(name == name.toUpperCase()) {
					upperCase.add(name);
				}
				else
				{
					lowerCase.add(name);
				}
			}
 			
			String lowerstring="";
			for(int i = 0; i< lowerCase.size(); i++) {
				if(i == lowerCase.size()-1) {
					lowerstring += " and " + lowerCase.get(i) + " are amazing. ";
				}
				else if(i==0) {
					lowerstring = lowerCase.get(0);
				}
				else {
					lowerstring += " and " + lowerCase.get(i)  ;
				}
			}
			String upperstring = upperCase.get(0)+" ALSO!";
			
			return lowerstring + upperstring;
		}
		else {
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
	
	
}
