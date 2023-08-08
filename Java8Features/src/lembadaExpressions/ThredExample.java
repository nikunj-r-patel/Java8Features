package lembadaExpressions;

public class ThredExample {
	public static void main(String[] args) {
		// creating first thread- t1 nikunj
		Runnable thread1 = () -> {
			try {
				for (int i = 1; i <= 10; i++) {
					System.out.println("the value is: " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(thread1);
		t1.setName("nikunj");
		t1.start();
		// creating second thread- t2 neo
		Runnable thread2 = () -> {
			try {
				for (int i = 1; i <= 10; i++) {
					System.out.println(2 + " X " + i + " = " + 2 * i);
					Thread.sleep(2000);
				}
			} catch (InterruptedException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		};
		Thread t2 = new Thread(thread2);
		t2.setName("neo");
		t2.start();
	}
}
