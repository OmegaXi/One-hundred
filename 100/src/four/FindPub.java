package four;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPub {
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
	ÿ�����鶼��һ��
	����x������arr[a/b/c][x]���
	Ȼ���ٶ����б���ǹ���
	�������̫���GG�� 
	 */
	public static ArrayList<Integer> findPub(int[] a,int[] b,int[] c){
		int[][] arr=new int[3][99999];
		ArrayList<Integer> result=new ArrayList<Integer>();
		int number;
		for(int i=0;i<10;i++){
			number=a[i];
			arr[0][number]=1;
			number=b[i];
			arr[1][number]=1;
			number=c[i];
			arr[2][number]=1;
		}
		for(int i=0;i<99999;i++){
			if(arr[0][i]==1&&arr[1][i]==1&&arr[2][i]==1){
				result.add(i);
			}
		}
		return result;
	}

}