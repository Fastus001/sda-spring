package pl.fastus.sdaspring.injection;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Tom - 11.04.2021
 */
@Service
@RequiredArgsConstructor
public class WrapperService {

    private final ExampleService exampleService;

    @PostConstruct
    public void businessLogic(){
        exampleService.log();
    }
}
