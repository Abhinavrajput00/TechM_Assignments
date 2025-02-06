package stream;

import java.util.ArrayList;
import java.util.Scanner;

public class streamex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		String con;
		do {
			System.out.println("Enter the numbers to be added");
			int s=sc.nextInt();
			arr.add(s);
			System.out.println("Do you want to continue");
			con=sc.next();
		}while(con.equalsIgnoreCase("y"));
		
		int max=arr.stream().max(Integer::compare).get();
		System.out.println("Maximum integer is = "+max);
		int min=arr.stream().min(Integer::compare).get();
		System.out.println("Minimum integer is = "+min);
		
	}

}
