package com.gcloud.kubernetese.gcloudkubernetese;

import com.gcloud.kubernetese.gcloudkubernetese.domain.model.Customer;
import com.gcloud.kubernetese.gcloudkubernetese.domain.model.CustomerRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class GcloudKuberneteseApplication {

  public static void main(String[] args) {
    SpringApplication.run(GcloudKuberneteseApplication.class, args);
  }

  @Bean
  ApplicationRunner init(CustomerRepository customerRepository) {

    String[][] data = {{"mozammal", "hossain"}, {"nasrin", "khatun"}, {"ayub", "rahman"}};

    return args -> {
      customerRepository
          .deleteAll()
          .thenMany(
              Flux.just(data)
                  .map(
                      array -> {
                        return new Customer(array[0], array[1]);
                      })
                  .flatMap(customerRepository::save));
    };
  }
}
