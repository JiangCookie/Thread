package Lock;

public class DaemonThread extends Thread{
	private int i=0;
	public void run(){
		try {
			while(true){
				System.out.println("I am alive");								
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {		
		try {
			Thread thread=new DaemonThread();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
