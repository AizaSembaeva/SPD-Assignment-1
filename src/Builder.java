public interface Builder {
    void setCPU(String CPU);
    void setRAM(int RAM);
    void setStorageCapacity(int StorageCapacity);
    void setStorageType(String StorageType);
    void setOS(String OS);
    void setScreenSize(int ScreenSize);
    void setPowerSupplyWatts(int PowerSupplyWatts);
    Computer getComputer();
}
