

public class lx6 implements Runnable {

	private int count = 10;
	private int num = 0;
	private boolean flag = false;
	private int hn = 0;
	
	@Override
	public void run() {
		while(!flag){
			sale();
		}
	}
	public synchronized void sale(){
		if(count<=0){
			flag=true;
			return;
		}
		if(Thread.currentThread().getName().equals("��ţ") && hn>0){return;}
		if(Thread.currentThread().getName().equals("��ţ")){
			hn++;
		}
		
		
		num++;
		count--;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"������"+num+"��ʣ"+count+"Ʊ");
	}
}
