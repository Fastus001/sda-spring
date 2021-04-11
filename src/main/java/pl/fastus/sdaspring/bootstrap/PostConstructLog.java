package pl.fastus.sdaspring.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Tom - 11.04.2021
 */
@Slf4j
@Component
public class PostConstructLog {

    @PostConstruct
    public void log(){
        log.info("Mój drugi component");
    }
}
