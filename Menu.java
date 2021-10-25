import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private int menuItemSize = 0;
	private int menuPromoSize = 0;
	private static ArrayList<MenuItem> itemList = new ArrayList<MenuItem> ();
	//private static ArrayList<Promotion> menuPromoList = new ArrayList<Promotion> ();

	// testing purpose
	public static void main (String[] args) {
		Menu menu = new Menu();
		// Base list of predefined menuItems
		//menu.LoadBaseMenu();
		//menu.CreateNewMenuItem();
		//menu.RemoveMenuItem(2, true);
		//menu.LoadBaseMenu();
		menu.CreateNewMenuItem();

	}
	
	// Loads the base menu and concatenates the list of base menu items to current item list.
	public void LoadBaseMenu() {
		BaseMenu bm = new BaseMenu();
		itemList.addAll(bm.CreateBase());

		PrintMenu();

		int size = getMenuSize();
		setMenuSize(size + bm.baseMenuSize());
	}
	
	public void Create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) Create New Item");
		System.out.println("(2) Create New Promotion");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			CreateNewMenuItem();
		}
		else {
			//CreateNewPromotion();
		}
	}

	// Key in number of menu items you want to add to the menu and adds them, values keyed must be case specific
	public void CreateNewMenuItem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items you wish to add?");
		int numItems = sc.nextInt();

		if(numItems <= 0) {
			System.out.println("Invalid size declaration. Exiting.......");
			return;
		}

		// Clears Buffer
		sc.nextLine();

		// Ask for input for each item to be added.
		for(int i =0; i < numItems; i++) {
			System.out.printf("Item %d\n",i + 1);

			// Read Name
			System.out.println("Name:");
			String itemName = sc.nextLine();

			// If a duplicate name was keyed to be added, ask for another name again
			if(CheckList(itemName)) {
				int choice = sc.nextInt();
				
				System.out.println("(1) Try Again");
				System.out.println("(2) Exit");

				if(choice == 1) {
					i -= 1;
					continue;
				}
				else {
					System.out.println("Exiting, sucessful previous items added will reamain in the list");
					break;
				}
			}

			// Read Description
			System.out.println("Description:");
			String desp = sc.nextLine();

			// Read Price
			System.out.println("Price:");
			double price = sc.nextDouble();

			// Clears buffer 
			sc.nextLine();

			// Clears category 
			System.out.println("Category:");
			MenuCategory category = MenuCategory.valueOf(sc.nextLine().toUpperCase());

			// Creates menuItem to be added
			MenuItem m = new MenuItem(itemName,desp,price,category);
			AddToItemList(m, true);
		}
	}

	/*public void CreateNewPromotion() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Promotion Name:");
		String promoName = sc.nextLine();

		// If a duplicate name was keyed to be added, ask for another name again
		if(CheckList(promoName)) {
			int choice = sc.nextInt();
			
			System.out.println("(1) Try Again");
			System.out.println("(2) Exit");

			if(choice == 1) {
				CreateNewPromotion();
			}
			else {
				System.out.println("Exiting, sucessful previous promotions added will reamain in the list");
				return;
			}
		}

		// Promotion constructor
		Promotion p = new Promotion("",0);
		
		System.out.println("How many items in the Promotion");
		int numItems = sc.nextInt();

		if(numItems <= 0) {
			System.out.println("Invalid size declaration. Exiting.......");
			return;
		}

		// Clears Buffer
		sc.nextLine();

		// Ask for input for each item to be added.
		for(int i =0; i < numItems; i++) {
			System.out.printf("Item %d\n",i + 1);

			// Read Name
			System.out.println("Name:");
			String itemName = sc.nextLine();
			
			// Read Description
			System.out.println("Description:");
			String desp = sc.nextLine();

			// Read Price
			System.out.println("Price:");
			double price = sc.nextDouble();

			// Clears buffer 
			sc.nextLine();

			// Clears category 
			System.out.println("Category:");
			MenuCategory category = MenuCategory.valueOf(sc.nextLine().toUpperCase());

			// Creates menuItem to be added
			MenuItem m = new MenuItem(itemName,desp,price,category);
			//AddToMenuPromoList(p, true);
			p.addMenuItem(m);
		}
		AddToMenuPromoList(p);
		// Updates size value
		IncMenuPromoListSize();
	}*/

	// Checks through both list to see if there are any duplicates of name == parameter in both Lists
	private boolean CheckList(String name) {
		for(int i = 0; i < itemList.size();i++) {
			String itemName = itemList.get(i).getItemName();
			if(itemName.compareToIgnoreCase(name) == 0) {
				System.out.println("Duplicate detected in List of Items. Please try again.");
				return true;
			}
		}
		/*for(int i = 0; i < menuPromoList.size();i++) {
			String itemName = itemList.get(i).getItemName();
			if(itemName.compareToIgnoreCase(name) == 0) {
				System.out.println("Duplicate detected in list of Promotions. Please try again.");
				return true;
			}
		}*/
		return false;
	}

	// Adds menuitem to the list data structure, boolean asks if you want the item added to be printed
	public void AddToItemList(MenuItem m, boolean print) {
		itemList.add(m);

		if(print) {
			int latestIndex = itemList.lastIndexOf(m);
			System.out.println("");
			System.out.println("=====================ADDED ITEM===========================");
			PrintSingleItem(latestIndex);
			System.out.println("=========================================================");
			System.out.println("");
			PrintMenu();
		}
		IncItemListSize();
	}
	
	/*public void AddToMenuPromoList(Promotion p, boolean print) {
		menuPromoList.add(p);

		if(print) {
			int latestIndex = menuPromoList.lastIndexOf(p);
			System.out.println("");
			System.out.println("=====================ADDED ITEM===========================");
			PrintSinglePromotion(latestIndex);
			System.out.println("=========================================================");
			System.out.println("");
			PrintMenu();
		}
		IncMenuPromoListSize();
	}*/

	public void Update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) Update a Menu Item");
		System.out.println("(2) Update a Promotion");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Item Number:");
			int index = sc.nextInt();
			UpdateMenuItem(index);
		}
		else {
			/*System.out.println("Promotion Number:");
			int index = sc.nextInt();
			UpdatePromotion(index);		*/
		}
	}
	
	// Updates Menu item of specified index
	public void UpdateMenuItem(int index) {	
		Scanner sc = new Scanner(System.in);

		MenuItem m = itemList.get(index);
		
		System.out.println("(1) Update Name");
		System.out.println("(2) Update Price");
		System.out.println("(3) Update Description");
		System.out.println("(4) Update Category");

		int option = sc.nextInt();
		
		switch(option) {
			case 1: 
				System.out.println("New Name");
				String newName = sc.nextLine();
				m.setItemName(newName, false);
			break;
			case 2: 
				System.out.println("New Price");
				double newPrice = sc.nextDouble();
				m.setItemPrice(newPrice, false);
			break;
			case 3: 
				System.out.println("New Description");
				String newDescript = sc.nextLine();
				m.setItemDescription(newDescript, false);
			break;
			case 4: 
				System.out.println("New Category");
				MenuCategory newCate = MenuCategory.valueOf(sc.nextLine().toUpperCase());
				m.setMenuCategory(newCate, false);
			break;
		}
		System.out.println("");
		System.out.println("=====================UPDATED ITEM========================");
		PrintSingleItem(index);
		System.out.println("=========================================================");
		System.out.println("");
	}
	
	/*public void UpdatePromotion(int index) {	
		Scanner sc = new Scanner(System.in);

		Promotion p = menuPromoList.get(index);
		
		System.out.println("(1) Change Name");
		System.out.println("(2) Change Price");
		System.out.println("(3) Add Item");
		System.out.println("(4) Remove Item");

		int option = sc.nextInt();
		
		switch(option) {
			case 1: 
				System.out.println("New Name");
				String newName = sc.nextLine();
				p.setPromoName(newName, false);
			break;
			case 2: 
				System.out.println("New Price");
				double newPrice = sc.nextDouble();
				p.setPromoPrice(newPrice, false);
			break;
			case 3: 
				System.out.println("Name:");
				String itemName = sc.nextLine();

				// Read Description
				System.out.println("Description:");
				String desp = sc.nextLine();

				// Read Price
				System.out.println("Price:");
				double price = sc.nextDouble();

				// Clears buffer 
				sc.nextLine();

				// Clears category 
				System.out.println("Category:");
				MenuCategory category = MenuCategory.valueOf(sc.nextLine().toUpperCase());
				MenuItem m = new MenuItem(itemName, desp, price, category);
				p.addMenuItem(m);
			break;
			case 4:
				// Reserved for removing menu item from Promotion
			break;
		}
		System.out.println("");
		System.out.println("=====================UPDATED PROMO========================");
		PrintSinglePromotion(index);
		System.out.println("=========================================================");
		System.out.println("");

	}*/

	public void Remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) Remove a Menu Item");
		System.out.println("(2) Remove a Promotion");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Item Number:");
			int index = sc.nextInt();
			RemoveFromItemList(index);
		}
		else {
			/*System.out.println("Promotion Number:");
			int index = sc.nextInt();
			RemoveFromPromoList(index);*/
			//CreateNewPromotion();
		}
	}
	
	public void RemoveFromItemList(int index) {
		itemList.remove(index);
	}
	
	/*public void RemoveFromPromoList(int index) {
		menuPromoList.remove(index);
	}*/
	

	// Removes menu item of specified index
	public void RemoveMenuItem(int index, boolean print) {		
		MenuItem itemToBeRemoved = itemList.get(index);

		if(print) {
			System.out.println("");
			System.out.println("=====================REMOVED ITEM========================");
			PrintSingleItem(index);
			System.out.println("=========================================================");		
			System.out.println("");
		}

		itemList.remove(itemToBeRemoved);
		DecItemListSize();

		if(print)
			PrintMenu();
	}

	// Prints entire current itemList
	
	public void PrintMenu() {
		System.out.println("");
		System.out.println("==================== MENU ========================");

		System.out.println("");
		System.out.println("==================== ITEMS ========================");
		for(int i =0; i < itemList.size();i++) {
			PrintSingleItem(i);
		}

		System.out.println("");
		System.out.println("==================== PROMOTIONS ========================");

		// Prints all promotion items in MENU
		/*for(int i =0; i < promoList.size();i++) {
			PrintSinglePromotion(i);
		}*/

		System.out.println("");
		System.out.println("=========================================================");		
		System.out.println("");
	}

	// Prints only the selected index item
	
	public void PrintSingleItem(int index) {
		System.out.println("");
		System.out.println("Item: " + (index+1));
		System.out.println("Name: " + itemList.get(index).getItemName());
		System.out.printf("Price: $%.2f\n" ,itemList.get(index).getItemPrice());
		System.out.println("Description: " + itemList.get(index).getItemDescription());
		System.out.println("Category: " + itemList.get(index).getMenuCategory());
		System.out.println("");
	}

	// Prints the promotion item
	
	/*public void PrintSinglePromotion(int index) {
		System.out.println("");
		promoList[index].displayPromotionItems();
		System.out.println("");
	}*/

	// Increment itemList size by 1
	public void IncItemListSize() {
		System.out.println("called");
		int size = getMenuSize();
		size += 1;
		setMenuSize(size);
		PrintSize();
	}

	// Increment promoList size by 1
	
	/*public void IncMenuPromoListSize() {
		int size = getMenuPromoSize();
		setPromoSize(size++);
		PrintSize();
	}*/

	// Decrement itemList size by 1
	public void DecItemListSize() {
		int size = getMenuSize();
		setMenuSize(size--);
		PrintSize();
	}

	// Decrement promoList size by 1
	
	/*public void DecMenuPromoListSize() {
		int size = getMenuPromoSize();
		setPromoSize(size--);
		PrintSize();
	}*/

	// Prints current size of itemList & promoList
	
	public void PrintSize() {
		System.out.println("---------------------------------------------------");
		System.out.println("ITEM SIZE = " + getMenuSize());
		//System.out.println("PROMOTION SIZE = " + getPromoSize());
		//System.out.println("MENU SIZE = " + (getMenuSize() + getPromoSize()));
		System.out.println("---------------------------------------------------");
	}

	// Getter Methods
	public int getMenuSize() {
		return menuItemSize;
	}

	public ArrayList<MenuItem> getItemList() {
		return itemList;
	}

	/*public ArrayList<Promotion> getMenuPromoList() {
		return menuPromoList;
	}*/

	/*public int getMenuPromoSize() {
		return promoSize;
	}*/

	// Setter Methods
	public void setMenuSize(int size) {
		menuItemSize = size;
	}

	public void setItemList(ArrayList<MenuItem> list) {
		itemList = list;
	}

	/*public void setMenuPromoList(ArrayList<Promotion> list) {
		menuPromoList = list;
	}*/

	/*public void setMenuPromoSize(int size) {
		promoSize = size;
	}*/
}
