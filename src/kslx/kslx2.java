package kslx;

public class kslx2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <20; i++) {
			System.out.println("你好，来自线程"+Thread.currentThread().getName()+":"+i);
		}
	}

}
