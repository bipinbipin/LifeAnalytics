package LifeStats.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer columnId;

    private Integer runDistance;
    private Integer bikeDistance;
    private Integer benchWeight;
    private Integer dips;
    private Integer pullUps;
    private String exerciseNotes;

    public Exercise(){}

    public String getExerciseNotes() {
        return exerciseNotes;
    }

    public void setExerciseNotes(String exerciseNotes) {
        this.exerciseNotes = exerciseNotes;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(Integer runDistance) {
        this.runDistance = runDistance;
    }

    public Integer getBikeDistance() {
        return bikeDistance;
    }

    public void setBikeDistance(Integer bikeDistance) {
        this.bikeDistance = bikeDistance;
    }

    public Integer getBenchWeight() {
        return benchWeight;
    }

    public void setBenchWeight(Integer benchWeight) {
        this.benchWeight = benchWeight;
    }

    public Integer getDips() {
        return dips;
    }

    public void setDips(Integer dips) {
        this.dips = dips;
    }

    public Integer getPullUps() {
        return pullUps;
    }

    public void setPullUps(Integer pullUps) {
        this.pullUps = pullUps;
    }
}
