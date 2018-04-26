package cn.zpoor.pat.second;

import java.util.Scanner;

/*
A+B 和 C

浙江大学Pat乙级

 

思路：

　　long类型防止溢出

　　控制台输入

　　条件判断

　　输出结果（一定要注意格式）

题目描述
给定区间[-2的31次方, 2的31次方]内的3个整数A、B和C，请判断A+B是否大于C。

输入描述:
输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。
 

输出描述:
对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。
输入例子:
4

1 2 3

2 3 4

2147483647 0 2147483646

0 -2147483648 -2147483647
 

输出例子:
Case #1: false

Case #2: true

Case #3: true

Case #4: false
 * */
public class AandBandC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// 接收器
		int num = in.nextInt();// 接受你要测试多少次

		for (int i = 1; i <= num; i++) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();

			if (a + b > c) {// 判断a+b是否大于c
				// 注意输出格式
				System.out.println("Case #" + i + ": true");
			} else {
				System.out.println("Case #" + i + ": false");
			}
		}
		in.close();
	}
}
