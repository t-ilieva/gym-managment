package observer;

import strategy.TrainingProgram;

public interface Observer {
    void update(TrainingProgram trainingProgram);
}
