package decorator;

import strategy.TrainingProgram;

public class HIITDecorator extends TrainingProgramDecorator{
    public HIITDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void createProgram() {
        super.createProgram();
        this.addExercise();
    }

    private void addExercise() {
        System.out.println("With HIIT");
    }
}
