package cn.zpoor.basics;
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
	
	//第五种方法：临时变量法
	public static String reverse5(String s) {
		return s;
	}
	
	//第六种方法：栈方法
	public static String reverse6(String s) {
		return s;
	}
}
