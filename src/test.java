
public class test {
//	public static void main(String[] args) {
//		lx2 th = new lx2();
//		lx2 th2 = new lx2();
//		
//		th.setName("A");
//		th2.setName("B");
//		
//		th.setPriority(1);
//		th2.setPriority(10);
//		
//		th.start();
//		th2.start();
//	}
//	public static void main(String[] args) {
//		lx2 th = new lx2();
//		lx2 th2 = new lx2();
//		th.run();
//		
//		th2.run();
//	}	
//	public static void main(String[] args) {
//		lx3 r = new lx3();
//		Thread th = new Thread(r);
//		th.start();
//	}
	
//	public static void main(String[] args) {
//		Thread t = new Thread(new lx4());
//		System.out.println("�߳�tΪ�½���");
//		t.start();
//		System.out.println("�߳�tΪ������");
//	}
//	public static void main(String[] args) {
//		System.out.println("Wait");
//		lx5.bySec(5);
//		System.out.println("start");
//	}
	public static void main(String[] args) {
		lx6 lx = new lx6();
		
		Thread person1 = new Thread(lx,"����");
		Thread person2 = new Thread(lx,"��ţ");
		Thread person3 = new Thread(lx,"����");
		
		person1.start();
		person2.start();
		person3.start();		
	}
}
