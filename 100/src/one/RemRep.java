package one;

public class RemRep {
	public static int[] removeRepeat(int[] a){
		int N=a.length;//获取长度
		int [] arr=new int[N];//用于复制的新数组，长度和原数组相同
		for(int i=0;i<N;i++){
			arr[i]=a[i];//保护性复制
		}
	
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] sorta={1,3,3,4,5,5,5,7,8,9,9,9};
		int[] arr=removeRepeat(sorta);
				for(int item:arr){
					System.out.print(item+" ");
				}
	}

}
