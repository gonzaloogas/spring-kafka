package cl.gogas.provider.spring_kafka_provider;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProviderApplication.class, args);
	}

	@Bean
	CommandLineRunner init(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			kafkaTemplate.send("topic-spring-01", "Hola mundo kafka desde spring boot PRODUCER para CONSUMER");
		};
	}

}
