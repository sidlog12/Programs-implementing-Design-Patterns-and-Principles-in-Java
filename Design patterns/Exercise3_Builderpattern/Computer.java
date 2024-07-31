package test;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String motherboard;
    private String powerSupply;

   
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.motherboard = builder.motherboard;
        this.powerSupply = builder.powerSupply;
    }

    
    public static class Builder {
        
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private String motherboard;
        private String powerSupply;

      
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        
        public Computer build() {
            return new Computer(this);
        }
    }
 
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
               ", GPU=" + GPU + ", motherboard=" + motherboard + ", powerSupply=" + powerSupply + "]";
    }


}