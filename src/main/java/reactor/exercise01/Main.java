package reactor.exercise01;

import reactor.core.publisher.Flux;

public class Main {

	public static void main(String[] args) {

		Flux<String> messageSender = Flux.just("Mensaje", "Mensaje 2", "Mensaje 3");
		
		messageSender.subscribe(message -> System.out.println("Consumer. Received: " + message),
				error -> System.out.println("Consumer. Error: " + error.getMessage()),
				() -> System.out.println("Consumer. Completed"));
	}

}
