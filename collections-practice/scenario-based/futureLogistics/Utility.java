package futureLogistics;

public class Utility {

    public static boolean validateTransportId(String transportId) {
        return transportId.matches("RTS[0-9]{3}[A-Z]");
    }

    public static float getVehiclePrice(String vehicle) {
        if (vehicle.equalsIgnoreCase("Truck"))
            return 1000;
        else if (vehicle.equalsIgnoreCase("Lorry"))
            return 1700;
        else
            return 3000;
    }

    public GoodsTransport parseDetails(String input) {
        String[] data = input.split(":");

        String transportId = data[0];
        String transportDate = data[1];
        int transportRating = Integer.parseInt(data[2]);
        String transportType = data[3];

        if (!validateTransportId(transportId)) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return null;
        }

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(
                    transportId, transportDate, transportRating,
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        } else {
            return new TimberTransport(
                    transportId, transportDate, transportRating,
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }
    }

    public String findObjectType(GoodsTransport obj) {
        if (obj instanceof TimberTransport)
            return "TimberTransport";
        else
            return "BrickTransport";
    }
}

