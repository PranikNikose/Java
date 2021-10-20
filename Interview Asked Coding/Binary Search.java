import java.util.Arrays;

public class Test {
	public static void main(String a[]) 
	{
		int num[] = { 1, 2, 4, 5, 67, 3, 4, 6, 7, 9 };
		int find = 7;
		
		Arrays.sort(num);
		
		for (int k : num) {
			System.out.print(k + ",");
		}
		
		int low = 0;
		int high = num.length - 1; // 6

		while (low <= high) // 0<=6
		{
			int mid = (low + high) / 2; // 3

			if (find == num[mid]) // 3
			{
				System.out.println("Found at index : " + mid);
				break;
			} 
			else if (find > num[mid]) // 7>4
			{
				low = mid + 1;
			} else if (find < num[mid]) // 7>4
			{
				high = mid - 1;
			}

		}
		System.out.println("stoped");
	}
}
