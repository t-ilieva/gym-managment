package decorator;

import strategy.TrainingProgram;

public class PilatesDecorator extends TrainingProgramDecorator{
    public PilatesDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void createProgram() {
        super.createProgram();
        this.addExercise();
    }

    private void addExercise() {
        System.out.println("With Pilates");
    }
}
