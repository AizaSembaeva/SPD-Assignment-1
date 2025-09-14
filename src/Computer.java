public class Computer {
    private final String CPU;
    private final int RAM;
    private final int StorageCapacity;
    private final String StorageType;
    private final String OS;
    private final int ScreenSize;
    private final int PowerSupplyWatts;

    public Computer(String CPU, int RAM, int DISK, String Storage, String OS, int screenSize, int powerSupplyWatts){
        this.CPU = CPU;
        this.RAM = RAM;
        this.StorageCapacity = DISK;
        this.StorageType = Storage;
        this.OS = OS;
        this.ScreenSize = screenSize;
        this.PowerSupplyWatts = powerSupplyWatts;
    }

    public String getCPU(){
        return CPU;
    }
    public int getRAM(){
        return RAM;
    }
    public int getStorageCapacity(){
        return StorageCapacity;
    }
    public String getStorageType(){
        return StorageType;
    }
    public String getOS(){
        return OS;
    }
    public int getScreenSize(){
        return ScreenSize;
    }
    public int getPowerSupplyWatts(){
        return PowerSupplyWatts;
    }

    @Override
    public String toString(){
        return "Computer Configuration:\n" +
                " CPU: " + CPU + "\n" +
                " RAM: " + RAM + " GB\n" +
                " Storage: " + StorageCapacity + " GB " + StorageType + "\n" +
                " Operating System: " + OS + "\n" +
                " Monitor: " + ScreenSize + "\"\n" +
                " Power Supply: " + PowerSupplyWatts + " W\n";
    }

}
