public class VolumeOfEarth {
    public static void main(String[] args) {
        int radiusKM=6378;
        double radiusMiles=6378*0.621371;
        double VolumeInKm=(4.0/3.0)*3.14*Math.pow(radiusKM, 3);
        double VolumeInMiles=(4.0/3.0)*3.14*Math.pow(radiusMiles,3);

        System.out.println(" The volume of earth in cubic kilometers is "+VolumeInKm+" and cubic miles is "+VolumeInMiles);
    }
}
