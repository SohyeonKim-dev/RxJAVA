package reactivejava;

import io.reactivex.Observable;

public class FirstExample {	
	public void emit() {	
		// Observable class = 데이터의 변화가 발생하는 data source
		Observable.just("Hello", "RxJava2!!") // just - 가장 단순한 observable 선언 방식 
		.subscribe(System.out::println); // subscribe -> Observable을 구독 
	}

	public static void main(String args[]) { 
		FirstExample demo = new FirstExample();
		demo.emit(); // 앞서 정의한 emit 함수 호출 
	}	
}
