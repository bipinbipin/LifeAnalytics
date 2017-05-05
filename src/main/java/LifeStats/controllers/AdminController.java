package LifeStats.controllers;

import LifeStats.domain.Diet;
import LifeStats.domain.Entry;
import LifeStats.domain.Exercise;
import LifeStats.domain.Physiological;
import LifeStats.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "/new-entry", method = RequestMethod.GET)
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

    @RequestMapping(value = "/physiological-submit",method = RequestMethod.POST)
    public String physTest( @RequestParam("vegFruit") Integer vegFruit,
                            @RequestParam("carbohydrate") Integer carbohydrate,
                            @RequestParam("dairy") Integer dairy,
                            @RequestParam("protein") Integer protein,
                            @RequestParam("sugar") Integer sugar,
                            @RequestParam("dietNotes") String dietNotes,
                            @RequestParam("run") Integer run,
                            @RequestParam("bike") Integer bike,
                            @RequestParam("bench") Integer bench,
                            @RequestParam("dip") Integer dip,
                            @RequestParam("pullUp") Integer pullUp,
                            @RequestParam("exerciseNotes") String exerciseNotes){

        Entry entry = new Entry();
        Physiological physiological = new Physiological();
        Exercise exercise = new Exercise();
        Diet diet = new Diet();
        exercise.setRunDistance(run);
        exercise.setBikeDistance(bike);
        exercise.setBenchWeight(bench);
        exercise.setDips(dip);
        exercise.setPullUps(pullUp);
        exercise.setExerciseNotes(exerciseNotes);
        diet.setCarbohydrates(carbohydrate);
        diet.setDairy(dairy);
        diet.setProtein(protein);
        diet.setSugar(sugar);
        diet.setDietNotes(dietNotes);
        physiological.setDiet(diet);
        physiological.setExercise(exercise);
        entry.setPhysiological(physiological);

        entryService.saveEntry(entry);


        return "redirect:/new-entry";
    }

}