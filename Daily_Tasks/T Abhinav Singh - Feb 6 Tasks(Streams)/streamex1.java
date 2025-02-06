package stream;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class streamex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()) {
			arr.add(sc.nextInt());
		}
		
		OptionalDouble average=arr.stream().mapToInt(Integer::intValue).average();
		System.out.println("Average is = "+average.getAsDouble());
	}

}
