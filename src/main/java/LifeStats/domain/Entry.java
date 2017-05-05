package LifeStats.domain;

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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Physiological physiological;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Safety safety;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Social intimacy;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Esteem esteem;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Actualization actualization;

    private Date entryDate;

    public Entry(){}

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

    public Social getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(Social intimacy) {
        this.intimacy = intimacy;
    }

    public Esteem getEsteem() {
        return esteem;
    }

    public void setEsteem(Esteem esteem) {
        this.esteem = esteem;
    }

    public Actualization getActualization() {
        return actualization;
    }

    public void setActualization(Actualization actualization) {
        this.actualization = actualization;
    }
}
