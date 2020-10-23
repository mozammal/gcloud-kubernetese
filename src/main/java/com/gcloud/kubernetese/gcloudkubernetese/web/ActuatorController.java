package com.gcloud.kubernetese.gcloudkubernetese.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ActuatorController {

  @GetMapping("/")
  public Flux<String> getRoot() {
    return Flux.just("still alive for you");
  }
}
