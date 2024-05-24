package decorator;

import strategy.TrainingProgram;

public class PilatesDecorator extends TrainingProgramDecorator{
    public PilatesDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void createProgram() {
        super.createProgram();
        System.out.println("With Pilates");
    }
}
