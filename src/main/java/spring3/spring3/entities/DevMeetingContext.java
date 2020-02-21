package spring3.spring3.entities;

import org.springframework.stereotype.Component;

@Component

public class DevMeetingContext implements MeetingService {

    @Override
    public String getMeetingContext() {
        return "Playing Overwatch!!";
    }
}
