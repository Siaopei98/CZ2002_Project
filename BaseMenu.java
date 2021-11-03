package TEST;

import java.awt.MenuItem;
import java.util.ArrayList;

// List of predefined menu items

public class BaseMenu {
	private ArrayList<MenuItem> baseItemList = new ArrayList<MenuItem> ();
	private ArrayList<Promotion> basePromoList = new ArrayList<Promotion> ();
	
	MenuItem m1 = new MenuItem("Hand Tossed Salad", "strawberries, dried cranberries, raisins, pineapple" , 5.00, MenuCategory.SIDES);
	MenuItem m2 = new MenuItem("Caesar Salad", "parmesan cheese, lemon juice" , 8.00, MenuCategory.SIDES);
	MenuItem m3 = new MenuItem("Fresh Juice", "orange / apple / watermelon" , 2.00, MenuCategory.DRINKS);
	MenuItem m4 = new MenuItem("Roast Beef with Mushroom Sauce", "Beef + Mushroom" , 17.00, MenuCategory.MAINS);

	public ArrayList<MenuItem> CreateBase() {
		baseItemList.add(m1);
		baseItemList.add(m2);
		baseItemList.add(m3);
		baseItemList.add(m4);
		
		return baseItemList;
	}
	
	public ArrayList<MenuItem> getBaseItemList(){
		return baseItemList;
	}
	
	public ArrayList<Promotion> getBasePromoList(){
		return basePromoList;
	}
	
	public int baseMenuSize() {
		return baseItemList.size();
	}
	public int basePromoSize() {
		return basePromoList.size();
	}
}
