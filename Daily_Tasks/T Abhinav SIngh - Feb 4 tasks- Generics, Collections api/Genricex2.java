package feb4assignments;

public class Genricex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		geenricex2 <int []> gen=new geenricex2<int[]>(new int[] {1,2,3,4,5});
		int[] arr1=gen.getob1();
		int even=0;
		int odd=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				even+=arr1[i];
			}
			else {
				odd+=arr1[i];
			}
		}
		System.out.println("The sum of Even is = "+even+"\nThe sum of Odd = "+odd);
	} 

}

class geenricex2<t>{
	private t ob1;
	public geenricex2(t o) {
		ob1=o;
	}
	
	public t getob1() {
		return ob1;
	}
}