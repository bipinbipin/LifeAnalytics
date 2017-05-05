package SeleniumWebDriver.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Safety {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer safetyId;

    private Integer temperature;
    private Boolean isPrecipitation;
    private Integer sunExposure;
    private Boolean lifeThreatened;
    private String safetyNotes;

    public Safety(){}

    public String getSafetyNotes() {
        return safetyNotes;
    }

    public void setSafetyNotes(String safetyNotes) {
        this.safetyNotes = safetyNotes;
    }

    public Integer getSafetyId() {
        return safetyId;
    }

    public void setSafetyId(Integer safetyId) {
        this.safetyId = safetyId;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Boolean getIsPrecipitation() {
        return isPrecipitation;
    }

    public void setIsPrecipitation(Boolean isPrecipitation) {
        this.isPrecipitation = isPrecipitation;
    }

    public Integer getSunExposure() {
        return sunExposure;
    }

    public void setSunExposure(Integer sunExposure) {
        this.sunExposure = sunExposure;
    }

    public Boolean getLifeThreatened() {
        return lifeThreatened;
    }

    public void setLifeThreatened(Boolean lifeThreatened) {
        this.lifeThreatened = lifeThreatened;
    }
}
