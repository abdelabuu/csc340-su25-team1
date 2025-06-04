package com.csc340.backendapi.controller;

import com.csc340.backendapi.model.Provider;
import com.csc340.backendapi.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/providers")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @PostMapping
    public Provider createProvider(@RequestBody Provider provider) {
        return providerService.createProvider(provider);
    }

    @GetMapping
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    @PutMapping("/{id}")
    public Provider updateProvider(@PathVariable Long id, @RequestBody Provider provider) {
        return providerService.updateProvider(id, provider);
    }

    @DeleteMapping("/{id}")
    public void deleteProvider(@PathVariable Long id) {
        providerService.deleteProvider(id);
    }

    @GetMapping("/{id}")
    public Optional<Provider> getProviderById(@PathVariable Long id) {
        return providerService.getProviderById(id);
    }
}
