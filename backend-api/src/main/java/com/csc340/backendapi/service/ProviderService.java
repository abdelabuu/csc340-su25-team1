package com.csc340.backendapi.service;

import com.csc340.backendapi.model.Provider;
import com.csc340.backendapi.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    public Provider updateProvider(Long id, Provider updatedProvider) {
        updatedProvider.setId(id);
        return providerRepository.save(updatedProvider);
    }

    public void deleteProvider(Long id) {
        providerRepository.deleteById(id);
    }

    public Optional<Provider> getProviderById(Long id) {
        return providerRepository.findById(id);
    }
}
