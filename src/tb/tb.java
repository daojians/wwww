package tb;

public class tb {
	public synchronized void fn1(){
		for (int i = 0; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+"fn1����ִ��");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public  void fn2(){
		for (int i = 0; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+"fn2����ִ��");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
