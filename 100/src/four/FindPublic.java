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
		
		System.out.println("������10�������������a��");
		for(int i=0;i<10;i++)
			a[i]=sc.nextInt();
		
		System.out.println("������10�������������b��");
		for(int i=0;i<10;i++)
			b[i]=sc.nextInt();
		
		System.out.println("������10�������������c��");
		for(int i=0;i<10;i++)
			c[i]=sc.nextInt();
		
		d=findPub(a,b,c);
		for(int item:d){
			System.out.print(item+" ");
		}
		System.out.println();
	}
	/*
	 ��a����ĵ�һ�����ֿ�ʼ����b��c������
	 ���b���У���flag+1��
	 ���c��Ҳ�У���flag+2��
	 ���flag=2����˵��a�����е����������b��c�ж����ڣ��ǹ�����
	 ����ÿ��a��i�������൱��Ҫ��һ�飨��Ȼ��break��b��c
	 ��������׳յ������� 
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
