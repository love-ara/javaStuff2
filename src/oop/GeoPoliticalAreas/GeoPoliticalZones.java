package oop.GeoPoliticalAreas;

public enum GeoPoliticalZones {

    NORTH_WEST("Kebbi", "kaduna", "Kano", "Sokoto", "Zamfara"),
    NORTH_EAST("Adamawa", "Borno", "Bauchi", "Gombe", "Jigawa", "Taraba", "Yobe"),
    NORTH_CENTRAL("Plateau", "Kwara", "Benue", "Kogi", "Niger", "Nassarawa", "Fct"),
    SOUTH_WEST("Lagos", "Ogun", "Osun", "Oyo", "Ekiti", "Ondo"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Bayelsa", "Edo", "Cross-river", "Rivers", "Delta", "Akwa-ibom");


    private String[] states;

    GeoPoliticalZones(String... states){
        this.states = states;
    }
    public String[] getState(){
        return states;
    }

}