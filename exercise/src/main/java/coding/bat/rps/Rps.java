package coding.bat.rps;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Rps {

    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 3;
    private String name;
    private int rounds;
    private static int userWins;
    private static int pcWins;

    public static int getUserWins() {
        return userWins;
    }

    public static int getPcWins() {
        return pcWins;
    }

    public String getName() {
        return name;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public static void setUserWins(int userWins) {
        Rps.userWins = userWins;
    }

    public static void setPcWins(int pcWins) {
        Rps.pcWins = pcWins;
    }

    public void askingForName() {
        System.out.println("Please enter your nickname: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Hello \"" + name.trim() + "\"");
        askForNumberOfRounds();
    }

    public void askForNumberOfRounds() {
        System.out.println("Enter the number of rounds that you want to play: ");
        try {
            int rounds = new Scanner(System.in).nextInt();
            setRounds(rounds);
            loadMainMenu();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("The input has to be positive number, try again.");
            askForNumberOfRounds();
        }
    }


    public void loadMainMenu() {
        System.out.println("**********   Main Menu   **********");
        System.out.println("The game starts when you make a choice");
        System.out.println("1 - to play ROCK");
        System.out.println("2 - to play PAPER");
        System.out.println("3 - to play SCISSORS");
        System.out.println();
        System.out.println("N - to restart the game");
        System.out.println("X - to exit");
        makeAChoice();
    }

    public void makeAChoice() {
        String input = new Scanner(System.in).nextLine();

        switch (input) {
            case "1":
                System.out.println("You played ROCK");
                showWinner(ROCK);
                makeAChoice();
                break;
            case "2":
                System.out.println("You played PAPER");
                showWinner(PAPER);
                makeAChoice();
                break;
            case "3":
                System.out.println("You played SCISSORS");
                showWinner(SCISSORS);
                makeAChoice();
                break;
            case "n":
            case "N":
                System.out.println("Restarting game.\n");
                restartGame();

                loadMainMenu();
                break;
            case "x":
            case "X":
                exitMethod();
                break;
            default:
                System.out.println("Wrong input, try again.");
                loadMainMenu();
        }
    }

    private void restartGame() {
        System.out.println("Do you want to start a new game ? Y/N");
        String input = new Scanner(System.in).nextLine();
        switch (input) {
            case "n":
            case "N":
                loadMainMenu();
                break;
            case "y":
            case "Y":
                askForNumberOfRounds();
                break;
            default:
                System.out.println("Wrong input, try again.");
                restartGame();
        }
    }

    static String showWinner(int playerChoice) {
        int computerChoice = new Random().nextInt(3) + 1;
        if (playerChoice == computerChoice) {
            return "It's a tie";
        }
        if (playerChoice == ROCK && computerChoice == SCISSORS) {
            setUserWins(getUserWins() + 1);
            return "you choose ROCK, PC rolls: SCISSORS, you are the winner!";
        }
        if (playerChoice == PAPER && computerChoice == ROCK) {
            setUserWins(getUserWins() + 1);
            return "you choose PAPER, PC rolls: ROCK, you are the winner!";
        }
        if (playerChoice == SCISSORS && computerChoice == PAPER) {
            setUserWins(getUserWins() + 1);
            return "you choose SCISSORS, PC rolls: PAPER, you are the winner!";
        }

        if (computerChoice == ROCK && playerChoice == SCISSORS) {
            setPcWins(getPcWins() + 1);
            return "you choose SCISSORS, PC rolls: ROCK, you lose this round!";
        }
        if (computerChoice == PAPER && playerChoice == ROCK) {
            setPcWins(getPcWins() + 1);
            return "you choose ROCK, PC rolls: PAPER, you lose this round!";
        }
        if (computerChoice == SCISSORS && playerChoice == PAPER) {
            setPcWins(getPcWins() + 1);
            return "you choose PAPER, PC rolls: SCISSORS, you lose this round!";
        }
        return "not expected";
    }

    private void exitMethod() {
        System.out.println("Do you want to exit game ? Y/N");
        String input = new Scanner(System.in).nextLine();
        if (input.equalsIgnoreCase("n"))
            loadMainMenu();
        else if (input.equalsIgnoreCase("y"))
            System.exit(0);
        else {
            System.out.println("Wrong input, try again.");
            exitMethod();
        }
    }

    private int computerRoll() {
        Random random = new Random();
        int roll = random.nextInt(3) + 1;
        if (roll == 1)
            return 1;
        if (roll == 2)
            return 2;
        else
            return 3;
    }


    public static void main(String[] args) {
        Rps user = new Rps();
        user.askingForName();
        user.askForNumberOfRounds();
        user.makeAChoice();

    }
}