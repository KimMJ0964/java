package q.thread.ex2;

public class Task2 extends Thread{	
	
	// 20미만 홀수 출력
	@Override
	public void run() {
			try {
				for(int i = 0; i < 20; i++) {
					if(i % 2 == 1) {
						System.out.println(i + "\t");
					}
				Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
