/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author ken_0
 */
public class pay {
    public double chicken;
    public double sandwish;
    public double cabbonara;
    public double beef;
    public double curry;
    public double dry;
    public double mix;
    public double spicy;
    
    public double getAmmount(){
        double p_chicken = 12 * chicken;
        double p_sandwish = 10 * sandwish;
        double p_cabbonara = 20 * cabbonara;
        double p_beef = 15 * beef;
        double p_curry = 12 * curry;
        double p_dry = 12 * dry;
        double p_mix = 10 * mix;
        double p_spicy = 14 * spicy;
        return p_chicken + p_sandwish + p_cabbonara + p_beef + p_curry + p_dry + p_mix + p_spicy;
    }
}
