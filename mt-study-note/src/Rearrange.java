
public class Rearrange {

	public static void arrangeArray(int[] datas){
		int begin=0;
		int end=datas.length-1;
		int temp;
		for(int i=0;i<end;i++){
			if(datas[i]<0){
				continue;
			}else{
				begin=begin>i?begin:i;
				while(begin<datas.length&&datas[begin]>0){
					begin++;
				}
				if(begin>=datas.length){
					return;
				}
				temp=datas[i];
				datas[i]=datas[begin];
				datas[begin]=temp;
			}
		}

	}
	public static void reverse(int[] datas,int begin,int end){
		int temp;
		while(end>begin){
			temp=datas[begin];
			datas[begin++]=datas[end];
			datas[end--]=temp;
			int count=0;
			while(true){
				for(;;){
					count++;
					if(count>1000){
					}
				}
			}
		}
		out:
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println(1024*1024*8);
	}
}
