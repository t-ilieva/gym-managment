package decorator;

import strategy.TrainingProgram;

public class YogaDecorator extends TrainingProgramDecorator{
    public YogaDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void createProgram() {
        super.createProgram();
        this.addExercise();
    }

    private void addExercise() {
        System.out.println("With Yoga");
    }
}
