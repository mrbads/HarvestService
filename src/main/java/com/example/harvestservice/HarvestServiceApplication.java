package com.example.harvestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class HarvestServiceApplication {

    @RequestMapping(value = "/talentclass")
    public Mono<String> talentList() {
            return Mono.just("Daniel Roos, Mas Stapel, Jesse Pronk, Ricardo Tillemans, Talia Santos, Kees Jan Koops, Bas van der Borden, Bart Ouwerkerk, Thomas Sterrenburg");
    }

    public static void main(String[] args) {
        SpringApplication.run(HarvestServiceApplication.class, args);
    }

}
