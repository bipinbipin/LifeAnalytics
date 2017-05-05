package SeleniumWebDriver.domain;

import javax.persistence.*;

/**
 * Created by David Franzel on 4/28/2017.
 */
@Entity
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dietId;

    private Integer sugar;
    private Integer protein;
    private Integer dairy;
    private Integer carbohydrates;
    private Integer veggiesFruit;
    private String dietNotes;

    public Diet(){}

    public Integer getDietId() {
        return dietId;
    }

    public void setDietId(Integer dietId) {
        this.dietId = dietId;
    }

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    public Integer getDairy() {
        return dairy;
    }

    public void setDairy(Integer dairy) {
        this.dairy = dairy;
    }

    public Integer getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Integer carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Integer getVeggiesFruit() {
        return veggiesFruit;
    }

    public void setVeggiesFruit(Integer veggiesFruit) {
        this.veggiesFruit = veggiesFruit;
    }

    public String getDietNotes() {
        return dietNotes;
    }

    public void setDietNotes(String dietNotes) {
        this.dietNotes = dietNotes;
    }
}
