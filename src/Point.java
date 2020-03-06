public class Point {
    private String distance;
    private String fluvialSetting;
    private String epifaunalSubstrate;
    private String species;
    private String groundCover;
    private String notes;
    public Point(String distance, String fluvialSetting, String epifaunalSubstrate, String species, String groundCover, String notes) {
        this.distance = distance;
        this.fluvialSetting = fluvialSetting;
        this.epifaunalSubstrate = epifaunalSubstrate;
        this.species = species;
        this.groundCover = groundCover;
        this.notes = notes;
    }
    public Point() {}
    public String getDistance() {
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
    public void setDistance(String distance) {
        this.distance = distance;
    }
    public void setFluvialSetting(String fluvialSetting) {
        this.fluvialSetting = fluvialSetting;
    }
    public void setEpifaunalSubstrate(String epifaunalSubstrate) {
        this.epifaunalSubstrate = epifaunalSubstrate;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setGroundCover(String groundCover) {
        this.groundCover = groundCover;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
}