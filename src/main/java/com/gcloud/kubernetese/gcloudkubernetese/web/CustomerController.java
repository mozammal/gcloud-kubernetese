package com.gcloud.kubernetese.gcloudkubernetese.web;

import com.gcloud.kubernetese.gcloudkubernetese.domain.model.Customer;
import com.gcloud.kubernetese.gcloudkubernetese.domain.model.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping(path = "/customers")
public class CustomerController {

  private final CustomerRepository customerRepository;

  public CustomerController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @PostMapping()
  @ResponseBody
  public Mono<Customer> addCustomer(@RequestBody Customer customer) {
    return customerRepository.save(customer);
  }

  @GetMapping()
  @ResponseBody
  public Flux<Customer> findAllCustomers() {
    return customerRepository.findAll();
  }
}
