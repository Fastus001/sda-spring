package pl.fastus.sdaspring.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Tom - 11.04.2021
 */
@Slf4j
@Component
public class EasyLog  implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("Mój pierwszy komponent");
        System.out.println("Easy log włączony!");
    }
}
