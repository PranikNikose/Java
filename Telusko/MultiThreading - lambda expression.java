
class FirstCode {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Nikose");
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Pranik");
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
			}
		});

		t1.start();
		t2.start();

	}
}
