package oop;

public class GeoPoliticalAreas {

    public static GeoPoliticalZones findZone(String state){
        for(GeoPoliticalZones z : GeoPoliticalZones.values()){
            String[] states = z.getState();
            for(String s : states){
                if(s.equalsIgnoreCase(state)) return z;
            }
        }
            return null;
    }
}
