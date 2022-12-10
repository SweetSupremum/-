
public class Computer {
    private ComputerInfo computerInfo;

    public Computer(String processor, String memory, String operatingSystem) {
        this.computerInfo = new ComputerInfo(processor, memory, operatingSystem);
    }

    public ComputerInfo getComputerInfo() {
        return computerInfo;
    }

    private class ComputerInfo {
        public ComputerInfo(String processor, String memory, String operatingSystem) {
            this.processor = processor;
            this.memory = memory;
            this.operatingSystem = operatingSystem;
        }

        private String processor;
        private String memory;
        private String operatingSystem;
    }
}

