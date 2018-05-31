package basics;

public class ClassInvoice {
	String partnumber;
	String partdescription;
	int quantity;
	double price;
	double totalPrice;
	
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
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0.0)
		this.price = 0.0;
		else {
		}
		this.price=price;
	}
	public static void main(String args[]) {
		ClassInvoice invoice=new ClassInvoice();
        invoice.setQuantity(5);
        invoice.setPrice(200);
        invoice.setPartdescription("bolt");
        System.out.println(classInvoice.getQuantity);
        System.out.println(ClassInvoice.getInvoiceAmount());
        ClassInvoice invoice2=new ClassInvoice("nut",5);
        System.out.println(invoice2.getPartdescription());
	}
}

        
        
        
        
        
		
	

	

}
