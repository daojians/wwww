package pashan;

public class pashan extends Thread {
	public int time ;
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+"100Ã×");
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==10){
				System.out.println(Thread.currentThread().getName()+"ÅÀÍêÁË");
			}
		}
	}

}
