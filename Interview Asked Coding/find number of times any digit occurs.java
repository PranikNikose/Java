class FirstCode {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			String str = Integer.toString(i);

			if (str.contains("3")) {
				count = count + 1;
				System.out.println(str + " " + str.contains("3") + " " + count);
				// System.out.println(count);
			}
		}
		System.out.println(count);
	}
}
