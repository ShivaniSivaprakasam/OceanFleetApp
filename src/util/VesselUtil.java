public List<Vessel> getVesselList() {
    return vesselList;
}
}
// returns vessel object for given vesselId
public Vessel getVesselById(String vesselId) {

    // iterate through vessel list
    for (Vessel vessel : vesselList) {

        // case-sensitive comparison
        if (vessel.getVesselId().equals(vesselId)) {
            return vessel; // vessel found
        }
    }

    // if no vessel matches
    return null;
}
}