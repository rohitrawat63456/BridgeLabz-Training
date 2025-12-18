package programmingElements;

public class EarthVolume {
	public static void main(String[] args) {
		int radiusEarth = 6387;
		double volumeInKM = 4/3.0 * Math.PI * Math.pow(radiusEarth, 3);
		double volumeInMile = 4/3.0 * Math.PI * Math.pow(radiusEarth/1.6, 3);
		System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",volumeInKM,volumeInMile);
	}

}