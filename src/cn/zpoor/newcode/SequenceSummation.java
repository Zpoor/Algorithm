package cn.zpoor.newcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*求数列的和
	
	题目描述
		数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
		
	输入描述:
		输入数据有多组，每组占一行，由两个整数n（n < 10000）和m(m < 1000)组成，n和m的含义如前所述。
		
	输出描述:
		对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
		
	示例1
		输入
			81 4
			2 2
			
		输出
			94.73
			3.41
*/
@SuppressWarnings("unused")
public class SequenceSummation {
	public static void main(String[] args) throws IOException {
	/*	第一种方法，简单，不用考虑考虑空格，直接格式化输出就行了
	 * @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double m = input.nextDouble();
		double n = input.nextDouble();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += m;
			m = Math.pow(m, 0.5);
		}
		System.out.printf("%.2f", sum);*/
		
		//第二种 很简单，我就不写注释了
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		while((inputStr = bf.readLine()) != null) {
			String[] input = inputStr.split(" ");
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			double result = 0;
			double num = m;
			for(int i = 0;i<n;i++) {
				result += num;
				num = Math.sqrt(num);
			}
			System.out.printf("%.2f",result);
			/*这样写有点问题
			 *result = (Math.round(result*100));
			if (result % 100 == 0) {
				System.out.println(result/100 + ".00");
			} else if (result % 10 == 0) {
				System.out.println(result/100.0 + "0");
			} else {
				System.out.println(result/100.0);
			}*/
		}
	}
}