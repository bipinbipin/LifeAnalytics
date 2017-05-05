package LifeStats.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Safety {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer safetyId;

    private Integer energyLevel;
    private Integer sleepHours;
    private Integer sleepQuality;
    private Boolean isSick;
    private String healthNotes;
    private Integer temperature;
    private String precipitation;
    private Integer sunExposure;
    private Boolean lifeThreatened;
    private Boolean financialStress;
    private String environmentNotes;

    public Safety(){}

    public Integer getSafetyId() {
        return safetyId;
    }

    public void setSafetyId(Integer safetyId) {
        this.safetyId = safetyId;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
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

    public Boolean getIsSick() {
        return isSick;
    }

    public void setIsSick(Boolean isSick) {
        this.isSick = isSick;
    }

    public String getHealthNotes() {
        return healthNotes;
    }

    public void setHealthNotes(String healthNotes) {
        this.healthNotes = healthNotes;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
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

    public Boolean getFinancialStress() {
        return financialStress;
    }

    public void setFinancialStress(Boolean financialStress) {
        this.financialStress = financialStress;
    }

    public String getEnvironmentNotes() {
        return environmentNotes;
    }

    public void setEnvironmentNotes(String environmentNotes) {
        this.environmentNotes = environmentNotes;
    }
}
