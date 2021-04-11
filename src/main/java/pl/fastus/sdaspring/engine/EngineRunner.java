package pl.fastus.sdaspring.engine;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Tom - 11.04.2021
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class EngineRunner {

    private final EngineService steamEngineService;

//    public EngineRunner(@Qualifier(value = "dieselEngineService") EngineService engineService) {
//        this.engineService = engineService;
//    }



    @PostConstruct
    public void runEngine(){
        steamEngineService.startEngine();
    }
}
