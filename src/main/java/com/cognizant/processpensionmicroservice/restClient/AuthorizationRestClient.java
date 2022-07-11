package com.cognizant.processpensionmicroservice.restClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="authorizationService",url="${feign.url1}")
public interface AuthorizationRestClient {
    @GetMapping("/authorize")
    public Boolean authorization(@RequestHeader("Authorization") String token);
}
