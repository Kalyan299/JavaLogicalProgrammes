package array_Programmes;

public class Pgm141_Print_Array_Elements_In_Reverse_Order {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
