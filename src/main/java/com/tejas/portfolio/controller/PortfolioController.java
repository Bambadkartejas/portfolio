package com.tejas.portfolio.controller;

import com.tejas.portfolio.model.Profile;
import com.tejas.portfolio.service.PortfolioService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
public class PortfolioController {

    private final PortfolioService service;

    public PortfolioController(PortfolioService service) {
        this.service = service;
    }

        @GetMapping("/dashboard")
        public String showUi() {
            return "forward:/index.html";
        }
  


    @GetMapping("/profile")
    public Profile profile() {
        return service.getProfile();
    }
    
   

}
