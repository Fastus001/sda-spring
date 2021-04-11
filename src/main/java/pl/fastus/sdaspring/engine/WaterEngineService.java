package pl.fastus.sdaspring.engine;

/**
 * Created by Tom - 11.04.2021
 */
public class WaterEngineService implements EngineService {
    @Override
    public void startEngine() {
        System.out.println("Engine on water");
    }
}
