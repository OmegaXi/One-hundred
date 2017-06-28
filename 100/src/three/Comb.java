package three;

import java.util.Arrays;

public class Comb {
	public static int[] combine2(int[] a,int[] b){
		int length=a.length+b.length;
		int[] result=new int[length];
		for(int i=0;i<a.length;i++)
			result[i]=a[i];
		for(int j=0;j<b.length;j++)
			result[a.length+j]=b[j];
		Arrays.sort(result);
		return result;
	}
}
