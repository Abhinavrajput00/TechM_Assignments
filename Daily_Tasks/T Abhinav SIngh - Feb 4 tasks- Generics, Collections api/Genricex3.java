package feb4assignments;

public class Genricex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genric3<int [],Integer> gen=new genric3<int[],Integer>(new int[] {1,2,3,4,5,5},5);
		
		int[] arr1=gen.getob1();
		int element=gen.getob2();
		indexx(arr1,element);
	}
		
		public static void indexx(int[] arr1,int element)
		{
		boolean search=false;
		
		for(int i=0;i<arr1.length;i++) {
			if(element==arr1[i]){
				System.out.println("The search is succesful element index = "+i) ;
				search=true;
				break;
			}
		}
		if(search==false) {
			System.out.println(-1);
		}
	}

}
class genric3<t,v>{
	private t ob1;
	private v ob2;
	public genric3(t o,v o1) {
		ob1=o;
		ob2=o1;
	}
	
	public t getob1() {
		return ob1;
	}
	public v getob2() {
		return ob2;
	}
	
	public void setob1(t a) {
		ob1=a;
	}
	public void setob2(v b) {
		ob2=b;
	}
	
}
