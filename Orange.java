package basics;

public class Orange{
	public static void main(String args[]) {
		int i=0;
		while(i<10) {
		System.out.println("i="+i);
		i++;
	}
i=0;
do {
	System.out.println("DO while i="+i);
	i++;
}while(i<10);
		for(i=0;i<10;i++) {
			if (i==3) {
				continue;
			}
			System.out.println("for loop break "+i);
			if(i==5) {
			    break;
			}
		}
	}
}

	


