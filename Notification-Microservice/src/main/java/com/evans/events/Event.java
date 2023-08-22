package com.evans.events;

import java.util.Date;

public class Event<T> {
    private String id;
    private Date date;
    private EventType type;
    private T data;

    public Event() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", type=" + type +
                ", data=" + data +
                '}';
    }
}
