package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes.Collections;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class RouteTest {
    List<Location> locations = new ArrayList<>();
    Location location0 = new Waypoint();
    Location location1 = new Settlement();
    Location location2 = new Location();

    @Test
    public void testAddAndGetLocation() {
        List<Location> locations1 = new ArrayList<>();
        Route route = new Route();

        assertEquals(route.getLocation(), Collections.EMPTY_LIST);

        route.addLocation(location0);
        locations1.add(location0);
        assertEquals(route.getLocation(), locations1);

        route.addLocation(location1);
        locations1.add(location1);
        assertEquals(route.getLocation(), locations1);

        route.addLocation(location2);
        locations1.add(location2);
        assertEquals(route.getLocation(), locations1);
    }

    @Test
    public void testAddIndexLocationAndGet() {
        List<Location> locations2 = new ArrayList<>();
        Route route = new Route();

        route.addIndexLocation(0, location2);
        locations2.add(location2);
        assertEquals(route.getLocation(), locations2);

        route.addIndexLocation(1, location2);
        locations2.add(location2);
        assertEquals(route.getLocation(), locations2);

        route.addIndexLocation(2, location1);
        locations2.add(location1);
        assertEquals(route.getLocation(), locations2);
    }

    @Test
    public void testRemoveLocation() {
        List<Location> locations3 = new ArrayList<>();
        Route route = new Route();

        route.addIndexLocation(0, location1);
        route.addIndexLocation(1, location2);
        route.addIndexLocation(2, location0);

        locations3.add(location1);
        locations3.add(location0);

        route.removeLocation(1);
        assertEquals(route.getLocation(), locations3);
    }
    @Test
    public void testIterator() {
        Route route = new Route();
        int count = 0;

        route.addLocation(location0);
        route.addLocation(location1);
        route.addLocation(location2);

        location0.setId(0);
        location1.setId(1);
        location2.setId(2);

        for (Location locations : route) {
            assertEquals(locations.getId(), count++);
        }
        assertEquals(count, 3);
    }
}

