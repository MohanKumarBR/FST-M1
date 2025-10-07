import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<>();
		myList.add("Bucky Barnes");
		myList.add("Bugs Bunny");
		myList.add("Solomon Grundy");
		myList.add("Ramsey Bolton");
		myList.add("Vijay Devarakonda");
		myList.add("Bucky Barnes");
		 System.out.println("Print All the Objects:");
	        for(String s:myList){
	            System.out.println(s);
	        }
		
		System.out.println("The 3rd Name is: "+myList.get(2));
		if(myList.contains("Bugs Bunny")) {
			System.out.println("The name Bugs Bunny Exists");
		}else {
			System.out.println("The name Bugs Bunny does not Exist");
		}
		System.out.println("The Number of names in the ArrayList is: "+myList.size());
		
		myList.remove("Bucky Barnes");
		System.out.println("The Number of names in the ArrayList is: "+myList.size());

		 System.out.println("Print All the Objects:");
	        for(String s:myList){
	            System.out.println(s);
	        }
	}

}
