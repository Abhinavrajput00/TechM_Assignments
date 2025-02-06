package feb4assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collectionex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		System.out.println("Enter no of Colors you want to add = ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the color = ");
			String s=sc.next();
			arr.add(s);
		}
		Iterator<String> ier=arr.iterator();
		while(ier.hasNext()) {
			Object element=ier.next();
			System.out.println(element);
		}
		
	}

}
