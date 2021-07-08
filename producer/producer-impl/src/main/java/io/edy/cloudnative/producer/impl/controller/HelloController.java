package io.edy.cloudnative.producer.impl.controller;

import io.edy.cloudnative.api.ProducerApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaozp (mailto: yaozp@primeton.com)
 * @class HelloController
 * @date 2021/6/27
 * @description
 */
@RestController
public class HelloController implements ProducerApi {

    @Override
    public String sayHello(String name) {
        return "Producer say hello to " + name;
    }
}
