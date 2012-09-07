
public class BinaryHexExchange {
	
		public static void main(String[] args) 
		{
			String binaryStr = "111000001100";
			System.out.println(binaryStr);
			System.out.print("16进制：");
			System.out.println(binaryToHex(binaryStr));	
			System.out.print("2进制：");
			System.out.println(hexToBinary(binaryToHex(binaryStr)));
		}
		
		public static String binaryToHex(String binaryStr){
			return Long.toHexString(Long.parseLong(binaryStr, 2));
		}
		
		public static String hexToBinary(String hexStr){
			return Long.toBinaryString(Long.parseLong(hexStr, 16));
		}
	}
