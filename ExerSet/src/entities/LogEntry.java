package entities;

import java.util.Date;

public class LogEntry {
    private String username;
    private Date moment;


    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        LogEntry logEntry = (LogEntry) o;
        return username.equals(logEntry.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}
