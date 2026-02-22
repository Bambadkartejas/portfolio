package com.tejas.portfolio.service;

import com.tejas.portfolio.model.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    public Profile getProfile() {
        return new Profile(
                "Tejas Bambadkar",
                "Java & Spring Boot Developer",
                4,
                List.of(
                        "Java", "Spring Boot", "Microservices",
                        "REST APIs", "JWT", "ELK", "Linux"
                )
        );
    }
}
