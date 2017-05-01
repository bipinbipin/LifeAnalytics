package LifeStats.services.Impl;

import LifeStats.domain.Entry;
import LifeStats.repositories.EntryRepository;
import LifeStats.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by David Franzel on 4/27/2017.
 */
@Service
public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryRepository userRepository;

    @Override
    public void deleteEntryById(Integer id) {
        userRepository.delete(id);
    }

    @Override
    public Entry getEntryById(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public Entry saveEntry(Entry user) {
        return userRepository.save(user);
    }

    @Override
    public Iterable<Entry> findAllEntries() {
        return userRepository.findAll();
    }
}
