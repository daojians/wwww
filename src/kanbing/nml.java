package kanbing;

public class nml {
	public static void main(String[] args) {
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i <=10; i++) {
					System.out.println("�ⲡ�����ڿ���");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		
		final Thread b1 = new Thread(r2);
		b1.start();
		
			Runnable r3 = new Runnable() {			
			@Override
			public void run() {
				
				for (int i = 0; i <=50; i++) {
					System.out.println("��ͨ�������ڿ���");
					if(i==10){
						try {
							b1.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		
		Thread b2 = new Thread(r3);
		b2.start();
		
		
	}
}
