package consumer;

public class Main {

	public static void main(String[] args) {
		
		//공유 자원 생성
		Product product = new Product();
		
		//Thread 클래스를 상속받은 클래스의 인스턴스를 만들고 스레드로 동작
		Customer customer = new Customer(product);  //꺼내는것 (소비 하는 거)
		Producer producer = new Producer(product);  //저장 하는 것 (만드는거)
		
		customer.start();
		producer.start();
	}

}
