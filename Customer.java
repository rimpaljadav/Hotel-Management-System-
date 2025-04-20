package Com.HMS;

public class Customer {
	private String c_name;
	private String c_adhar;
	private long c_contact;
	private String address;
	private String date;
	
	//non-perametrized constructor
	public Customer() {
		super();
	}
	public Customer(String c_name,String c_adhar,long c_contact,String address,String date) {
		this.c_name=c_name;
		this.c_adhar=c_adhar;
		this.c_contact=c_contact;
		this.address=address;
		this.date=date;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_adhar() {
		return c_adhar;
	}
	public void setC_adhar(String c_adhar) {
		this.c_adhar = c_adhar;
	}
	public long getC_contact() {
		return c_contact;
	}
	public void setC_contact(long c_contact) {
		this.c_contact = c_contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Customer [c_name=" + c_name + ", c_adhar=" + c_adhar + ", c_contact=" + c_contact + ", address="
				+ address + ", date=" + date + "]";
	}
	
	
	
	
	
	
}