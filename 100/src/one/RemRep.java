package one;

public class RemRep {
	public static int[] removeRepeat(int[] a){
		int N=a.length;//��ȡ����
		int [] arr=new int[N];//���ڸ��Ƶ������飬���Ⱥ�ԭ������ͬ
		for(int i=0;i<N;i++){
			arr[i]=a[i];//�����Ը���
		}
	
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] sorta={1,3,3,4,5,5,5,7,8,9,9,9};
		int[] arr=removeRepeat(sorta);
				for(int item:arr){
					System.out.print(item+" ");
				}
	}

}
