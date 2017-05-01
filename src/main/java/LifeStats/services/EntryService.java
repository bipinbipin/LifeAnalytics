package LifeStats.services;

import LifeStats.domain.Entry;

/**
 * Created by David Franzel on 4/27/2017.
 */
public interface EntryService {

    void deleteEntryById(Integer id);

    Entry getEntryById(Integer id);

    Entry saveEntry(Entry user);

    Iterable<Entry> findAllEntries();

}
