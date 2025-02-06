package feb4assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Collectionex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		System.out.println("Enter number of Colors you want to add = ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the color = ");
			String s=sc.next();
			arr.add(s);
		}
		System.out.println("Changing the element at position:");
		do {
			System.out.println("Enter the color to be changed = ");
			String chng=sc.next();
			int pos=arr.indexOf(chng);
			System.out.println("Enter the color to be replaced = ");
			String s=sc.next();
			arr.set(pos, s);
			System.out.println("Do you want to add another = ");
		}while(sc.next().equals("y"));
		
		System.out.println("The resultant ArrayList = "+arr);
	}

}
