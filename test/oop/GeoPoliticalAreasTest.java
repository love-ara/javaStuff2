package oop;

import oop.GeoPoliticalAreas.GeoPoliticalAreas;
import oop.GeoPoliticalAreas.GeoPoliticalZones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalAreasTest {

    @Test
    public void methodCanReturnZoneTest(){
        assertEquals(GeoPoliticalZones.SOUTH_SOUTH, GeoPoliticalAreas.findZone("Bayelsa"));
    }
}
