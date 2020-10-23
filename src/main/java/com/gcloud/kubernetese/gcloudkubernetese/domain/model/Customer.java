package com.gcloud.kubernetese.gcloudkubernetese.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  private String firstName;
  private String lastName;
}
