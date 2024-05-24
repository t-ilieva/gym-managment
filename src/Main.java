import decorator.HIITDecorator;
import decorator.YogaDecorator;
import observer.Trainee;
import singleton.FitnessCenter;
import singleton.Instructor;
import strategy.BasicProgram;
import strategy.MobilityProgram;
import strategy.StrengthProgram;
import strategy.TrainingProgram;

public class Main {
    public static void main(String[] args) {
        // Създаване на фитнес залата
        FitnessCenter fitnessCenter = FitnessCenter.getInstance();

        // Определяне на основна тренировъчна програма
        TrainingProgram basicProgram = new BasicProgram();
        fitnessCenter.setTrainingProgram(basicProgram);

        // Създаване на инструктор
        Instructor instructor = new Instructor("Ivan", "Plovdiv", "088123");

        // Създаване на трениращи
        Trainee trainee1 = new Trainee("Alice", "Plovdiv", "088123");
        Trainee trainee2 = new Trainee("Bob", "Plovdiv", "088123");

        // Регистриране на трениращи в залата
        fitnessCenter.addObserver(trainee1);
        fitnessCenter.addObserver(trainee2);

        // Инструкторът променя тренировъчната програма
        TrainingProgram mobilityProgram = new MobilityProgram();
        instructor.changeMainTrainingProgram(mobilityProgram);

        TrainingProgram yogaProgram = new YogaDecorator(basicProgram);
        instructor.changeMainTrainingProgram(yogaProgram);

        TrainingProgram strengthProgram = new StrengthProgram();
        TrainingProgram hiitProgram = new HIITDecorator(strengthProgram);
        instructor.changeMainTrainingProgram(hiitProgram);
    }
}