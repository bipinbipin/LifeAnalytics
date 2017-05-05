package SeleniumWebDriver.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Physiological {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer physiologicalId;

    private Integer energyLevel;
    private Boolean sick;
    private Integer sleepHours;
    private Integer sleepQuality;

    @OneToOne
    private Exercise exercise;
    @OneToOne
    private Diet diet;

    public Physiological(){}

    public Integer getPhysiologicalId() {
        return physiologicalId;
    }

    public void setPhysiologicalId(Integer physiologicalId) {
        this.physiologicalId = physiologicalId;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Boolean getSick() {
        return sick;
    }

    public void setSick(Boolean sick) {
        this.sick = sick;
    }

    public Integer getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(Integer sleepHours) {
        this.sleepHours = sleepHours;
    }

    public Integer getSleepQuality() {
        return sleepQuality;
    }

    public void setSleepQuality(Integer sleepQuality) {
        this.sleepQuality = sleepQuality;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }
}
