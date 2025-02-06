package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class streamex4 {

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
		
		List <Integer> arr1=arr.stream().distinct().collect(Collectors.toList());
		System.out.println(arr1);
	}

}
