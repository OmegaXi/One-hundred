package two;

import java.util.Scanner;

//递归
public class Rev {
	public static String reverse(String s){
		int length=s.length();
		if(length<=1)
			return s;//字符串只有一个字符的话，直接输出，这样当递归到只有一位的时候，就会输出
		String left=s.substring(0,length/2);//截取从第一位到字符串中间的字符串
		String right=s.substring(length/2,length);//截取从中间到最后一位的字符串；
		return reverse(right)+reverse(left);//对截取出的左、右两字符串进行递归，注意顺序是先右再左
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要逆转的字符串：");
		String str1=sc.nextLine();//读取字符串型输入
		String str2;
		str2=reverse(str1);
		System.out.println(str2);
	}

}
