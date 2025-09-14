public class ComputerBuilder implements Builder {
    private String CPU;
    private int RAM;
    private int DISK;
    private String Storage;
    private String OS;
    private int ScreenSize;
    private int PowerSupplyWatts;

    @Override
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setStorageCapacity(int DISK) {
        this.DISK = DISK;
    }

    @Override
    public void setStorageType(String Storage) {
        this.Storage = Storage;
    }

    @Override
    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public void setScreenSize(int ScreenSize) {
        this.ScreenSize = ScreenSize;
    }

    @Override
    public void setPowerSupplyWatts(int PowerSupplyWatts) {
        this.PowerSupplyWatts = PowerSupplyWatts;
    }

    @Override
    public Computer getComputer() {
        return new Computer(CPU, RAM, DISK, Storage, OS, ScreenSize, PowerSupplyWatts);
    }
}
