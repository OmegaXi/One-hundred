package two;

import java.util.Scanner;
import java.util.Stack;
//栈操作
public class Rev4 {
	public static String reverse(String s){
		char[] str=s.toCharArray();
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length;i++)
			st.push(str[i]);
		String rev="";
		for(int i=0;i<str.length;i++)
			rev+=st.pop();
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
