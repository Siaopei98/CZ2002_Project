package TEST;
import java.util.*;


public class Promotion {
	//promotionItem are group of menu items on discounted price or special items not in menue
	private ArrayList<MenuItem> promotionSet;
	private String promoName;
	private double price;
	
	
	
	public void addMenuItem(MenuItem mItem) {
		promotionSet.add(mItem);
	}
	
	public void displayPromotionItems() {
		int index =  0;
		
		for(int i = 0; i< promotionSet.size();i++) {
			System.out.print("item " + (i + 1) + ": ");
			System.out.println(promotionSet.get(i).getItemName());
			System.out.println(promotionSet.get(i).getItemPrice());
			System.out.println(promotionSet.get(i).getItemDescription());
		}
	}
	
	
	public Promotion() {
		promotionSet = new ArrayList<>();
	}
	
	public void setPromoName(String name) {
		this.promoName = name;
	}
	
	public void setPromoPrice(double price) {
		this.price = price;
	}
	
	public String getPromoName() {
		return this.promoName;
	}
	public double getPromoPrice() {
		return this.price;
	}
	public ArrayList<MenuItem> getPromoList(){
		return this.promotionSet;
	}
	
	//return ala cart item from promotion set
	public MenuItem getMenuItem(int index) {
		//get item from array,array 0 base index
		//item display from 1 onwards but start from 0 base index
		return promotionSet.get(index);
	}
	public double getOriginalPrice() {
		double sum = 0;
		for(MenuItem mItem : promotionSet) {
			sum = sum + mItem.getItemPrice();
		}
		return sum;
	}
	
}
