package kslx;

public class kslx2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <20; i++) {
			System.out.println("��ã������߳�"+Thread.currentThread().getName()+":"+i);
		}
	}

}
