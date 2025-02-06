package feb4assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Collectionex7 {

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
		System.out.println("searching the element:");
		System.out.println("Enter the color to be searched = ");
		String s=sc.next();
		searching(arr,s);
		
		System.out.println("The resultant ArrayList = "+arr);
	}
	public static void searching(ArrayList<String> arr,String s) {
		
		for(int i=0;i<arr.size();i++) {
			if(s.equals(arr.get(i))) {
				System.out.println("The element is searched "+s);
			}
		}
	}

}
