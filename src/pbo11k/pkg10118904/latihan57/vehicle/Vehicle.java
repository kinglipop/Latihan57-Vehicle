/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan57.vehicle;

/**
 *
 * @author Firman Alfinas
 */
public class Vehicle {
    private String myBrand,myModel;

    public Vehicle() {
        System.out.println(this.getClass().getSimpleName());
    }
    
    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
}
