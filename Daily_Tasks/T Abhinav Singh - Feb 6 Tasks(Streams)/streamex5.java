package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class streamex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		String con;
		do {
			System.out.println("Enter the string to be added");
			String s=sc.next();
			arr.add(s);
			System.out.println("Do you want to continue");
			con=sc.next();
		}while(con.equalsIgnoreCase("y"));
		System.out.println("Enter the letter to be Searched");
		String search=sc.next();
		char c=search.charAt(0);
		
		List<String> arr1=arr.stream().filter(i->i.charAt(0)==(c)).collect(Collectors.toList());
		int co=(int) arr.stream().filter(i->i.charAt(0)==(c)).count();
		System.out.println(arr1);
		
		System.out.println("The count of strings starts with the letter = "+co);
	}

}
