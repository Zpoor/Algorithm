package cn.zpoor.newcode;

import java.math.BigInteger;
import java.util.Scanner;

/*计算a+b的和



	每行包行两个整数a和b

	对于每行输入对应输出一行a和b的和

	输入

	1 5

	输出

	6
*/
public class AaddB {
	public static void main(String[] args) {
		
		/*这是第一种方法没有考虑溢出问题，但是可以通过
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			System.out.println(in.nextInt() + in.nextInt());
		}
		in.close();*/
		
		
		//第二种方法考虑到整数溢出的问题，然后用大整数来接受输入的整数
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			BigInteger a = input.nextBigInteger();
			BigInteger b = input.nextBigInteger();
			System.out.println(a.add(b));
		}
		input.close();
	}
}
