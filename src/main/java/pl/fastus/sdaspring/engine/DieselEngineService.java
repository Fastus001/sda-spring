package pl.fastus.sdaspring.engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Tom - 11.04.2021
 */
@Service
public class DieselEngineService implements EngineService {

    @Override
    public void startEngine() {
        System.out.println("Start diesel!!");
    }
}
