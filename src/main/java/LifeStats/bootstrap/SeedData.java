package LifeStats.bootstrap;

import LifeStats.domain.Entry;
import LifeStats.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by David Franzel on 5/3/2017.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private EntryService entryService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        generateUsers();
    }

    private void generateUsers(){

        Entry entry = new Entry();

        entryService.saveEntry(entry);

    }

}
