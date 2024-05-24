package decorator;

import strategy.TrainingProgram;

public class WeightDecorator extends TrainingProgramDecorator{
    public WeightDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void createProgram() {
        super.createProgram();
        System.out.println("With Weight");
    }
}
