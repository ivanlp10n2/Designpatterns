package ar.empanada.learning.designpatterns.CatFun;

import java.util.Date;

public class Sausage implements Food{

    private float kcal = 1.4f;
    private String color = "Blue";
    private Date expiration = new Date();

    public float getNutritionalValue(){
        return this.kcal;
    }

    public String getColor(){
        return this.color;
    }

    public Date getExpiration(){
        return this.expiration;
    }
}
