package pashan;

public class test {

	public static void main(String[] args) {
		System.out.println("***************��ʼ��ɽ��******************");
		pashan ps = new pashan();
		ps.setName("������");
		ps.time=500;
		ps.start();
		pashan ps1 = new pashan();
		ps1.setPriority(10);
		ps1.setName("������");
		ps1.time=100;
		ps1.start();
	}
}
