package util;

import java.util.ArrayList;
import java.util.List;
import model.Vessel;

public class VesselUtil {

    // stores all vessel objects
    private List<Vessel> vesselList = new ArrayList<>();

    // adds a vessel to the list
    // add vessel
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // returns the list when needed
    public List<Vessel> getVesselList() {
        return vesselList;
    }
    // returns vessel object for given vesselId
    // get vessel by id
    public Vessel getVesselById(String vesselId) {

        // iterate through vessel list
        for (Vessel vessel : vesselList) {

            // case-sensitive comparison
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel; // vessel found
                return vessel;
            }
        }

        // if no vessel matches
        return null;
    }
    // returns vessels with highest average speed
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> highPerformanceList = new ArrayList<>();

        // get highest speed vessels
        public List<Vessel> getHighPerformanceVessels() {
            List<Vessel> result = new ArrayList<>();
            double maxSpeed = 0;

            // find maximum speed
            for (Vessel vessel : vesselList) {
                if (vessel.getAverageSpeed() > maxSpeed) {
                    maxSpeed = vessel.getAverageSpeed();
                    for (Vessel v : vesselList) {
                        if (v.getAverageSpeed() > maxSpeed) {
                            maxSpeed = v.getAverageSpeed();
                        }
                    }

                    // collect vessels matching max speed
                    for (Vessel vessel : vesselList) {
                        if (vessel.getAverageSpeed() == maxSpeed) {
                            highPerformanceList.add(vessel);
                            for (Vessel v : vesselList) {
                                if (v.getAverageSpeed() == maxSpeed) {
                                    result.add(v);
                                }
                            }

                            return highPerformanceList;
                            return result;
                        }
                    }
                }