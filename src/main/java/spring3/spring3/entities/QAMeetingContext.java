package spring3.spring3.entities;


import org.springframework.stereotype.Component;

@Component
public class QAMeetingContext implements MeetingService{
    @Override
    public String getMeetingContext() {
        return "Stop ruining Lives";
    }
}
