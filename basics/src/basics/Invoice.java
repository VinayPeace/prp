package basics;

public class Invoice {
		String partnumber;
		String partdescription;
		int quantity;
		double price;
		
		public String getPartnumber() {
			return partnumber;
		}
		public void setPartnumber(String partnumber) {
			this.partnumber = partnumber;
		}
		public String getPartdescription() {
			return partdescription;
		}
		public void setPartdescription(String partdescription) {
			this.partdescription = partdescription;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			if (quantity<0)
				this.quantity = 0;
			else {
				this.quantity=quantity;
			}
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			if(price<0.0)
			this.price = 0.0;
			else {
			
			this.price=price;
		}}
		public void invoiceamount()
		{
			double amount=price*quantity;
			System.out.println(amount);
		}		public static void main(String args[]) {

			
			Invoice invoice1=new Invoice();
			invoice1.setPartnumber("vv");
			invoice1.setPartdescription("green");
			invoice1.setQuantity(20);
			invoice1.setPrice(400);
			invoice1.invoiceamount();
		
		
			System.out.println(invoice1.getPartnumber());
			System.out.println(invoice1.getPartdescription());
			System.out.println(invoice1.getQuantity());
			System.out.println(invoice1.getPrice());
			
			
			
			
			
			
		}
		
	}

