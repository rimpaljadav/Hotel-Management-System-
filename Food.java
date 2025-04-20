package Com.HMS;

public class Food {
		private String c_adhar;
		private String f_type;
		private float f_price;
		private String f_name;
		private String f_quantity;
		private float f_total;
		
		public Food() {
			super();
		}
		public Food(String c_adhar,String f_type,float f_price,String f_name,String f_quantity,float f_total) {
			this.c_adhar=c_adhar;
			this.f_type=f_type;
			this.f_price=f_price;
			this.f_name=f_name;
			this.f_quantity=f_quantity;
			this.f_total=f_total;
		}
		
		
		public float getF_total() {
			return f_total;
		}
		public void setF_total(float f_total) {
			this.f_total = f_total;
		}
		public String getC_adhar() {
			return c_adhar;
		}
		public void setC_adhar(String c_adhar) {
			this.c_adhar = c_adhar;
		}
		public String getF_type() {
			return f_type;
		}
		public void setF_type(String f_type) {
			this.f_type = f_type;
		}
		public float getF_price() {
			return f_price;
		}
		public void setF_price(float f_price) {
			this.f_price = f_price;
		}
		public String getF_name() {
			return f_name;
		}
		public void setF_name(String f_name) {
			this.f_name = f_name;
		}
		public String getF_quantity() {
			return f_quantity;
		}
		public void setF_quantity(String f_quantity) {
			this.f_quantity = f_quantity;
		}
		@Override
		public String toString() {
			return "Food [c_adhar=" + c_adhar + ", f_type=" + f_type + ", f_price=" + f_price + ", f_name=" + f_name
					+ ", f_quantity=" + f_quantity + ", f_total=" + f_total + "]";
		}
		
}