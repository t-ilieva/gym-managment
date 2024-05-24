package decorator;

import strategy.TrainingProgram;

public abstract class TrainingProgramDecorator implements TrainingProgram {
    protected TrainingProgram decoratedTrainingProgram;

    public TrainingProgramDecorator(TrainingProgram decoratedTrainingProgram) {
        super();
        this.decoratedTrainingProgram = decoratedTrainingProgram;
    }

    @Override
    public void getProgram() {
        this.decoratedTrainingProgram.getProgram();
    }
}
