package pl.fastus.sdaspring.rest.properties;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Tom - 18.04.2021
 */
@Data
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "pl.sdacademy")
public class PropertiesBasedComponent {

    private String firstProperty;
    private Integer secondProperty;
}
