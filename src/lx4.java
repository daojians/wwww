
public class lx4 implements Runnable{
	@Override
	public void run() {
		try {
			System.out.println("�߳�t�����У�");
			
			Thread.sleep(500);
			System.out.println("�߳�t��500�������ߺ���������!");
		} catch (InterruptedException e) {
			System.out.println("�̱߳��ж�");
			e.printStackTrace();
		}
		
	}
}
