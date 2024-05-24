package decorator;

import strategy.TrainingProgram;

public class CardioDecorator extends TrainingProgramDecorator{
    public CardioDecorator(TrainingProgram decoratedTrainingProgram) {
        super(decoratedTrainingProgram);
    }

    @Override
    public void getProgram() {
        super.getProgram();
        this.addExercise();
    }

    private void addExercise() {
        System.out.println("With Cardio");
    }
}
