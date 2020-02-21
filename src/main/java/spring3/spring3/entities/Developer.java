package spring3.spring3.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Developer implements Employee {
    @Autowired
    @Qualifier("devMeetingContext")
    private MeetingService meetingService;

    public String getMeetingService(){
        return meetingService.getMeetingContext();
    }

    @Override
    public int getSalary() {
        return 17000;
    }
}