package footballevent;

import java.util.*;

public class ScoreEvent extends EventObject {
    private String scoreLine;

    public ScoreEvent(Object source, String liveScore) {
        super(source);
        this.scoreLine = liveScore;
    }

    public String getLiveScore() {
        return scoreLine;
    }
}
