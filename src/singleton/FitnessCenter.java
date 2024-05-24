package singleton;

import observer.Observable;
import observer.Observer;
import strategy.TrainingProgram;

import java.util.ArrayList;
import java.util.List;

public class FitnessCenter implements Observable {
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

    @Override
    public void addObserver(Observer observer) {
        trainees.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        trainees.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer trainee : trainees) {
            trainee.update(trainingProgram);
        }
    }

    public void setTrainingProgram(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
        notifyObservers();
    }

    public TrainingProgram getTrainingProgram() {
        return trainingProgram;
    }

}
