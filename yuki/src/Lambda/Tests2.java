package Lambda;

public class Tests2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread tt=new Thread(
		()->{for(int i=1;i<5;i++) {
			System.out.println("Child Thread"+i);
		}
		}
		
		
		
		
		
		
		);
tt.start();

		
		
		
	}

}
