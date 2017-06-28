package three;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arrayA={1,3,5,7,8,9,13,15};
		int[] arrayB={2,4,6,11,17,25};
		ArrayList<Integer> arrC=Combination.combine(arrayA,arrayB);
		for(Integer item:arrC){
			System.out.print(item+" ");
		}
		System.out.println("");
		int[] arrD=Comb.combine2(arrayA, arrayB);
		for(Integer i:arrD){
			System.out.print(i+" ");
		}
		System.out.println("");
	}

}
