import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> colours = new HashMap<>();
		
		colours.put(1,"Red");
		colours.put(2,"Black");
		colours.put(3,"Blue");
		colours.put(4,"Brown");
		colours.put(5,"Black");
		colours.put(6,"Green");
		
		System.out.println(colours);
		
		colours.remove(4);
		System.out.println(colours);
		if(colours.containsValue("Green")) {
			System.out.println("The Colour green is Present");
		}else {
			System.out.println("The Colour green is not Present");
		}
		
		System.out.println("The Sizeof the Map is: " + colours.size());
		
	}

}
