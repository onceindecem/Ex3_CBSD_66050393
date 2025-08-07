package footballevent;

public class SubscriberA implements ScoreListener {
    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println("live result: " + e.getLiveScore());
    }
}
