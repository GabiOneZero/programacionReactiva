package prueba.webFlux;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/")
public class Controller {
	
	@GetMapping(path = "/numbers", produces = "text/event-stream")
	public Flux<Integer> numbers(){
		
		//implementation
		Flux<Integer> flux = Flux.range(1,30).delayElements(Duration.ofSeconds(1));
		
		
		return flux;
	}

}
