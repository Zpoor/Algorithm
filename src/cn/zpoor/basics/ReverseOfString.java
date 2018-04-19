package cn.zpoor.basics;

import java.util.Stack;

/*
 * 字符串反转常用的几种实现方式
 * 
 * 一般来说，字符串反转在Java面试题经常会被问到，要深刻的理解和研究。
 * 同时字符串反转在18年南京大学软件学院的Java上机考试中考到了，使用的是递归的方法。
 * 努力成为一个NJUer，Cheer Up
 * */
public class ReverseOfString {
	public static void main(String[] args) {
		System.out.println(reverse1("Hello1"));
		System.out.println(reverse2("Hello2"));
		System.out.println(reverse3("Hello3"));
		System.out.println(reverse4("Hello4"));
		System.out.println(reverse5("Hello5"));
		System.out.println(reverse6("Hello6"));
	}
	
	//第一种方法：递归
	public static String reverse1(String s) {
		int length = s.length();
		if (length<=1) {//最后返回的都是一个一个字符串
			return s;
		}
		String left = s.substring(0, length/2);//截取左边一半
		String right = s.substring(length/2,length);//截取右边一半
		return reverse1(right) + reverse1(left);//处理后的字符串进行拼接
	}
	
	//第二种方法：拼接字符串
	public static String reverse2(String s) {
		int length  = s.length();//数组长度
		String reverse = "";//空字符串
		for(int i = 0;i<length;i++) {//循环
			reverse = s.charAt(i) + reverse;//得到指定索引值，然后倒序拼接
		}
		return reverse ;//返回字符串处理结果
	}
	
	//第三种方法：数组倒序输出
	public static String reverse3(String s) {
		char[] arr = s.toCharArray();//把字符串拆分成char数组
		String reverse = "";//空字符串
		for(int i = s.length()-1;i>=0;i--) {//从后往前倒序输出
			reverse = reverse + arr[i];//字符串拼接
		}
		return reverse;//返回处理之后的结果
	}
	
	//第四种方法：内置reverse方法
	public static String reverse4(String s) {
		return new StringBuffer(s).reverse().toString();//不想解释了，太偷懒了
	}
	
	//第五种方法：临时变量法 交换两头数据
	public static String reverse5(String s) {
		char[] arr = s.toCharArray();//字符串转char数组
		int length = s.length()-1;//得到字符串的长度-1
		int halfLength = length/2;//得到一般的字符串长度
		for(int i = 0;i<=halfLength;i++) {//交换两头数组元素，很巧妙啊，小老板
			char temp = arr[i];//最前面定义为临时变量
			arr[i] = arr[length-i];//最后面和最前面交换
			arr[length-i] = temp;//临时变量（最前面的值）和最后面的值交换
		}
		return new String(arr);//返回处理之后的字符串
	}
	
	//第六种方法：栈方法(后进先出，小老板牛逼啊)
	
	public static String reverse6(String s) {
		char[] str = s.toCharArray();//字符串转char数组
		Stack<Character> stack = new Stack<>();//定义栈结构
		for(int i = 0;i<str.length;i++) {
			stack.push(str[i]);//压栈操作
		}
		String reverse = "";//空接受字符串
		for(int i = 0;i<str.length;i++) {
			reverse += stack.pop();//出栈（先进后出，所以最后进入的是5，然后最先出来的是5）
		}
		return reverse;
	}
}
