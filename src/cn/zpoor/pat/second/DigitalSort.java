package cn.zpoor.pat.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	题目描述
		给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
		A1 = 能被5整除的数字中所有偶数的和；
		A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
		A3 = 被5除后余2的数字的个数；
		A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
		A5 = 被5除后余4的数字中最大数字。

	输入描述:
		每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。


	输出描述:
		对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。

		若其中某一类数字不存在，则在相应位置输出“N”。

	输入例子:
		13 1 2 3 4 5 6 7 8 9 10 20 16 18

	输出例子:
		30 11 2 9.7 9
*/
public class DigitalSort {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while ((str = bf.readLine()) != null) {
			// 定义分类数字初始的个数
			int A1 = 0;
			int A2 = 0;
			int A3 = 0;
			int A4 = 0;
			int A5 = 0;
			int cnt2 = 0;
			int cnt4 = 0;
			String[] strs = str.split(" ");// 空格分割
			for (int i = 1; i < strs.length; i++) {
				int curNum = Integer.parseInt(strs[i]);
				if (curNum % 5 == 0 && (curNum & 1) == 0) {//被5整除，并且是偶数，位运算这么牛逼的吗？
					A1 += curNum;
				} else if (curNum % 5 == 1) {//除5余1，交错求和
					if ((cnt2 & 1) == 1) {
						A2 -= curNum;
					} else {
						A2 += curNum;
					}
					cnt2++;
				} else if (curNum % 5 == 2) {//除5余2的数字个数
					A3++;
				} else if (curNum % 5 == 3) {//除5余3的总数
					A4 += curNum;
					cnt4++;
				} else if (curNum % 5 == 4) {//除5余4中的最大值
					A5 = Math.max(A5, curNum);
				}
			}
			String res = "";
			if (cnt4 != 0) {
				res = String.format("%d %d %d %.1f %d", A1, A2, A3, A4 * 1.0 / cnt4, A5);
			} else {
				res = String.format("%d %d %d %c %d", A1, A2, A3, 'N', A5);
			}
			//这段正则表达式很强，我还看不懂
			System.out.println(res.replaceAll("(^0{1})|(0{1}$)", "N").replaceAll("\\s{1}0{1}\\s{1}", " N "));
		}
	}
}
