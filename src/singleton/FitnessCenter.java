package singleton;

import observer.Observer;
import strategy.TrainingProgram;

import java.util.ArrayList;
import java.util.List;

public class FitnessCenter {
    private static FitnessCenter instance;
    private List<Observer> trainees;
    private TrainingProgram trainingProgram;

    private FitnessCenter() {
        trainees = new ArrayList<>();
    }

    public static FitnessCenter getInstance() {
        if (instance == null) {
            instance = new FitnessCenter();
        }
        return instance;
    }

}
