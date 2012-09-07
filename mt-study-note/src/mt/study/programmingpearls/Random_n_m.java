package mt.study.programmingpearls;

import java.util.Random;

/**
 * 从 n 个数种选出 m 个数，随机
 * 重点在于该循环。
 * 遍历整个 n 个元素的数组，随机生成一个数，这个数为 0 - (n - i) 之间，
 * 判断其是否小于 m
 * i 每次循环自加，所以说对于最大的数只有 m / n 几率被选中，
 * 如果前面 n - m 次都没有选中元素，那么在 n - m + 1 次就必须选中一个元素，
 * 几率是 100% 的，后面的也是 100%。
 * 选中一个元素则 m 自减，对剩下的 n - i 个元素还有 m - j 个元素需要选择。
 * 每个元素被选中的概率是一样的即 m / n, 不被选中的概率也是一样的，即 (n - m) / n 。
 * 一个循环 O(N) 的时间复杂度。
 *
 */
public class Random_n_m {

		private static Random rand=new Random();
		
		/**
		 * 在0-n-1中随机选着m个数，不出现重复，每个数被选到的概率相同
		 * 输出时0-n-1中的m个数
		 * 
		 */
		public static void genKnuth(int n,int m){
			for(int i=0;i<n;i++){
				if(Math.abs(rand.nextInt())%(n-i)<m){
					System.out.printf("%d ",i);
					m--;
				}
			}
		}
		
		public static void main(String[] args) {
			genKnuth(200,20);
		}
}
