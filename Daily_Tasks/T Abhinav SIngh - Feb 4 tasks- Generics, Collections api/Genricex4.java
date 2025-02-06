package feb4assignments;

import java.util.Arrays;

public class Genricex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genric4<int []> gen=new genric4<int[]>(new int[] {1,2,3,4,5,5});
		
		int[] arr1=gen.getob1();
		reverse(arr1);
	}
	public static void reverse(int[] arr1) {
		int n=arr1.length;
		int last=n-1;
		for(int i=0;i<(n/2);i++) {
			int temp=arr1[i];
			arr1[i]=arr1[last-i];
			arr1[last-i]=temp;
		}
		System.out.println("Reverse order = "+Arrays.toString(arr1));
	}

}
class genric4<t>{
	private t ob1;
	public genric4(t o) {
		ob1=o;	}
	
	public t getob1() {
		return ob1;
	}
	
}