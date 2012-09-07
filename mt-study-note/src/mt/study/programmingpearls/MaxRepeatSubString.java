package mt.study.programmingpearls;

public class MaxRepeatSubString {

	public static void getThatString(String input){
		int length=input.length();
		int[] next=new int[length];
		byte[] inputBytes=input.getBytes();
		int maxPosition=0,maxLength=0;
		for(int i=0;i<length-maxLength;i++){
			next[0]=-1;
			for(int j=1,k=0;j<length-i;j++,k++){
				while(k>=0&&inputBytes[i+j]!=inputBytes[k]){
					k=next[k];
				}
				next[j] = k;
				if(k>maxLength){
					maxPosition=i+j-k;
					maxLength=k;		
				}
			}
		}
		System.out.printf("result: %d %d %s",maxPosition,maxLength+ 1,input.substring(maxPosition, maxPosition+maxLength+1));
	}
	public static void main(String[] args) {
		String input="abcdsetseabcd";
		getThatString(input);
	}
}
