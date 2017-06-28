package three;

import java.util.ArrayList;

public class Combination {
	public static ArrayList<Integer> combine(int[] a,int[] b){
		int alen=a.length;
		int blen=b.length;
		ArrayList<Integer> result=new ArrayList<Integer>();
		int i=0,j=0;
		while(i<alen||j<blen){
			if(i==alen&&j<blen){
				result.add(b[j]);
				j++;
			}
			else if(i<alen&&j==blen){
				result.add(a[i]);
				i++;
			}
			else{
				if(a[i]<=b[j]){
					result.add(a[i]);
					i++;
				}
				else if(a[i]>b[j]){
					result.add(b[j]);
					j++;
				}
			}
		}
		return result;
	}
}
