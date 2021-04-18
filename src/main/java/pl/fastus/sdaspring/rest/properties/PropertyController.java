package pl.fastus.sdaspring.rest.properties;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tom - 18.04.2021
 */
@RestController
@RequiredArgsConstructor
public class PropertyController {

    private final BeanWithProperty beanWithProperty;
    private final PropertiesBasedComponent propertiesBasedComponent;

    @GetMapping("/api/property")
    public String getProperty(){
        return beanWithProperty.getInjectedValue();
    }

    @GetMapping("/api/properties")
    public PropertiesBasedComponent getProperties(){
        return propertiesBasedComponent;
    }
}
