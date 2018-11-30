package barrenMoor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[]args) {
		List<BarrenMoor> locations = new ArrayList<BarrenMoor>();
	
		////Oceans/////
		Ocean ocean1 = new Ocean("descHold", null, 0, 0, 0, 0, null);
		locations.add(ocean1);	
		Ocean ocean2 = new Ocean("descHold", null, 0, 0, 0, 0, null);
		locations.add(ocean2);	
		Ocean ocean3 = new Ocean("descHold", null, 0, 0, 0, 0, null);
		locations.add(ocean3);	
		
		/////Treasures//////
		Treasure treasure1 = new Treasure ("As you continue to walk you arrive at a treasure chest! Hooray you can now order an uber.","", 0, 0, 0, 0, null);
		locations.add(treasure1);
		Treasure treasure2 = new Treasure ("As you continue to walk you see a shiny object in the distance, It's a treasure Chest!.","", 0, 0, 0, 0, null);
		locations.add(treasure2);	
		Treasure treasure3 = new Treasure ("As you continue to walk you stumble upon a crate. The crate contain a; Shovel, Hammer, Nails, Axe, Torch and some batteries.","", 0, 0, 0, 0, null);
		locations.add(treasure3);	
		
		/////Mercenaries//////
		Mercenary mercenary1 = new Mercenary("descHold", null, 0, 0, 0, 0, null);
		locations.add(mercenary1);	
		Mercenary mercenary2 = new Mercenary("descHold", null, 0, 0, 0, 0, null);
		locations.add(mercenary2);	
		Mercenary mercenary3 = new Mercenary("descHold", null, 0, 0, 0, 0, null);
		locations.add(mercenary3);		
		
		/////Deserts////////
		Desert desert1 = new Desert("descHold", null, 0, 0, 0, 0, null);
		locations.add(desert1);
		Desert desert2 = new Desert("descHold", null, 0, 0, 0, 0, null);
		locations.add(desert2);
		Desert desert3 = new Desert("descHold", null, 0, 0, 0, 0, null);
		locations.add(desert3);
		
		cycle (locations);
	}
	
	public static void cycle (List<BarrenMoor>locations) 
	
	
	{
		Random rand = new Random();
		String biomeChoiceArray[] = {"Ocean","Treasure","Mercenary","Desert"}; 
		int index = rand.nextInt(biomeChoiceArray.length);
		String biomeChoice = biomeChoiceArray[index]; 
		System.out.print(biomeChoice);
		
			if biomeChoice = Ocean
				oceanBiomes
	}
	
	
	public static void oceanBiomes (List<BarrenMoor>locations) 
	{
		System.out.println(locations.stream().filter(filter->filter instanceof Ocean).findFirst());
				
	}
	
	public static void treasureBiomes (List<BarrenMoor>locations) 
	{
		System.out.println(locations.stream().filter(filter->filter instanceof Treasure).findFirst());
				
	}
	
	public static void mercenaryBiomes (List<BarrenMoor>locations) 
	{
		System.out.println(locations.stream().filter(filter->filter instanceof Mercenary).findFirst());
				
	}
	
	public static void desertBiomes (List<BarrenMoor>locations) 
	{
		System.out.println(locations.stream().filter(filter->filter instanceof Desert).findFirst());
				
	}
		

}


/////System.out.print("You have awoke in a strange place unaware of your location, All you see is a compass on your wrist and decide to head off in either; North, East, South or West.");
