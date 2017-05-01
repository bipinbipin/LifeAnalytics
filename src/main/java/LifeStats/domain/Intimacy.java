package LifeStats.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Intimacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer intimacyId;

    private Integer sexLength;
    private Integer sexQuality;
    private Integer socialInteractionCount;
    private Integer socialQuality;
    private String intimacyNotes;

    public Intimacy(){}

    public Integer getIntimacyId() {
        return intimacyId;
    }

    public void setIntimacyId(Integer intimacyId) {
        this.intimacyId = intimacyId;
    }

    public Integer getSexLength() {
        return sexLength;
    }

    public void setSexLength(Integer sexLength) {
        this.sexLength = sexLength;
    }

    public Integer getSexQuality() {
        return sexQuality;
    }

    public void setSexQuality(Integer sexQuality) {
        this.sexQuality = sexQuality;
    }

    public Integer getSocialInteractionCount() {
        return socialInteractionCount;
    }

    public void setSocialInteractionCount(Integer socialInteractionCount) {
        this.socialInteractionCount = socialInteractionCount;
    }

    public Integer getSocialQuality() {
        return socialQuality;
    }

    public void setSocialQuality(Integer socialQuality) {
        this.socialQuality = socialQuality;
    }

    public String getIntimacyNotes() {
        return intimacyNotes;
    }

    public void setIntimacyNotes(String intimacyNotes) {
        this.intimacyNotes = intimacyNotes;
    }
}
