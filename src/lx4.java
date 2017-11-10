
public class lx4 implements Runnable{
	@Override
	public void run() {
		try {
			System.out.println("线程t在运行！");
			
			Thread.sleep(500);
			System.out.println("线程t在500毫秒休眠后重新运行!");
		} catch (InterruptedException e) {
			System.out.println("线程被中断");
			e.printStackTrace();
		}
		
	}
}
