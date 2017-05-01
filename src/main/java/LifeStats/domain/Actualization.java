package LifeStats.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Actualization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer actualizationId;

    private Integer actualizationLevel;
    private String actualizationNotes;

    public Actualization(){}

    public Integer getActualizationId() {
        return actualizationId;
    }

    public void setActualizationId(Integer actualizationId) {
        this.actualizationId = actualizationId;
    }

    public Integer getActualizationLevel() {
        return actualizationLevel;
    }

    public void setActualizationLevel(Integer actualizationLevel) {
        this.actualizationLevel = actualizationLevel;
    }

    public String getActualizationNotes() {
        return actualizationNotes;
    }

    public void setActualizationNotes(String actualizationNotes) {
        this.actualizationNotes = actualizationNotes;
    }
}
