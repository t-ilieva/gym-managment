package decorator;

import strategy.TrainingProgram;

public class HIITDecorator extends TrainingProgramDecorator{
    public HIITDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void createProgram() {
        super.createProgram();
        System.out.println("With HIIT");
    }
}
