package LifeStats.controllers;

import LifeStats.domain.Entry;
import LifeStats.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by David Franzel on 4/27/2017.
 */
@Controller
public class AdminController {

    @Autowired
    private EntryService entryService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String main(){
        return "/home/new-entry";
    }

    @RequestMapping(value = "/user/stats/{id}", method = RequestMethod.GET)
    public String mainPage(Model model,
                           Integer id){

        Entry user = entryService.getEntryById(id);
        model.addAttribute("user", user);

        return "/home/new-entry";
    }

}
