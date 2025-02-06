package feb4assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Collectionex3 {

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
		System.out.println("Enter the color to add first = ");
		String s=sc.next();
		arr.add(0, s);
		System.out.println("The resultant array = "+arr);
	}

}
