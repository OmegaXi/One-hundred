package one;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//��set�ķ�ʽ�Զ�ȥ��
public class RemRep {
	public static int[] removeRepeat(int[] a){
		Set<Integer> s=new HashSet<Integer>();
		for(Integer i:a){
			s.add(i);
		}
		int n=s.size();
		int i=0;
		int[] result=new int[n];
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()){
			result[i]=it.next();
			i++;
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
