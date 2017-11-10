package pashan;

public class test {

	public static void main(String[] args) {
		System.out.println("***************开始爬山了******************");
		pashan ps = new pashan();
		ps.setName("老年人");
		ps.time=500;
		ps.start();
		pashan ps1 = new pashan();
		ps1.setPriority(10);
		ps1.setName("年轻人");
		ps1.time=100;
		ps1.start();
	}
}
