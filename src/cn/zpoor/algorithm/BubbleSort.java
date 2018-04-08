package cn.zpoor.algorithm;
/*
冒泡排序的实现
	思想：
		比较相邻的元素。如果第一个比第二个大，就交换他们两个。
		对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
		针对所有的元素重复以上的步骤，除了最后一个。
		持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
*/

public class BubbleSort {
	private static int arr[] = {2,45,3,7,98,21};

	public static void main(String[] args) {
		bubblesort(arr);
		getResult();
	}

	private static void getResult() {
		for (int x : arr) {
			// 输出排序之后的结果
			System.out.print(x + " ");
		}
	}

	private static void bubblesort(int[] arr) {
		/*
		 * 设定标志，如果第一次循环比较时没有发生交换，说明数组是 升序的，不用排序，直接结束循环
		 */
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {//外层循环控制循环次数
			for (int j = 0; j < arr.length - i - 1; j++) {//内层循环控制每次循环里比较的次数
				if (arr[j] > arr[j + 1]) {//交换数组元素     注意如果是降序改成<号
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("no sort");
		}
	}
}
