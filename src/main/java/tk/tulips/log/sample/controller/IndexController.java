package tk.tulips.log.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ltass on 2017/2/25.
 */

@RestController
@Slf4j
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String sayHello(){
        log.info("app info");
        log.debug("app debug");
        log.error("app error");
        log.trace("app trace");
        return "Hello World";
    }
}
