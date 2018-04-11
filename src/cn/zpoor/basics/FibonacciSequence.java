package cn.zpoor.basics;

import java.util.Scanner;

/*
Java-斐波拉契数列的三种实现方法
先看下百度百科对斐波拉契数列的定义：

　　　　　　斐波那契数列（Fibonacci sequence），又称黄金分割数列.
		   因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，
		   指的是这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，斐波纳契数列以如下被以递归的方法定义：
		  F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*） 反正就是一句话：斐波拉契牛逼。
*/
public class FibonacciSequence {
	public static void main(String[] args) {
		System.out.println("你要输出多少项？");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("基于数组实现：");
		getFib1(n);
		System.out.println("---------------------");
		System.out.println("基于变量实现：");
		getFib2(n);
		System.out.println("---------------------");
		System.out.println("基于递归实现：");
		for(int i = 1;i<=n;i++) {
			System.out.println("第" + i + "项" + getFib3(i));
		}
		in.close();
	}

	/*基于递归实现
	 *  @author 薛定谔的猫
	 * 这种方法最简单，但是最占用内存，特别是当n很大的时候
	 *
	 *
	 * 为什么递归得效率低？
	 * 递归效率低是函数调用的开销导致的。在一个函数调用之前需要做许多工作，
	 * 比如准备函数内局部变量使用的空间、搞定函数的参数等等，这些事情每次调用函数都需要做
	 * ，因此会产生额外开销导致递归效率偏低，所以逻辑上开销一致时递归的额外开销会多一些当然了，
	 * 通过有意识的组织代码的写法可以把某些递归写成尾递归，尾递归可以进行特殊的优化所以效率
	 * 会比普通的递归高一些，也不会因为递归太多导致栈溢出遍历树还不用递归的话，那么人肉写一个栈
	 * +深度优先遍历或者人肉队列+广度优先遍历，再辅以黑魔法给栈或者队列提速，应该会比递归快一些，
	 * 加速幅度和语言和写法相关，但在大多数情况下我觉得是得不偿失的，花了很大精力很可能效率提升不
	 * 明显
	 *
	 * 此回答转自知乎
	 * */
	
	private static int getFib3(int n) {
		if (n < 0) {
			return -1;//小于0是没有意义的
		} else if (n == 0) {
			return 0;//等于0也是没有什么意义的
		} else if (n == 1 || n == 2) {
			return 1;//前两项都是1
		} else {
			return (getFib3(n-1) + getFib3(n-2));
		}
	}

	//基于变量实现
	private static int getFib2(int n) {
		if (n < 0) {
			return -1;//小于0是没有什么意义的
		} else if (n == 0) {
			return 0;//等于0说实话也没有什么意义
		} else if (n == 1 || n == 2) {
			return 1;//第一项和第二项都是1，没毛病
		} else {
			int temp = 0;//当前项的变量值	
			int a = 1;//第一项
			int b = 1;//第二项

			for (int i = 3; i <= n; i++) {
				//交换变量
				temp = a + b;
				a = b;
				b = temp;
				System.out.println("第" + i + "项" + temp);
			}
			return temp;
		}
	}
	
	//基于数组实现
	private static int getFib1(int n) {
		if (n < 0) {
			return -1;//小于0没有什么意义
		} else if (n == 0) {
			return 0;//说实话，等于0也没有什么意义
		} else if (n == 1 || n == 2) {
			return 1;//第一项和第二项都是1
		} else {
			int[] fibArr = new int[n + 1];
			fibArr[0] = 0;
			fibArr[1] = fibArr[2] = 1;
			
			for(int i = 3;i <= n;i++) {
				fibArr[i] = fibArr[i-1] + fibArr[i-2];//当前项等于前两项相加
				System.out.println("第" + i + "项" + fibArr[i]);//输出当前项
			}
			return fibArr[n];
		}
	}
}
