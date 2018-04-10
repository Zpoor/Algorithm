package cn.zpoor.algorithm;
/*
插入排序

	1、分析：
		         插入排序算法有种递归的思想在里面，它由N-1趟排序组成。初始时，只考虑数组下标0处的元素，只有一个元素，显然是有序的。
	      	第一趟 对下标 1 处的元素进行排序，保证数组[0,1]上的元素有序；
	      	第二趟 对下标 2 处的元素进行排序，保证数组[0,2]上的元素有序；
                          第N-1趟对下标 N-1 处的元素进行排序，保证数组[0,N-1]上的元素有序，也就是整个数组有序了。

	      	它的递归思想就体现在：当对位置 i 处的元素进行排序时，[0,i-1]上的元素一定是已经有序的了。
	
	2、算法复杂度分析：
		时间复杂度：
			平均情况O(n^2)
			最坏情况O(n^2)
			最好情况O(n)
		
		空间复杂度：O(n)
		
		稳定性：稳定
		
*/
public class InsetionSort {
	private static int[] arr = {3,11,2,5,8,6};
	public static void main(String[] args) {
		insertionSort(arr);
		getResult();
	}
	//输出排序结果
	private static void getResult() {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
	//插入排序实现
	private static void insertionSort(int[] arr2) {
		int i;
		int j;
		int temp;//从带插入数组中取出第一个元素
		for(i = 1;i<arr.length;i++) {
			temp = arr[i];
			//j = i-1即为有序数组最后一个元素（与待插入元素相邻）的下表
			//j>=0对其进行边界限制。第二个为插入的判断条件
			for(j = i-1;j>=0 && arr[j]>temp;j--) {
				arr[j+1] = arr[j];//如果不是合适的位置，有序元素向后移动
			}
			arr[j+1] = temp;//找到合适的位置，将元素插入
		}
	}
}
