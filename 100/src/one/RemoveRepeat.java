package one;

public class RemoveRepeat {
	public static int[] removeRepeat(int[] a){
		int N=a.length;//获取长度
		int [] arr=new int[N];//用于复制的新数组，长度和原数组相同
		for(int i=0;i<N;i++){
			arr[i]=a[i];//保护性复制
		}
		int len=N;
		for(int i=0;i<len;i++){
			int repeatn=0;
			for(int j=i+1;j<len;j++){
				if(arr[j]==arr[i]){
					repeatn++;//如果重复，repeatn+1
				}
				else if(arr[j]>arr[i]){
					break;
				}
			}
			//有重复，开始移动元素
			if(repeatn>0){
				for(int k=i+repeatn+1;k<len;k++){
					arr[k-repeatn]=arr[k];
				}
				len=len-repeatn;
			}
		}
		int[] result=new int[len];
		for(int i=0;i<len;i++){
			result[i]=arr[i];
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
