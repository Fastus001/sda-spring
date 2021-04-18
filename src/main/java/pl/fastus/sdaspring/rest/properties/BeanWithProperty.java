package pl.fastus.sdaspring.rest.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Tom - 18.04.2021
 */
@Getter
@Component
public class BeanWithProperty {

    @Value("${pl.sdacademy.example}")
    private String injectedValue;


//    public BeanWithProperty(@Value("${pl.sdacademy.example}") String injectedValue) {
//        this.injectedValue = injectedValue;
//    }
}
