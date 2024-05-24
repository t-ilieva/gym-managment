package decorator;

import strategy.TrainingProgram;

public class WeightDecorator extends TrainingProgramDecorator{
    public WeightDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void createProgram() {
        super.createProgram();
        this.addExercise();
    }

    private void addExercise() {
        System.out.println("With Weight");
    }
}
