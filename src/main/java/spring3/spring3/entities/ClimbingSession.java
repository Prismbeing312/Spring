package spring3.spring3.entities;

public class ClimbingSession implements Session {
    @Override
    public String getContext() {
        return "Climbing mount everest!";
    }
}
