import java.awt.MenuItem;
import java.util.*;  

public class Order {
	private Staff staffName;
	private ArrayList<MenuItem> alacarte;
	private ArrayList<MenuItem> promo;
	private ArrayList<Integer> alacarteqty;
	private ArrayList<Integer> promoqty;
	private String timeStamp;
	private int tableNo;
	private float discount;
	private double totalPrice;
	
	public Order(Staff name, String ts, int table) {
		this.staffName = name;
		this.alacarte = new ArrayList<MenuItem>();
		this.promo = new ArrayList<MenuItem>();
		this.alacarteqty = new ArrayList<Integer>();
		this.promoqty = new ArrayList<Integer>();
		this.totalPrice = 0;
		
	}
	
	public void setDiscount(float d) {
		this.discount = d;
	}
	
	public void addAlacarte(MenuItem dish, Integer qty) {
		int index = alacarte.indexOf(dish);
		if(index < 0) {
			alacarte.add(dish);
			alacarteqty.add(qty);
		}
		else {
			Integer cur = alacarteqty.get(index);
			alacarteqty.set(index, cur + qty);
		}
		totalPrice += (dish.getItemPrice() * qty);
	}
	
	public void removeAlacarte(MenuItem dish, Integer qty) {
		int index = alacarte.indexOf(dish);
		Integer cur = alacarteqty.get(index);
		alacarteqty.set(index, cur - qty);
		if(alacarteqty.get(index) == 0) {
			alacarte.remove(index);
			alacarteqty.remove(index);
		}
		totalPrice -= (dish.getItemPrice() * qty);
	}
	
	public void addPromo(MenuItem dish, Integer qty) {
		int index = promo.indexOf(dish);
		if(index < 0) {
			promo.add(dish);
			promoqty.add(qty);
		}
		else {
			Integer cur = promoqty.get(index);
			promoqty.set(index, cur + qty);
		}
		totalPrice += (dish.getItemPrice() * qty);
	}
	
	public void removePromo(MenuItem dish, Integer qty) {
		int index = promo.indexOf(dish);
		Integer cur = promoqty.get(index);
		promoqty.set(index, cur - qty);
		if(promoqty.get(index) == 0) {
			promo.remove(index);
			promoqty.remove(index);
		}
		totalPrice -= (dish.getItemPrice() * qty);
	}
	
	public void printOrderItems() {
		for(int i = 0; i<alacarte.size(); i++ ) {
			System.out.printf("%d. %s x%d/n", i+1, alacarte.get(i).getItemName(), alacarteqty.get(i));
		}
		for(int i = 0; i<promo.size(); i++ ) {
			System.out.println("PROMO ITEMS");
			System.out.printf("%d. %s x%d/n", i+1, promo.get(i).getItemName(), promoqty.get(i));
		}
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public int getTableNo() {
		return tableNo;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void printInvoice() {
		System.out.println("-------------------");
		System.out.println("INVOICE");
		System.out.println("Table Number: " + getTableNo());
		System.out.println("");
		printOrderItems();
		System.out.println("");
		System.out.println("Discount Applied: " + getDiscount());
		System.out.println("Total Price: " + ((getTotalPrice()) * ((100 - getDiscount()) / 100 )));
		System.out.println("-------------------");
	}
		
}

