package cn.zpoor.basics;

import java.util.Scanner;

/*
 * 输入任意长的一个字符串，统计其字母、数字、空格及其他字符的数量。
 * 
 * 貌似是南京大学2018软件学院的复试题目（求字符串空格数目）
 * */
public class StringNumberStatistics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String sc = input.nextLine();
			char[] ch = sc.toCharArray();//字符串转字符数组
			//初始化各种要统计的数目
			int characterNumber = 0;
			int numbers = 0;
			int spaceNumber = 0;
			int otherNumber = 0;
			//循环判断
			for(int i = 0;i<ch.length;i++) {
				if (ch[i]>='0' && ch[i]<='9') {//数字条件
					numbers++;
				} else if ((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')) {//字母条件
					characterNumber++;
				} else if (ch[i] == ' ') {//空格条件
					spaceNumber++;
				} else {//其他条件
					otherNumber++;
				}
			}
			//输出处理结果
			System.out.println("字母的个数：" + characterNumber);
			System.out.println("数字的个数" + numbers);
			System.out.println("空格的个数" + spaceNumber);
			System.out.println("其他的个数" + otherNumber);
		}
		input.close();
	}
}
