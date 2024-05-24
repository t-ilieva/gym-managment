package observer;

import decorator.*;
import singleton.FitnessCenter;
import strategy.TrainingProgram;

import java.util.Scanner;

public class Trainee implements Observer{
    private String name;
    private String address;
    private String phoneNumber;
    private TrainingProgram trainingProgram;

    public Trainee(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.trainingProgram = FitnessCenter.getInstance().getTrainingProgram();
        if (this.trainingProgram != null) {
            System.out.println(name + " has been assigned the initial training program: ");
            trainingProgram.getProgram();
        } else {
            System.out.println(name + " has been registered but no training program is set yet.");
        }
    }

    @Override
    public void update(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
        System.out.println(name + " has been updated with the new training program: ");
        trainingProgram.getProgram();
        chooseTrainingProgram();
    }

    private void chooseTrainingProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", please choose your training preferences:");
        System.out.println("1. Keep the current program");
        System.out.println("2. Add Cardio");
        System.out.println("3. Add HIIT");
        System.out.println("4. Add Weight");
        System.out.println("5. Add Pilates");
        System.out.println("6. Add Yoga");
        System.out.println("7. Add both Cardio and Weight");
        System.out.println("8. Add both HIIT and Weight");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(name + " has chosen to keep the current program: ");
                trainingProgram.getProgram();
                break;
            case 2:
                trainingProgram = new CardioDecorator(trainingProgram);
                System.out.println(name + " has chosen a customized training program: ");
                trainingProgram.getProgram();
                break;
            case 3:
                trainingProgram = new HIITDecorator(trainingProgram);
                System.out.println(name + " has chosen a customized training program: ");
                trainingProgram.getProgram();
                break;
            case 4:
                trainingProgram = new WeightDecorator(trainingProgram);
                System.out.println(name + " has chosen a customized training program: ");
                trainingProgram.getProgram();
            case 5:
                trainingProgram = new PilatesDecorator(trainingProgram);
                System.out.println(name + " has chosen a customized training program: ");
                trainingProgram.getProgram();
                break;
            case 6:
                trainingProgram = new YogaDecorator(trainingProgram);
                System.out.println(name + " has chosen a customized training program: ");
                trainingProgram.getProgram();
                break;
            case 7:
                trainingProgram = new CardioDecorator(trainingProgram);
                trainingProgram = new WeightDecorator(trainingProgram);
                System.out.println(name + " has chosen a customized training program: ");
                trainingProgram.getProgram();
                break;
            case 8:
                trainingProgram = new HIITDecorator(trainingProgram);
                trainingProgram = new WeightDecorator(trainingProgram);
                System.out.println(name + " has chosen a customized training program: ");
                trainingProgram.getProgram();
                break;
            default:
                System.out.println("Invalid choice. Keeping the current program.");
                break;
        }
    }
}
