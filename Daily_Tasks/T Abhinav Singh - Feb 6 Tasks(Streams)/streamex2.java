package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class streamex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String con;
		do {
			System.out.println("Enter the String to be added");
			String s=sc.next();
			arr.add(s);
			System.out.println("Do you want to add another ");
			con=sc.next();
		}while(con.equalsIgnoreCase("y"));
		
		List <String> arr1=arr.stream().map(String::toLowerCase).collect(Collectors.toList());
		
		System.out.println("The changed list is "+arr1);
	}

}
