package pl.fastus.sdaspring.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by Tom - 11.04.2021
 */
@Component
@Slf4j
public class ExampleService {

    public void log(){
        log.info("Examples service");
    }
}
