package cn.zpoor.newcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	题目描述
		给定一个句子（只包含字母和空格）， 将句子中的单词位置反转，单词用空格分割, 单词之间只有一个空格，前后没有空格。
		比如： （1） “hello xiao mi”-> “mi xiao hello”
	
	输入描述:
		输入数据有多组，每组占一行，包含一个句子(句子长度小于1000个字符)

	输出描述:
		对于每个测试示例，要求输出句子中单词反转后形成的句子

	示例1
		输入
			hello xiao mi
		输出
			mi xiao hello

	思路把字符串按照空格分割，保存在新的字符串数组里面，然后倒序输出
*/
public class SentenceReverse {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String inputString = bf.readLine();//读取输入的字符串
		String[] numbers = inputString.split(" ");//空格分割得到新的字符串数组
		
		for (int i = numbers.length-1;i>=0;i--) {//反向输出
			if (i == 0) {//如果字符串数组只有一个元素，直接输出
				System.out.print(numbers[i]);
			} else {//如果有2个或者以上的元素，直接输出，但是要在元素之间加空格
				System.out.print(numbers[i] + " ");
			}
		}
	}
}
