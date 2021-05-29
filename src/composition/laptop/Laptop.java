package composition.laptop;

import composition.laptopcomponents.GraphicsCard;
import composition.laptopcomponents.Processor;

public class Laptop {
    private double screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String keyboard;

    public Laptop() {
        this.screen = 14;
        this.processor = new Processor();
        this.ram = "DDR4";
        this.hardDrive = "500 GB";
        this.graphicsCard = new GraphicsCard();
        this.opticalDrive = "MTL drive";
        this.keyboard = "back lit";
    }

    public Laptop(double screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public String getfreq() {
        return processor.getFrequency();
    }

    public void activeGamingMode(){
        processor.setFrequency(processor.getMaxfrequency());
    }


}
