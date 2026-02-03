package ui;

import model.Vessel;
import util.VesselUtil;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter vessel details");
        for (int i = 0; i < count; i++) {

            String input = scanner.nextLine();
            String[] details = input.split(":");

            Vessel vessel = new Vessel(
                    details[0],
                    details[1],
                    Double.parseDouble(details[2]),
                    details[3]
            );

            vesselUtil.addVesselPerformance(vessel);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String searchId = scanner.nextLine();

        Vessel foundVessel = vesselUtil.getVesselById(searchId);

        if (foundVessel != null) {
            System.out.println(
                    foundVessel.getVesselId() + " | " +
                            foundVessel.getVesselName() + " | " +
                            foundVessel.getVesselType() + " | " +
                            foundVessel.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        System.out.println("High performance vessels are");
        List<Vessel> highPerformanceVessels = vesselUtil.getHighPerformanceVessels();

        for (Vessel vessel : highPerformanceVessels) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        }

        scanner.close();
    }
}
