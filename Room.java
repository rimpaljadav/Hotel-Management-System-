package Com.HMS;

public class Room {
	private String c_adhar;
	private int r_no;
	private String r_type;
	private float r_price;
	private float r_total;
	
	public Room() {
		super();
	}
	public Room(String c_adhar,int r_no,String r_type,float r_price,float r_total) {
		this.c_adhar=c_adhar;
		this.r_no=r_no;
		this.r_type=r_type;
		this.r_price=r_price;
		this.r_total=r_total;
	}
	public String getC_adhar() {
		return c_adhar;
	}
	public void setC_adhar(String c_adhar) {
		this.c_adhar = c_adhar;
	}
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public String getR_type() {
		return r_type;
	}
	public void setR_type(String r_type) {
		this.r_type = r_type;
	}
	public float getR_price() {
		return r_price;
	}
	public void setR_price(float r_price) {
		this.r_price = r_price;
	}
	
	public float getR_total() {
		return r_total;
	}
	public void setR_total(float r_total) {
		this.r_total = r_total;
	}
	@Override
	public String toString() {
		return "Room [c_adhar=" + c_adhar + ", r_no=" + r_no + ", r_type=" + r_type + ", r_price=" + r_price
				+ ", r_total=" + r_total + "]";
	}
	
	
}