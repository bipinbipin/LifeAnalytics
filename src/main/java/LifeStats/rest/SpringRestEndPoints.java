package LifeStats.rest;

import LifeStats.domain.Entry;
import LifeStats.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by David Franzel on 4/27/2017.
 */
@RestController
@RequestMapping("/api")
public class SpringRestEndPoints {

    @Autowired
    private EntryService entryService;

    @RequestMapping(value = "/entry/{id}", method = RequestMethod.GET)
    public Entry test(@PathVariable int id){

        return entryService.getEntryById(id);
    }

}
