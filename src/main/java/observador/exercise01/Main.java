package observador.exercise01;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Main {

	public static void main(String[] args) {

		Observable<String> messageSender = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
		
		messageSender.subscribe(new Observer<String>() {

			
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				System.out.println("Observer. Subscribed.");
			}

			public void onNext(String t) {
				// TODO Auto-generated method stub
				System.out.println("Observer. Received: " + t);
			}

			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("Observer. Error: " + e.getMessage());
			}

			public void onComplete() {
				// TODO Auto-generated method stub
				System.out.println("Observer. Completed");
			}
			
		});

	}



}
