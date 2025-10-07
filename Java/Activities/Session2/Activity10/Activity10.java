import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<String>();
		
		hs.add("Ted Bundy");
		hs.add("Ram Leela");
		hs.add("Jon Snow");
		hs.add("Sheldon Cooper");
		hs.add("Romeo Juliet");
		hs.add("Mukesh Ambani");
		hs.add("Ted Bundy");
		
		System.out.println(hs);			
		
		System.out.println("The Size of the Hash Set is: "+hs.size());
		
		System.out.println("The name Jon Snow has been removed: "+hs.remove("Jon Snow"));

		System.out.println(hs);			
		
		
		hs.remove("Jon Snow");

		System.out.println("The name has been removed");
		
		System.out.println(hs);			
		
		
		if(hs.contains("Jon Snow")) {
			System.out.println("The Name Jon Snow Exists");
		}else {
			System.out.println("The Name Jon Snow does not Exist");
		}
		
		System.out.println("Updated Hash Set: "+hs);			
	
		
		

	}

}
