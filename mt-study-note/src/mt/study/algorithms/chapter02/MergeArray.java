package mt.study.algorithms.chapter02;

public class MergeArray {

	/**
	 * subdatas[begin..middle] is already ordered,subdatas[middle+1..end] is already ordered,
	 * datas[begin..middle,middle+1..end] to merger
	 * @param datas
	 * @param begin
	 * @param middle
	 * @param end
	 */
	public static void mergerWithoutSentinelCard(int[] datas,int begin,int middle,int end){
		//check parameter begin>=0,end<=datas.length,begin<=middle<end
		
		int leftSize=middle-begin+1;
		int rightSize=end-middle;
		int[] left=new int[leftSize];
		int[] right=new int[rightSize];
		for(int i=0;i<=leftSize;i++){
			left[i]=datas[begin+i];
		}
		for(int i=0;i<rightSize;i++){
			right[i]=datas[middle+1+i];
		}
		int i=0,j=0,k=begin;
		while(i<=leftSize&&j<=rightSize){
			if(left[i]<=right[j]){
				datas[k++]=left[i++];
			}else{
				datas[k++]=right[j++];
			}
		}
		while(i<=leftSize){
			datas[k++]=left[i++];
		}
		while(j<=rightSize){
			datas[k++]=right[j++];
		}
	}
}
