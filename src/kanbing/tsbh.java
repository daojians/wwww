package kanbing;

public class tsbh extends Thread {
	@Override
	public void run() {
		System.out.println("����ſ�ʼ����");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
