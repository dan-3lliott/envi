public class Point {
    private Integer distance;
    private String fluvialSetting;
    private String epifaunalSubstrate;
    private String species;
    private String groundCover;
    private String notes;
    public Point(Integer distance, String fluvialSetting, String epifaunalSubstrate, String species, String groundCover, String notes) {
        this.distance = distance;
        this.fluvialSetting = fluvialSetting;
        this.epifaunalSubstrate = epifaunalSubstrate;
        this.species = species;
        this.groundCover = groundCover;
        this.notes = notes;
    }
    public Point() {}
    public Integer getDistance() {
        return distance;
    }
    public String getFluvialSetting() {
        return fluvialSetting;
    }
    public String getEpifaunalSubstrate() {
        return epifaunalSubstrate;
    }
    public String getSpecies() {
        return species;
    }
    public String getGroundCover() {
        return groundCover;
    }
    public String getNotes() {
        return notes;
    }
}