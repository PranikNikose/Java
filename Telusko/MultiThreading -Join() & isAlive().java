
class FirstCode {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
			}
		});

		//System.out.println("Bye " + t1.isAlive()+ " "+ t2.isAlive());
		t1.start();
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {

		}
		
		
		t2.start();
		//System.out.println("Bye " + t1.isAlive()+ " "+ t2.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println("Bye " + t1.isAlive()+ " "+ t2.isAlive());

	}
}
