public class Director {
    public void buildOfficeComputer(ComputerBuilder builder){
        builder.setCPU("Apple M2");
        builder.setRAM(8);
        builder.setStorageCapacity(512);
        builder.setStorageType("SSD");
        builder.setOS("MacOS");
        builder.setScreenSize(24);
        builder.setPowerSupplyWatts(400);
    }

    public void buildGameComputer(ComputerBuilder builder){
        builder.setCPU("Intel Core i7");
        builder.setRAM(16);
        builder.setStorageCapacity(1024);
        builder.setStorageType("SSD");
        builder.setOS("Windows");
        builder.setScreenSize(27);
        builder.setPowerSupplyWatts(700);
    }
}
