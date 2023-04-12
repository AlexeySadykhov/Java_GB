public class Laptop {
    public int id;
    public String maker;
    public String model;
    public String os;
    public String color;
    public String cpu;
    public int ram;
    public int memory;
    public int screenSize;
    public int price;

    public Laptop(int id, String maker, String model, String os, 
    String color, String cpu, int ram, int memory, int screenSize, int price) {
        this.id = id;
        this.maker = maker;
        this.model = model;
        this.os = os;
        this.color = color;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.screenSize = screenSize;
        this.price = price;
    }

    void showInfo() {
        System.out.printf("Id: %d\nMaker: %s\nModel: %s\nOS: %s\nColor: %s\nCPU: %s\nRAM: %d\nMemory: %d\nScreen size: %d\nPrice: %d\n", 
        id, maker, model, os, color, cpu, ram, memory, screenSize, price);
    }
}