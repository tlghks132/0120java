package Thread;

public class MutexMain {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements 한 클래스의 인터턴스 생성
		ThreadObject threadImpl = new ThreadObject();
		
		//Thread 클래스의 생성자에 대입해서 Thread 인스턴스 생성
		Thread th1 = new Thread(threadImpl);
		Thread th2 = new Thread(threadImpl);
		
		//스레드 시작
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(60000);
			System.out.println(threadImpl.getResult());
		}catch(Exception e) {}
		

	}

}
