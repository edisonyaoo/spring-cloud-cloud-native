package io.edy.cloudnative.consumer.impl.controller;

import io.edy.cloudnative.api.ProducerApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author edison yao (mailto: edisonyao1227@gmail.com)
 * @class InvokerController
 * @date 2021/6/27
 * @description
 */
@RestController
public class InvokerController {

  @Value("${consumer.msg}") public String msg;

  @Autowired private ProducerApi producerApi;

  @Autowired private DiscoveryClient discoveryClient;

  @RequestMapping("/hello")
  public String hello(@RequestParam("name") String name) {

    return producerApi.sayHello(name) + ", " + msg;
  }

  @RequestMapping("/services")
  public List<String> services() {
    return discoveryClient.getServices();
  }
}
