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
public class Legs {
    private Distance distance;
    private Duration duration;
    private Step[] steps;

    /**
     * @return the distance
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    /**
     * @return the duration
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * @return the steps
     */
    public Step[] getSteps() {
        return steps;
    }

    /**
     * @param steps the steps to set
     */
    public void setSteps(Step[] steps) {
        this.steps = steps;
    }
}