package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " (Hybrid) engine is starting with " + cylinders + " cylinders and " + batterySize + "kWh battery.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving. AvgKmPerLitre: " + avgKmPerLitre + ", BatterySize: " + batterySize);
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid system is running...");
    }
}
