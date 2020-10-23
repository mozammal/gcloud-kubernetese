package com.gcloud.kubernetese.gcloudkubernetese.domain.model;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, Long> {}
