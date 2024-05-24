package strategy;

public class MobilityProgram implements TrainingProgram {
    private String name = "Mobility training program";
    private String customProgram;

    public String getCustomProgram() {
        return customProgram;
    }

    public void setCustomProgram(String customProgram) {
        this.customProgram = customProgram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getProgram() {
        if (this.customProgram != null) {
            System.out.println(name + " with " + customProgram);
        }
        System.out.println(name);
    }
}
