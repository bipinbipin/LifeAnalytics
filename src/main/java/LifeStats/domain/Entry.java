package LifeStats.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by David Franzel on 4/27/2017.
 */
@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer entryId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Physiological physiological;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Safety safety;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Social social;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Esteem esteem;

    private Integer actualization;
    private String closingNotes;

    private Date entryDate;

    public Entry(){}

    public String getClosingNotes() {
        return closingNotes;
    }

    public void setClosingNotes(String closingNotes) {
        this.closingNotes = closingNotes;
    }

    public Date getEntryDate(){
        return entryDate;
    }

    public void setEntryDate(Date entryDate){
        this.entryDate = entryDate;
    }

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    public Physiological getPhysiological() {
        return physiological;
    }

    public void setPhysiological(Physiological physiological) {
        this.physiological = physiological;
    }

    public Safety getSafety() {
        return safety;
    }

    public void setSafety(Safety safety) {
        this.safety = safety;
    }

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
    }

    public Esteem getEsteem() {
        return esteem;
    }

    public void setEsteem(Esteem esteem) {
        this.esteem = esteem;
    }

    public Integer getActualization() {
        return actualization;
    }

    public void setActualization(Integer actualization) {
        this.actualization = actualization;
    }
}
