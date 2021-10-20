public class Test {
	public static void main(String a[]) {
		int n = 5;
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) 
			{
				System.out.print("  ");
			}
			for (int col = row; col <n; col++)  /// Condition only < to make peak
			{ 
				System.out.print("* ");
			}
			for (int col = row; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
