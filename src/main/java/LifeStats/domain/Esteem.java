package LifeStats.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Esteem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer esteemId;

    private Integer workProductivity;
    private Integer wealthMaintenance;
    private Integer knowledgeGain;
    private String esteemNotes;

    public Esteem(){}

    public Integer getEsteemId() {
        return esteemId;
    }

    public void setEsteemId(Integer esteemId) {
        this.esteemId = esteemId;
    }

    public Integer getWorkProductivity() {
        return workProductivity;
    }

    public void setWorkProductivity(Integer workProductivity) {
        this.workProductivity = workProductivity;
    }

    public Integer getWealthMaintenance() {
        return wealthMaintenance;
    }

    public void setWealthMaintenance(Integer wealthMaintenance) {
        this.wealthMaintenance = wealthMaintenance;
    }

    public Integer getKnowledgeGain() {
        return knowledgeGain;
    }

    public void setKnowledgeGain(Integer knowledgeGain) {
        this.knowledgeGain = knowledgeGain;
    }

    public String getEsteemNotes() {
        return esteemNotes;
    }

    public void setEsteemNotes(String esteemNotes) {
        this.esteemNotes = esteemNotes;
    }
}
