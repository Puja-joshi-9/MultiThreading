package Thread;

public class TestSleepMethod extends Thread {

	public void run() {
		
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		
		TestSleepMethod t1 = new TestSleepMethod();
		TestSleepMethod t2 = new TestSleepMethod();
		TestSleepMethod t3 = new TestSleepMethod();
		
		t1.start();
		
		try {
			t1.join();           //t1.join(1500): start t2 after 1500 sec
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
