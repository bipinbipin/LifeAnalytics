package LifeStats.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 5/4/2017.
 */
@Entity
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer socialId;

    private Integer interactions;
    private Integer interactionQuality;
    private String socialNotes;

    public Social(){}

    public String getSocialNotes() {
        return socialNotes;
    }

    public void setSocialNotes(String socialNotes) {
        this.socialNotes = socialNotes;
    }

    public Integer getInteractionQuality() {
        return interactionQuality;
    }

    public void setInteractionQuality(Integer interactionQuality) {
        this.interactionQuality = interactionQuality;
    }

    public Integer getInteractions() {
        return interactions;
    }

    public void setInteractions(Integer interactions) {
        this.interactions = interactions;
    }

    public Integer getSocialId() {
        return socialId;
    }

    public void setSocialId(Integer socialId) {
        this.socialId = socialId;
    }
}
