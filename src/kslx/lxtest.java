package kslx;

public final class lxtest {
	public static void main(String[] args) {	
//		kslx1 lx = new kslx1();
//		kslx1 lx1 = new kslx1();
//		
//		lx.start();lx1.start();
		
//		kslx2 lx = new kslx2();
//		kslx2 lx1 = new kslx2();
//		
//		Thread th = new Thread(lx);
//		Thread th1 = new Thread(lx1);
//		
//		th.start();
//		th1.start();
		
		kslx3 ks = new kslx3();
		
		ks.start();
		
		for(int i=0;i<20;i++){
			System.out.println(Thread.currentThread().getName()+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==10){
				try {
					ks.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
