package two;

import java.util.Scanner;
//利用数组进行倒序输出
public class Rev2 {
	public static String reverse(String s){
		char[] arr=s.toCharArray();//字符串转换为字符数组
		String rev="";
		for(int i=arr.length-1;i>=0;i--)
			rev+=arr[i];
		return rev;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要逆转的字符串：");
		String str1=sc.nextLine();//读取字符串型输入
		String str2=reverse(str1);
		System.out.println(str2);
	}

}
