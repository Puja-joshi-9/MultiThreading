package Thread;

public class SynchronizedFbLike {
	public static void main(String[] args) {
		
		//Facebook page :Everest current likes 500
		
		final FacebookLike everestFbPagePicLike = new FacebookLike(500);
		
		Thread user1 = new Thread() {
			public void run() {
				everestFbPagePicLike.plusOne();
			}
			
		};
		
		Thread user2 = new Thread() {
			public void run() {
				everestFbPagePicLike.plusOne();
			}
			
		};
		
		Thread user3 = new Thread() {
			public void run() {
				everestFbPagePicLike.plusOne();
			}
			
		};
		
		Thread user4 = new Thread() {
			public void run() {
				everestFbPagePicLike.plusOne();
			}
			
		};
		
		//User1,2,3,4 hit like in Everest Facebook Page
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		
		
	}

}
