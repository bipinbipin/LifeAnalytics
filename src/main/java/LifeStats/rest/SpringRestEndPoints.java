package LifeStats.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David Franzel on 4/27/2017.
 */
@RestController
@RequestMapping("/api")
public class SpringRestEndPoints {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "test";
    }

}
