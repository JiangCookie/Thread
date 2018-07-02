package ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * ReentrantLockͬ������
 * @author jiang
 *����ReentrantLock�����lock()������ȡ��������unlock()�����ͷ���
 */
public class MyService {
	 private Lock lock=new ReentrantLock();
	 public void testMethod(){
		 lock.lock();
		 for(int i=0;i<5;i++){
			 System.out.println("ThreadName="+Thread.currentThread().getName()+(" "+(i+1)));
		 }
		 lock.unlock();
	 }
}
