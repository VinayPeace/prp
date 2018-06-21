import java.util.Scanner;
public class CountWords {


		public static void main(String[] args)
		{
			int count=0;
		    Scanner scan=new Scanner(System.in);
			System.out.println("enter the words");
			String one=scan.nextLine().toUpperCase();
			String two[]=one.split(" ");
			
			for(int i=0;i<two.length;i++)		
			{
				for(int j=i+1;j<two.length;j++)	
				{
					
				if(two[i].equals(two[j]))	
					count++;
		      } 
			}
			if(count==1)
			{
				System.out.println(count+1);
			}
			else
			{
				System.out.println(count);
			}

	}
}


