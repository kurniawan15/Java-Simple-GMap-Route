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
public class Step {
    private Distance distance;
    private Duration duration;
    private String html_instructions;
    private Location start_location;
    private Location end_location;
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
     * @return the html_instructions
     */
    public String getHtml_instructions() {
        return html_instructions;
    }

    /**
     * @param html_instructions the html_instructions to set
     */
    public void setHtml_instructions(String html_instructions) {
        this.html_instructions = html_instructions;
    }

    /**
     * @return the start_location
     */
    public Location getStart_location() {
        return start_location;
    }

    /**
     * @param start_location the start_location to set
     */
    public void setStart_location(Location start_location) {
        this.start_location = start_location;
    }

    /**
     * @return the end_location
     */
    public Location getEnd_location() {
        return end_location;
    }

    /**
     * @param end_location the end_location to set
     */
    public void setEnd_location(Location end_location) {
        this.end_location = end_location;
    }
}
