package uz.jl.springdata.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev", "tes"})
public record Init() implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }

}
