package paobu;

public class test {
	public static void main(String[] args) {
		jlp p = new jlp();
		
		for (int i = 1; i <= 10; i++) {
			 new Thread(p,i+"Ñ¡ÊÖ").start();			
			
		}
	}
}
