package feb4assignments;

public class Genricex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Genric<int[],int[]> gen=new Genric<int[],int[]> (new int[]{1,2,3,4,5},new int[]{1,2,3,4,5});
		int[] arr1=gen.getob1();
		int [] arr2=gen.getob2();
		int count=0;
		if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				count+=1;
			}
			else {
				count=0;
			}
		}
		if(count==arr1.length) {
			System.out.println("They are same");
		}
		else {
			System.out.println("They are not same");
		}
	}
		else {
			System.out.println("They are not same");
		}
	}
		
}

class Genric <t,v> {
	private t ob1;
	private v ob2;
	public Genric(t o,v o1) {
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
