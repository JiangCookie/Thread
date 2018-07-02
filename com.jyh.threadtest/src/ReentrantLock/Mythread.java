package ReentrantLock;

public class Mythread extends Thread{
	private MyService service;
	public Mythread(MyService service){
		super();
		this.service=service;
	}
}
