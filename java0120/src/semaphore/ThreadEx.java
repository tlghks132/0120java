package semaphore;

import java.util.concurrent.Semaphore;

public class ThreadEx extends Thread {
	// 세마포어 변수
	private Semaphore sem;

	// 외부에서 Semaphore를 주입 받는다
	public ThreadEx(Semaphore sem) {
		this.sem = sem;

	}

	public void run() {
		try {
			// lock을 취득 - 사용 개수가 1개씩 줄어듬
			sem.acquire();
		} catch (Exception e1) {
		}

		System.out.println("몬스터 생성");

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}

		System.out.println("몬스터 소멸");
		// lock을 해제 - 사용개수가 1개 늘어남
		sem.release();
	}

}
