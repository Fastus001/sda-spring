package pl.fastus.sdaspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.fastus.sdaspring.engine.SteamEngineService;
import pl.fastus.sdaspring.engine.WaterEngineService;

/**
 * Created by Tom - 11.04.2021
 */
@Configuration
public class EnginesConf {

    @Bean
    public SteamEngineService steamEngineService(){
        return new SteamEngineService();
    }

    @Bean
    public WaterEngineService waterEngineService(){
        return new WaterEngineService();
    }
}
