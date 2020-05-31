package me.whiteship.demojsp;

import java.time.LocalDateTime;

public class Event {
    private String name;
    private LocalDateTime starts;

    public Event() {
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStarts() {
        return starts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStarts(LocalDateTime starts) {
        this.starts = starts;
    }
}
