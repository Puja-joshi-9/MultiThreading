package Thread;

public class ThreadClass extends Thread {
	
	
	public void run() {
		
		System.out.println("ThreadClass>Run>HELLO");
	}
	public static void main(String[] args) {
		
		ThreadClass t = new ThreadClass();
		t.start();
		System.out.println("ThreadClass: Main");
	}

}
