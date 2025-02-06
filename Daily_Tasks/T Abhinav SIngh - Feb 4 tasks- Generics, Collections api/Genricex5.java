package feb4assignments;

import java.util.Arrays;

public class Genricex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genric5<int[],int[]> gen=new genric5<int[],int[]>(new int[] {1,2,3,4,5},new int[] {1,2,3,4,5});
		
		int[] arr1=gen.getob1();
		int[] arr2=gen.getob2();
		merge(arr1,arr2);
		
	}
	public static void merge(int[] arr1,int [] arr2) {
		
		int n=arr1.length+arr2.length;
		int [] arr3=new int[n];
		int j=0;
		int k=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				arr3[i]=arr2[j];
				j++;
			}
			else {
				arr3[i]=arr1[k];
				k++;
			}
		}
		System.out.println("merged array = "+Arrays.toString(arr3));
	}

}
class genric5<t,v>{
	private t ob1;
	private v ob2;
	public genric5(t o,v o1) {
		ob1=o;
		ob2=o1;
	}
	
	public t getob1() {
		return ob1;
	}
	public v getob2() {
		return ob2;
	}
	
	
}