package spring3.spring3.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Climber implements Sport {

    @Value("${climber.skill}")
    private String skill;
    @Value("${climber.email}")
    private String email;
    private Session session;
    private String name;
    private int age;

    @Autowired
    public Climber(Session session, String name, int age) {
        this.session = session;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getType() {
        return "Climbing";
    }

    @Override
    public String getSessionContext() {
        return session.getContext();
    }

    @Override
    public String toString() {
        return "Climber{" +
                "skill='" + skill + '\'' +
                ", email='" + email + '\'' +
                ", session=" + session +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
