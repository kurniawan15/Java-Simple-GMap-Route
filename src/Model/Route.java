/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author syamcode
 */
public class Route {
    private String summary;
    private Legs[] legs;
    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the legs
     */
    public Legs[] getLegs() {
        return legs;
    }

    /**
     * @param legs the legs to set
     */
    public void setLegs(Legs[] legs) {
        this.legs = legs;
    }
}
