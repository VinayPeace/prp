package basics;

public class Stats {
	static int count = 10;
	int two=10;
	
	static {
		
		count++;
		System.out.println("first static block"+count);
	}
public Sta() {
	count++;
	System.out.println("cons "+count);
}
public void getItem() {
	count++;
	System.out.println("instance () "+count);
	
}
public static void getCus() {
	count++;
	System.out.println("static () "+count);
}
public static void main(String args[]) {
	Stats.count++;
	Stats.getCus();
	Stats sta=new Stats();
	sta.getItem();
	sta.getCus();
	sta.count++;
	System.out.println("value = "+count);
}
static {
	count++;
	System.out.println("second static block"+count);
}

}
