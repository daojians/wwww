
public class lx {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		
		System.out.println("当前线程名为："+th.getName());
		
		th.setName("初音殿下");
		
		System.out.println("参见"+th.getName());
	}

}
