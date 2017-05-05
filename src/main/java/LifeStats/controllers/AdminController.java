package LifeStats.controllers;

import LifeStats.domain.*;
import LifeStats.domain.VO.EntryVO;
import LifeStats.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

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
        return "/views/new-entry";
    }

    @RequestMapping(value = "/user/stats/{id}", method = RequestMethod.GET)
    public String mainPage(Model model,
                           Integer id){

        Entry user = entryService.getEntryById(id);
        model.addAttribute("user", user);

        return "/views/new-entry";
    }

    @RequestMapping(value = "/entry-submit",method = RequestMethod.POST)
    public String physTest(EntryVO entryVO){

        Entry entry = hydrateEntry(entryVO);
        entryService.saveEntry(entry);

        return "redirect:/new-entry";
    }

    private Entry hydrateEntry(EntryVO entryVO){

        Entry entry = new Entry();
        Physiological physiological = new Physiological();

        Exercise exercise = new Exercise();
        exercise.setRunDistance(entryVO.getRun());
        exercise.setBikeDistance(entryVO.getBike());
        exercise.setBenchWeight(entryVO.getBench());
        exercise.setDips(entryVO.getDip());
        exercise.setPullUps(entryVO.getPullUp());
        exercise.setExerciseNotes(entryVO.getExerciseNotes());

        Diet diet = new Diet();
        diet.setVeggiesFruit(entryVO.getVegFruit());
        diet.setCarbohydrates(entryVO.getCarbohydrate());
        diet.setDairy(entryVO.getDairy());
        diet.setProtein(entryVO.getProtein());
        diet.setSugar(entryVO.getSugar());
        diet.setDietNotes(entryVO.getDietNotes());
        physiological.setDiet(diet);
        physiological.setExercise(exercise);

        Safety safety = new Safety();
        safety.setEnergyLevel(entryVO.getEnergyLevel());
        safety.setSleepHours(entryVO.getSleepHours());
        safety.setSleepQuality(entryVO.getSleepQuality());
        if(entryVO.getSick() == null){
            safety.setIsSick(false);
        }else{
            safety.setIsSick(true);
        }
        safety.setHealthNotes(entryVO.getHealthNotes());
        safety.setTemperature(entryVO.getTemperature());
        safety.setPrecipitation(entryVO.getPrecipitation());
        safety.setSunExposure(entryVO.getSunExposure());
        if(entryVO.getLifeThreatened() == null){
            safety.setLifeThreatened(false);
        }else{
            safety.setLifeThreatened(true);
        }
        if(entryVO.getFinancialStress() == null){
            safety.setFinancialStress(false);
        }else{
            safety.setFinancialStress(true);
        }
        safety.setEnvironmentNotes(entryVO.getEnvironmentNotes());

        Social social = new Social();
        social.setInteractions(entryVO.getInteractions());
        social.setInteractionQuality(entryVO.getInteractionQuality());
        social.setSocialNotes(entryVO.getSocialNotes());

        Esteem esteem = new Esteem();
        if(entryVO.getReading() == null){
            esteem.setReading(false);
        }else{
            esteem.setReading(true);
        }
        if(entryVO.getVideo() == null){
            esteem.setVideo(false);
        }else{
            esteem.setVideo(true);
        }
        if(entryVO.getPodcast() == null){
            esteem.setPodcast(false);
        }else{
            esteem.setPodcast(true);
        }
        if(entryVO.getConversation() == null){
            esteem.setConversation(false);
        }else{
            esteem.setConversation(true);
        }
        esteem.setIntellectualQuality(entryVO.getIntellectualQuality());
        esteem.setIntellectualNotes(entryVO.getIntellectualNotes());
        esteem.setWorkHours(entryVO.getWorkHours());
        esteem.setWorkQuality(entryVO.getWorkQuality());
        esteem.setWorkNotes(entryVO.getWorkNotes());

        entry.setPhysiological(physiological);
        entry.setSafety(safety);
        entry.setSocial(social);
        entry.setEsteem(esteem);
        entry.setActualization(entryVO.getActualizationLevel());
        entry.setClosingNotes(entryVO.getClosingNotes());
        entry.setEntryDate(new Date());

        return entry;
    }

}