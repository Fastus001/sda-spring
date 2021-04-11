package pl.fastus.sdaspring.engine;

import org.springframework.stereotype.Service;

/**
 * Created by Tom - 11.04.2021
 */
@Service
public class PetrolEngineService implements EngineService {

    @Override
    public void startEngine() {
        System.out.println("Start pertol, Bruum Bruum");
    }
}
