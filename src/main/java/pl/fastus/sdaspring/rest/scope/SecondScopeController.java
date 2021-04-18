package pl.fastus.sdaspring.rest.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Tom - 18.04.2021
 */
@RestController
@RequiredArgsConstructor
public class SecondScopeController {

    private final RandomIdProvider randomIdProvider;

    @GetMapping("/api/second-random-id")
    public UUID getSecondId(){
        return randomIdProvider.getRandomId();
    }
}
