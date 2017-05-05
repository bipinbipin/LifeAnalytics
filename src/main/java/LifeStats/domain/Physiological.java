package LifeStats.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Physiological {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer physiologicalId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Exercise exercise;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Diet diet;

    public Physiological(){}

    public Integer getPhysiologicalId() {
        return physiologicalId;
    }

    public void setPhysiologicalId(Integer physiologicalId) {
        this.physiologicalId = physiologicalId;
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
