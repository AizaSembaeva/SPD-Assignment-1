public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder builder = new ComputerBuilder();

        director.buildGameComputer(builder);
        Computer computer1 = builder.getComputer();
        System.out.println(computer1.toString());

        builder.setCPU("Intel i5");
        builder.setRAM(32);
        builder.setStorageType("SSD");
        builder.setStorageCapacity(512);
        builder.setOS("Windows");
        builder.setScreenSize(25);
        builder.setPowerSupplyWatts(450);
        Computer computer2 = builder.getComputer();
        System.out.println(computer2.toString());
    }
}