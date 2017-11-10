package tb;

public class test {
	public static void main(String[] args) {
		final tb t = new tb();
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				t.fn1();
				
			}
		};
		
		Thread th = new Thread(r1);
		th.start();
		
			Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				t.fn1();			
			}
		};		
		Thread ts = new Thread(r2);
		ts.start();
	}

}
