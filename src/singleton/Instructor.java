package singleton;

import strategy.TrainingProgram;

public class Instructor {
    private String name;
    private String address;
    private String phoneNumber;
    private FitnessCenter fitnessCenter;

    public Instructor(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.fitnessCenter = FitnessCenter.getInstance();
    }

    public void changeMainTrainingProgram(TrainingProgram trainingProgram) {
        System.out.println("Instructor has set a new main training program: ");
        trainingProgram.getProgram();
        fitnessCenter.setTrainingProgram(trainingProgram);
    }
}
