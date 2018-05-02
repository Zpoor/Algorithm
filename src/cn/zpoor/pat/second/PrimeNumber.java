package cn.zpoor.pat.second;

import java.util.Scanner;

/*
	令Pi表示第i个素数。现任给两个正整数M <= N <= 10000，请输出PM到PN的所有素数。

	输入描述:
	输入在一行中给出M和N，其间以空格分隔。


	输出描述:
	输出从PM到PN的所有素数，每10个数字占1行，其间以空格分隔，但行末不得有多余空格。

	输入例子:
	5 27

	输出例子:
	11 13 17 19 23 29 31 37 41 43

	47 53 59 61 67 71 73 79 83 89

	97 101 103
*/
public class PrimeNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int m = input.nextInt();//接收第一个整数
        int n = input.nextInt();//接收第二个整数
        int x = 2;//最小素数是2，记住1不是素数（大于1的，能被1或者本身整除的数是素数）
        int cnt = 0;//记录素数个数
        int cnt2 = 0;//输出规范，十个换行
        while (true) {
            if (isPrime(x)) {//判断素数
                cnt++;//个数+1
                if (cnt >= m && cnt <= n) {//限定输出素数范围
                    if (cnt2 == 9) {
                        System.out.println(x);//换行输出
                        cnt2 = 0;
                    } else if (cnt != n) {//输出条件
                        System.out.print(x + " ");
                        cnt2++;
                    }else {
                        System.out.println(x);
                    }
                }
            }
 
            if (cnt > n) {//直接结束
                break;
            }
            x++;//给定参数
        }
    }
 
    //判定一个数是不是素数，如果是返回true，不是返回false
    private static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}