package mt.study.programmingpearls;

import java.util.Random;

/**
 * �� n ������ѡ�� m ���������
 * �ص����ڸ�ѭ����
 * �������� n ��Ԫ�ص����飬�������һ�����������Ϊ 0 - (n - i) ֮�䣬
 * �ж����Ƿ�С�� m
 * i ÿ��ѭ���Լӣ�����˵����������ֻ�� m / n ���ʱ�ѡ�У�
 * ���ǰ�� n - m �ζ�û��ѡ��Ԫ�أ���ô�� n - m + 1 �ξͱ���ѡ��һ��Ԫ�أ�
 * ������ 100% �ģ������Ҳ�� 100%��
 * ѡ��һ��Ԫ���� m �Լ�����ʣ�µ� n - i ��Ԫ�ػ��� m - j ��Ԫ����Ҫѡ��
 * ÿ��Ԫ�ر�ѡ�еĸ�����һ���ļ� m / n, ����ѡ�еĸ���Ҳ��һ���ģ��� (n - m) / n ��
 * һ��ѭ�� O(N) ��ʱ�临�Ӷȡ�
 *
 */
public class Random_n_m {

		private static Random rand=new Random();
		
		/**
		 * ��0-n-1�����ѡ��m�������������ظ���ÿ������ѡ���ĸ�����ͬ
		 * ���ʱ0-n-1�е�m����
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
