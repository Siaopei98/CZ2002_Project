package AssignmentGroup3;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemManager
{
	/*	 
	static ArrayList<Table> tableList = new ArrayList<Table>();
 	static ArrayList<Order> orderList = new ArrayList<Order>();
	static ArrayList<Order> paidOrderList = new ArrayList<Order>()
	static ArrayList<Customer> customerList = new ArrayList<Customer>();
	static ArrayList<Reservation> reservationList = new ArrayList<Reservation>();
	 */
	
	
	
	// NOTES:
	// Comment the things that are uncommented
	// Uncomment the things that are commented 
	// 1st Create a customer -> Create a Reservation/OccpuyFreeTable. 
	// DO NOT Create multiple customers than create reservations/occupyFreeTables

	public static void main(String[] args)
	{
		SystemManager sys = new SystemManager();

		int timer = 1000;

		// Menu menu = new Menu();

		int choice, numOfPax, tableIndex;
		Scanner sc = new Scanner(System.in);

		//////////////////////// DRIVER MENU \\\\\\\\\\\\\\\\\\\\\\\\\\\\\

		// PRE MADE MENU; 		A menu that has pre-initialised menuItems 
		// NON PRE MADE MENU: 	An empty menu

		System.out.println("Do you want to use a pre-made menu?");
		choice = sc.nextInt();

		//	if(choice == 1)
		//		menu.LoadBaseMenu();

		sys.DisplaySystemOptions();
		choice = -1;

		// MENU LOOP //////////////////////////////////////////

		do
		{
			choice = sc.nextInt();
			switch(choice)
			{
			case 0: // DISPLAY SYSTEM OPTIONS //
				sys.DisplaySystemOptions();
				break;

				////////////////////////////////
				// MENU - PROMO ////////////////
				////////////////////////////////

			case 1: // MENU ITEM CREATION //
				// Menu.Create();
				break;

			case 2: // MENU ITEM REMOVAL //
				// Menu.Create();
				break;

			case 3: // UPDATE MENU ITEM //
				// Menu.Update();
				break;

			case 4: // PROMOTION CREATION //
				// Menu.Create();
				break;

			case 5: // PROMOTION REMOVAL //
				// Menu.Create();
				break;

			case 6: // UPDATE PROMOTION OPTIONS //
				// Menu.Update();
				break;

				////////////////////////////////
				// CUSTOMER //// ///////////////
				////////////////////////////////

			case 7: // CREATE CUSTOMER //
				// cst = sys.CreateCustomer();
				// sys.AppendCustomerToList(cst); 
				break;

				////////////////////////////////
				// ORDER ///////////////////////
				////////////////////////////////

			case 8: // CREATE ORDER //
				sys.CreateOrder();
				break;

			case 9: // UPDATE ORDER //
				// System.out.println("Enter Table Number (Update Order): ");
				// tableIndex = sc.nextInt();
				// sys.UpdateOrder(tableIndex);
				break;

			case 10: // VIEW ORDERS //
				// System.out.println("Enter Table Number (View Order): ");
				// tableIndex = sc.nextInt();
				// sys.ViewOrder(tableIndex);
				break;
				
			case 11: // VIEW ALL ORDERS //
				// sys.ViewAllOrder();
				break;

			case 12: // PRINT ORDER INVOICE //
				// System.out.println("Enter Table Number (View Order Invoice): ");
				// tableIndex = sc.nextInt();
				// sys.ViewOrderInvoice(tableIndex);
				break;

			case 13: // MAKE PAYMEMT //
				
				// System.out.println("Enter Table Number (Making Payment): ");
				// tableIndex = sc.nextInt();
				// sys.MakePayment(tableIndex);
				break;

				////////////////////////////////
				// TABLES //////////////////////
				////////////////////////////////

			case 14: // VIEW TABLE //
				sys.ViewTable();
				break;

				////////////////////////////////
				// RESERVATION /////////////////
				////////////////////////////////

			case 15: // CREATE RESERVATION //
				// rsv = sys.MakeReservation(); 
				// if(rsv != null)
				// 		sys.AppendReservationToList(rsv); 	
				break;

			case 16: // REMOVE RESERVATION //
				// System.out.println("Enter Customer Name");
				// String name;
				// name = sc.nextLine();
				// sc.nextLine();
				// sys.RemoveReservation(name);
				break;

			case 17: // CHECK FOR TIME OUT RESERVATION //
				// sys.CheckForTimeOut(time);
				break;

			case 18: // OCCUPY TABLE - FOR WALK IN CUSTOMERS //
				// IMPORTANT: CREATE A CUSTOMER FIRST THEN CALL THIS FUNCTION
				
				// System.out.println("Enter Number of People");
				// numOfPax = sc.nextInt();
				// sys.OccupyFreeTable(numOfPax);
				break;
				
			case 19: // OCCUPY TABLE - FOR RESERVED CUSTOMERS //
				// System.out.println("Enter Customer Name");
				// String name;
				// name = sc.nextLine();
				// sc.nextLine();
				// sys.FulfilReservation(name);
				break;
				
			case 20: // SET TIME
				// System.out.println("Input time: ")
				// time = sc.nextInt();
				break;

			case 21: // EXIT PROGRAM //
				System.out.println("Exiting Program...");
				break;

				////////////////////////////////

			}
		} while(choice < 21);
	}

	public void CreateCustomer()
	// public Customer CreateCustomer() 
	{
		// ADD LOGIC HERE

		// Customer cst = new Customer();
		// cst.CreateCustomer();

		System.out.println("Customer Created!");
	}
	
	public void AppendCustomerToList()
	// public void AppendCustomerToList(Customer cst) 
	{
		// ADD LOGIC HERE

		// customerList.add(cst);

		System.out.println("Customer Appeneded to customerList!");
	}
	
	public void CreateOrder()
	// public Order CreateOrder()
	{
		// ADD LOGIC HERE
		// Order order = new Order();
		// order.CreateOrder();					//TODO: CreateOrder() -> Order Class

		System.out.println("Order Created!");
	}
	
	public void AppendOrderToList()
	// public void AppendOrderToList(Order order)
	{
		// ADD LOGIC HERE
		// orderList.add(order);

		System.out.println("Order Appeneded to customerList!");
	}

	public void UpdateOrder()
	// public void UpdateOrder(int tableIndex)
	{
		// ADD LOGIC HERE
		// Order order = new Order();
		// order = orderList.get(tableIndex-1);
		// order.UpdateOrder();					//TODO: UpdateOrder() -> Order Class

		System.out.println("Order Updated!");
	}
	
	public void ViewOrder() 
	// public void ViewOrder(int tableIndex)
	{
		// ADD LOGIC HERE
		// Order order = new Order();
		// order = orderList.get(tableIndex-1);
		// order.ViewOrder();					//TODO: ViewOrder() -> Order Class

		System.out.println("Viewing Order...");
	}	

	public void ViewAllOrders()
	{		
		System.out.println("View All Orders...");

		// ADD LOGIC HERE

		//  for(int i = 0; i < orderList.size() ; i++)
		//	  orderList.get(i).viewOrder();
	}
	
	public void ViewOrderInvoice()
	// public void ViewOrderInvoice(int tableIndex)
	{
		System.out.println("Viewing Order Invoice...");

		// ADD LOGIC HERE

		// Order order = new Order();
		// order = orderList.get(tableIndex-1);
		// order.print_invoice();
	}
	
	public void MakePayment ()
	// public void MakePayment (int tableIndex) // TableIndex
	{
		// ADD LOGIC HERE

		// Order order = new Order();
		// order = orderList.get(tableIndex-1);
		// orderList.remove(tableIndex-1);
		// paidOrderList.add(order);

		System.out.println("Payment Made!");
	}

	// FINDING TABLE //

	public void FindFreeTable()
	// public int FindFreeTable(int numOfPax)
	{
		// ADD LOGIC HERE

		// for(int i = 0; i < tableList.size() ; i++)
		// {
		// 	 tableNo = tableList.get(i);
		//   if(tableNo.getSeatCapacity() >= numOfPax && !tableNo.getReserved() && !tableNo.getOccupied())
		//   {
		//	    System.out.println("Table " + i+1 + " is free");
		//      return i;
		//   }
		// }
		//
		// System.out.println("No tables are free.");
		// return -1;

		System.out.println("Free Table Found!");
	}

	public void ReserveTable()
	// public void ReserveTable(int tableIndex)
	{
		// ADD LOGIC HERE

		// tableList[tableIndex].setReserved(true); // TODO: setReserved() -> Reservation Class

		System.out.println("Free Table Reserved!");

	}
	
	public void OccupyTable() 
	// public void OccupyTable(int tableIndex)
	{
		// ADD LOGIC HERE
		
		// tableList[tableIndex].setOccupied(true);
		// System.out.println("Table Occupied!");

		System.out.println("Table Occupied");
	}
	
	public void OccupyFreeTable()	
	// public void OccupyFreeTable(int numOfPax)
	{
		// ADD LOGIC HERE
		
		// int tableIndex = FindFreeTable(numOfPax)
		
		// if(tableIndex != -1)
		// {
		//	   OccupyTable(tableIndex);
		//	   customerList[customerList.size() - 1].setTableNo(tableIndex);
		//	   System.out.println("Free table occupied!");
		// }
		// else
		//	   System.out.println("No Free Tables Found.");
		
		System.out.println("Free table occupied!");
	}
	
	public void ViewTable() 
	{
		// ADD LOGIC HERE

		// Table tempTable = new Table();

		// for(int i = 0; i < tablelist.size(); i++)
		// {
		//	tempTable = tableList[i];
		//	System.out.println("Table Number " + (i+1) + " Reserved: " + tempTable.getReserved() + " Occupied: " + tempTable.getOccupied);
		// }

		// TODO: ViewTableStatus -> Table Class


		System.out.println("Viewing Tables...");
	}

	// RESERVATION // HARD CODED WARNING ONLY CREATE CUSTOMER -> MAKE RESERVATION -> DO NOT MAKE MORE THAN ONE CUSTOMER

	public void MakeReservation() 
	// public Reservation MakeReservation()
	{
		// ADD LOGIC HERE

		// Reservation rsv = new Reservation();
		// rsv.CreateReservation();
		// int tableIndex = FindFreeTable(int numOfPax);

		// if (tableIndex != -1)
		// {
		//	  ReserveTable(int tableIndex);
		//	  rsv.setTableNo(tableIndex);										// TODO: Change Table: table to int tableNo
		//    customerList[customerList.size() - 1].setTableNo = tableIndex;	// TODO: int tableNo -> Customer Class
		//	  System.out.println("Table Reserved!");
		//	  return rsv;
		// }
		// System.out.println("No Tables are free!");
		// return;										// TODO: Ask about null return Reservation

		System.out.println("Table Reserved!");
	}

	public void FulfilReservation()
	// public void fufilReservation(String cName)
	{
		// ADD LOGIC HERE
		
		// for (int i = 0; i < customerList.size(); i++)
		// {
		// 		if(customerList[i].getName() == name)
		//		{
		//			OccupyTable(customerList[i].getTableNo());
		//			System.out.println("Reservation Fulfilled.");
		//			return;
		//		}
		// }
		// System.out.println("Customer not found.");
		
		System.out.println("Reservation Fulfilled.");
	}
	
	public void AppendReservationToList()
	// public void AppendReservationToList(Reservation rsv)
	{
		// ADD LOGIC HERE

		// reservationList.add(rsv);

		System.out.println("Reservation Appended to List");
	}

	public void RemoveReservation()
	// public void RemoveReservation(int tableIndex)
	{
		// ADD LOGIC HERE
		
		// for (int i = 0; i < customerList.size(); i++)
		// {
		// 		if(customerList[i].getName() == name)
		//		{
		//			tableList[customerList[i].getTableNo()].setReserved(false); // TODO: setReserved() -> Reservation Class
		//			System.out.println("Reservation Removed.");
		//			return;
		//		}
		// }
		// System.out.println("Customer not found.");

		System.out.println("Table Unreserved");
	}

	public void CheckForTimeOut() 
	// public void CheckForTimeOut(int time)
	{
		// ADD LOGIC HERE
		
		System.out.println("Checking for time out...");
		
		// int timeOutTime = 30;

		// Reservation rsv = new Reservation();

		// for (int i = 0; i < reservationList.size(); i++)
		// {
		// 	rsv = reservationList.get(i);
		//	if(rsv.getReserved() && rsv.getOccupied && time <= (rsv.getReservationTime() + timeOutTime))
		//	{	
		//		for(int j = 0; j < customerList.size(); j++)
		//		{
		//			if(customerList[j].getTableNo() == rsv.getTableNo())		// TODO: tableNo in both RSV CLASS AND CUST CLASS
		//			{
		//				customerList[j].setTableNo(-1);							// TODO: setTableNo() CUSTOMER CLASS
		//			}
		//		}
		//		reservationList[i].setReserved(false);
		//  }
		// }
	}
	
	public void ViewTotalRevenue()
	{
		System.out.println("Calculating Total Revenue...");

		// ADD LOGIC HERE

		// float totalRevenue = 0;

		// for(int i = 0; i < paidOrderList.size(); i++)
		//  	totalRevenue += paidorderList[i].getTotalPrice();



	}
	
	public void DisplaySystemOptions()
	{
		System.out.println("================================");

		// MENU //////////////////////////////////

		System.out.println("1:  Create Menu Item");
		System.out.println("2:  Remove Menu Item");
		System.out.println("3:  Update Menu Item");

		// PROMOTION /////////////////////////////

		System.out.println("4:  Create Promotion");
		System.out.println("5:  Remove Promotion");
		System.out.println("6:  Update Promotion");

		// CUSTOMER //////////////////////////////

		System.out.println("7:  Create Customer");

		// ORDER /////////////////////////////////

		System.out.println("8:  Create Order");
		System.out.println("9:  Update Order");
		System.out.println("10: View Order");
		System.out.println("11: View All Orders");
		
		System.out.println("12: Print Order Invoice");
		System.out.println("13: Make Payment");

		// TODO: Move Order to paidOrderList

		// TABLES /////////////////////////////////

		System.out.println("14: View Tables");

		// RESERVATION ///////////////////////////	

		System.out.println("15: Create Reservation");
		System.out.println("16: Remove Reservation");
		System.out.println("17: Time Out Reservations");
		System.out.println("18: Occupy Table (Walk-ins)");
		System.out.println("19: Occupy Table (Reservations)");
		
		System.out.println("20: Set Time");

		System.out.println("21: Quit");

		System.out.println("================================");

		///////////////////////////////////////////////////////		
	}

}
