package cn.zpoor.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Java判断一个数是不是素数
 * 	素数：
 * 		质数（prime number）又称素数，有无限个。
 *		质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。
 *  
 *  基本思路：
 *  	在一般领域，对正整数n，如果用2到 (根号n) 之间的所有整数去除，均无法整除，则n为质数。
 *		质数大于等于2 不能被它本身和1以外的数整除
 */
public class IsPrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//接收器，接受键盘输入的数字
		System.out.println("请输入一个大于1的整数：");//友好提示符
		
		try {
			int num = in.nextInt();
			
			if (isPrime(num)) {//判断isPrime返回过来的值
				System.out.println(num + "是素数");
			} else {
				System.out.println(num + "不是素数");
			}
		} catch (InputMismatchException e) {//捕获非法输入异常
			System.out.println("请输入整数");
		}
		in.close();//关闭资源
	}

	/**
	 * 判断一个数是否是一个素数
	 * @param a 要判断的数
	 * @return true false 是或者不是*/
	private static boolean isPrime(int num) {
		boolean flag  =true;//先假设num是一个素数
		
		if (num < 2) {
			return false;//素数不小于2
		} else {
			/*为什么要用Math.sqrt(i)方法（返回正确舍入的 double 值的正平方根）？
 				因为，只需要判断到这个值，
 				例如：判断100，只需要判断到10就可以了，10*10
 				100=n1*n2,那么n1或者n2一定有个<=10,所以只需要判断的10
				提高效率*/
			for(int i = 2;i<=Math.sqrt(num);i++) {//提高效率
				if (num % i == 0) {//如果被1和本身之外的数整除就说明不是素数
					flag = false;//判定他不是一个素数
					break;//结束循环，只要能整除了，接下面的循环也就没什么意义了
				}
			}
		}
		return flag;//返回一个结果，说明他是素数还是不是素数
	}
}
