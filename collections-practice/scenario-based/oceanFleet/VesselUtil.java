package oceanFleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    // Requirement 1
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // Requirement 2
    public Vessel getVesselById(String vesselId) {
        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }

    // Requirement 3
    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> highPerformance = new ArrayList<>();
        double maxSpeed = 0;

        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                highPerformance.add(vessel);
            }
        }

        return highPerformance;
    }
}

