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

    private Boolean reading;
    private Boolean video;
    private Boolean podcast;
    private Boolean conversation;
    private Integer intellectualQuality;
    private String intellectualNotes;
    private Integer workHours;
    private Integer workQuality;
    private String workNotes;

    public Esteem(){}

    public Integer getEsteemId() {
        return esteemId;
    }

    public void setEsteemId(Integer esteemId) {
        this.esteemId = esteemId;
    }

    public Boolean getReading() {
        return reading;
    }

    public void setReading(Boolean reading) {
        this.reading = reading;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Boolean getPodcast() {
        return podcast;
    }

    public void setPodcast(Boolean podcast) {
        this.podcast = podcast;
    }

    public Boolean getConversation() {
        return conversation;
    }

    public void setConversation(Boolean conversation) {
        this.conversation = conversation;
    }

    public Integer getIntellectualQuality() {
        return intellectualQuality;
    }

    public void setIntellectualQuality(Integer intellectualQuality) {
        this.intellectualQuality = intellectualQuality;
    }

    public String getIntellectualNotes() {
        return intellectualNotes;
    }

    public void setIntellectualNotes(String intellectualNotes) {
        this.intellectualNotes = intellectualNotes;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Integer getWorkQuality() {
        return workQuality;
    }

    public void setWorkQuality(Integer workQuality) {
        this.workQuality = workQuality;
    }

    public String getWorkNotes() {
        return workNotes;
    }

    public void setWorkNotes(String workNotes) {
        this.workNotes = workNotes;
    }
}
