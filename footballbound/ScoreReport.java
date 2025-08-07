package footballbound;
import java.util.Scanner;

public class ScoreReport {
      public static void main(String[] args) {
        LiveScoreBean scoreSource = new LiveScoreBean();
        SubscriberA subA = new SubscriberA();
        SubscriberB subB = new SubscriberB();
        scoreSource.addPropertyChangeListener(subA);
        scoreSource.addPropertyChangeListener(subB);

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
