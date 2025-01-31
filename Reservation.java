package cz2002;

public class Reservation {

	private String date;
	private float time;
	private int pax;
	private Customer customer;
	private Table tableobj;
	
	public Reservation(String date, float time, int pax, Customer customer, Table tableobj)
	{
		this.date = date;
		this.time = time;
		this.pax = pax;
		this.customer = customer;
		this.tableobj = tableobj;
	}
	
	//public Time_Out()
	
	public String getReservationDate()
	{
		return date;
	}
	public void setReservationDate(String date)
	{
		this.date = date;
	}
	
	public float getReservationTime()
	{
		return time;
	}
	public void setReservationTime(float time)
	{
		this.time = time;
	}
	
	public int getReservationPax()
	{
		return pax;
	}
	public void setReservationPax(int pax)
	{
		this.pax = pax;
	}
	
	public getReservationCustomer()
	{
		return customer;
	}
	public setReservationCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	public Table getReservationTable()
	{
		return tableobj;
	}
	public void setReservationTable(Table tableobj)
	{
		this.tableobj = tableobj;
	}
	
}
