package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class streamex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		String con;
		do {
			System.out.println("Enter the number to be added");
			int s=sc.nextInt();
			arr.add(s);
			System.out.println("Do you want to add another ");
			con=sc.next();
		}while(con.equalsIgnoreCase("y"));
		
		int even=arr.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		int odd=arr.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		
		System.out.println("Even sum = "+even);
		System.out.println("Odd sum = "+odd);
	}

}
