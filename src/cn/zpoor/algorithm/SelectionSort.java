package cn.zpoor.algorithm;
/*
选择排序
	思想：
		首先找到数组中的最小的那个元素，把它和数组的第一个元素位置交换（如果第一个元素是最小元素那么它就和自己交换）。
		在剩下的元素中找到最小的元素，将它和第二个元素交换位置，如此重复，正道将整个元素排序完成，这种叫做选择排序，
		就是不断地选择剩下元素中的最小者
*/
public class SelectionSort {
	private static int[] arr = {5,2,3,9,6};
	
	public static void main(String[] args) {
		selectionSort(arr);
		getReslut();
	}

	private static void getReslut() {
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}

	private static void selectionSort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			int k = i;//记录值
			for(int j = k+1;j<arr.length;j++) {//选择最小的值所对的索引
				if (arr[j]<arr[k]) {
					k = j;//找到最小值所对的索引
				}
			}
			//内层循环之后，找到最小的索引值，然后进行交换
			if (i != k) {
				//交换元素位置
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
	}
}
