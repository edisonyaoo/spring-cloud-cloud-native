package io.edy.cloudnative.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author edison yao (mailto: edisonyao1227@gmail.com)
 * @interface ProducerApi
 * @date 2021/6/27
 * @description
 */
@FeignClient(name = "spring-cloud-cloud-native-producer")
public interface ProducerApi {

    /**
     * sayHello
     * @param name
     * @return
     */
    @GetMapping("/hello")
    String sayHello(@RequestParam("name") String name);

}
