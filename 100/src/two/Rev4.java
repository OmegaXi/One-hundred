package two;

import java.util.Scanner;
import java.util.Stack;
//ջ����
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
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ��ת���ַ�����");
		String str1=sc.nextLine();//��ȡ�ַ���������
		String str2=reverse(str1);
		System.out.println(str2);
	}

}
