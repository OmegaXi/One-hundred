package two;

import java.util.Scanner;
//StringBuffer内置的reverse方法
public class Rev3 {
	public static String reverse(String s){
		String ss=new StringBuffer(s).reverse().toString();
		return ss;
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
