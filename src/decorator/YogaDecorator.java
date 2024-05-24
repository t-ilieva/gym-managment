package decorator;

import strategy.TrainingProgram;

public class YogaDecorator extends TrainingProgramDecorator{
    public YogaDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void createProgram() {
        super.createProgram();
        System.out.println("With Yoga");
    }
}
