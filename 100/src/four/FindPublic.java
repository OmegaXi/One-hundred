package four;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPublic {
	public static void main(String[] args){
		int[] a=new int[10];
		int[] b=new int[10];
		int[] c=new int[10];
		ArrayList<Integer> d=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入10个整数组成数组a：");
		for(int i=0;i<10;i++)
			a[i]=sc.nextInt();
		
		System.out.println("请输入10个整数组成数组b：");
		for(int i=0;i<10;i++)
			b[i]=sc.nextInt();
		
		System.out.println("请输入10个整数组成数组c：");
		for(int i=0;i<10;i++)
			c[i]=sc.nextInt();
		
		d=findPub(a,b,c);
		for(int item:d){
			System.out.print(item+" ");
		}
		System.out.println();
	}
	/*
	 从a数组的第一个数字开始，在b和c中穷搜
	 如果b中有，则flag+1；
	 如果c中也有，则flag+2；
	 如果flag=2，则说明a数组中的这个数字在b和c中都存在，是公共的
	 对于每个a【i】，都相当于要过一遍（虽然有break）b和c
	 所以是最白痴的做法了 
	 */
	public static ArrayList<Integer> findPub(int[] a,int[] b,int[] c){
		ArrayList<Integer> result=new ArrayList<Integer>();
		int flag;
		for(int i=0;i<10;i++){
			flag=0;
			for(int j=0;j<10;j++){if(a[i]==b[j]){flag++;break;}}
			for(int k=0;k<10;k++){if(a[i]==c[k]){flag++;break;}}
			if(flag==2){result.add(a[i]);}
		}
		return result;
	}

}
