package paobu;

public class jlp implements Runnable {
	public int juli=1000;
	@Override
	public void run() {
		while(true){
		synchronized (this) {			
				if(juli<=100){
					break;
				}		
			System.out.println(Thread.currentThread().getName()+"�õ��˽�����");
			
			for (int i = 0; i < 100; i+=10) {
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+"����"+(i+10)+"��");				
			}
			juli-=100;
		}
		
	}
	
}
}