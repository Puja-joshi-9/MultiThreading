package Thread;

public class FacebookLike {
	
	public Integer likes = 0;
	
	//set current page likes
	
	public FacebookLike(Integer likes) {
		this.likes = likes;
		
	}
	
	//Synchronized method call solve problem of Multi-thread problem
	public synchronized void plusOne() {
		
		likes++;
		System.out.println(Thread.currentThread().getName()+"Likes:"+likes);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
