package footballevent;
import java.util.Scanner;

public class ScoreReport {
      public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();
        SubscriberA subA = new SubscriberA();
        SubscriberB subB = new SubscriberB();
        scoreSource.addScoreListener(subA);
        scoreSource.addScoreListener(subB);

        Scanner sc = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Enter Score : ");
            input = sc.nextLine();
            if (input.matches("^([A-Za-z ]+)\\s+(\\d+)-(\\d+)\\s+([A-Za-z ]+)$")) {
                scoreSource.setScoreLine(input);
            } else if (input.isEmpty()) {
                System.out.println("Exit...");
                break;
            } else {
                System.out.println("Invalid format. Please enter : TeamA 1-0 TeamB");
            }
        }
    }
}
