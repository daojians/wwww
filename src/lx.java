
public class lx {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		
		System.out.println("��ǰ�߳���Ϊ��"+th.getName());
		
		th.setName("��������");
		
		System.out.println("�μ�"+th.getName());
	}

}
