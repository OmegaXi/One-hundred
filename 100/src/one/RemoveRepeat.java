package one;

public class RemoveRepeat {
	public static int[] removeRepeat(int[] a){
		int N=a.length;//��ȡ����
		int [] arr=new int[N];//���ڸ��Ƶ������飬���Ⱥ�ԭ������ͬ
		for(int i=0;i<N;i++){
			arr[i]=a[i];//�����Ը���
		}
		int len=N;
		for(int i=0;i<len;i++){
			int repeatn=0;
			for(int j=i+1;j<len;j++){
				if(arr[j]==arr[i]){
					repeatn++;//����ظ���repeatn+1
				}
				else if(arr[j]>arr[i]){
					break;
				}
			}
			//���ظ�����ʼ�ƶ�Ԫ��
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
		// TODO �Զ����ɵķ������
		int[] sorta={1,3,3,4,5,5,5,7,8,9,9,9};
		int[] arr=removeRepeat(sorta);
				for(int item:arr){
					System.out.print(item+" ");
				}
	}

}
