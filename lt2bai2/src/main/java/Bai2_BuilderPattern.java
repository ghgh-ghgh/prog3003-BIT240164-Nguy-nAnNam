class Computer {

    // Các thuộc tính của máy tính
    private String HDD;
    private String RAM;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD                = builder.HDD;
        this.RAM                = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD()               { return HDD; }
    public String getRAM()               { return RAM; }
    public boolean isBluetoothEnabled()  { return isBluetoothEnabled; }

    @Override
    public String toString() {
        return "Computer [RAM=" + RAM
             + ", HDD=" + HDD
             + ", Bluetooth=" + isBluetoothEnabled + "]";
    }
    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isBluetoothEnabled = false;
        public ComputerBuilder(String RAM, String HDD) {
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetooth) {
            this.isBluetoothEnabled = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class Bai2_BuilderPattern {

    public static void main(String[] args) {

        System.out.println("=== BÀI 2 – BUILDER DESIGN PATTERN ===");

        Computer computerWithBluetooth = new Computer.ComputerBuilder("16GB", "512GB SSD")
                .setBluetoothEnabled(true)  
                .build();                   

        Computer computerWithoutBluetooth = new Computer.ComputerBuilder("8GB", "1TB HDD")
                .build(); 

        System.out.println("Máy tính 1 (có Bluetooth): " + computerWithBluetooth);
        System.out.println("Máy tính 2 (không Bluetooth): " + computerWithoutBluetooth);
    }
}