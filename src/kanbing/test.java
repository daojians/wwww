package kanbing;

public class test {
	public static void main(String[] args) {
		
		kbh kb = new kbh();
		kb.setPriority(10);
		kb.start();
		Thread.currentThread().setName("普通号开始看病");
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName()+i);
			if(i==10){
				try {
					kb.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		}
	}
}
