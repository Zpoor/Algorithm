package cn.zpoor.newcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/*
	输入一个整数，将其转换成八进制数输出。 
		输入描述:
			输入包括一个整数N(0<=N<=100000)。


		输出描述:
			可能有多组测试数据，对于每组数据，
			输出N的八进制表示数。

			示例1
			输入
				7
				8
				9
			输出
				7
				10
				11
*/
public class IntegertoOctal {
	public static void main(String[] args) {

		/*
		 * 第一种方法 思路：整数装换成八进制字符串，字符串转数组，然后输出结果 Scanner input = new Scanner(System.in);
		 * while(input.hasNext()) { String str =
		 * Integer.toOctalString(input.nextInt());//把输入的整数装换成八进制的字符串返回 Integer result =
		 * Integer.parseInt(str);//把字符串转换成整数（不转其实提交也能通过，但是不完美）
		 * System.out.println(result); } input.close();
		 */

		/*
		 * 第二种方法：偏底层的一种实现
		 * 
		 * Scanner in = new Scanner(System.in); while (in.hasNext()) { int i =
		 * in.nextInt(); String str = "";//定义接收的空字符串 while(i != 0) {//核心代码 str += i %
		 * 8;//每次对8取余，但是得到的是八进制的反字符串，需要处理 i = i / 8;//最后得到0结束循环 } StringBuffer sb = new
		 * StringBuffer(str);//StringBuffer好用啊 String result =
		 * sb.reverse().toString();//字符串翻转然后toString() int finalRe =
		 * Integer.parseInt(result);//字符串转数字 System.out.println(finalRe);//输出 }
		 * in.close();
		 */

		/*
		 * 第三种方法：这种方法也很巧妙吗，我很喜欢
		 */
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));// 缓冲输入流
		String str;// 定义接收字符串
		try {
			while ((str = bufferedReader.readLine()) != null)// 判断如果读取一个文本行不为空
				System.out.println(Integer.toOctalString(Integer.parseInt(str)));//直接了当
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
