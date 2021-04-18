package pl.fastus.sdaspring.rest.scope;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

/**
 * Created by Tom - 18.04.2021
 */
@Getter
@RequestScope
@Component
public class RandomIdProvider {

    private final UUID randomId = UUID.randomUUID();
}
