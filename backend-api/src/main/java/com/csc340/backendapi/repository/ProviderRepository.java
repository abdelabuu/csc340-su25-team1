package com.csc340.backendapi.repository;

import com.csc340.backendapi.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
