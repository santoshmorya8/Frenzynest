package org.example.rhm.project.LiveStreaming.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "LiveStreaming")
public class LiveStreaming {
    @Id
    private String StreamId;
    private String StreamName;
    private String StreamType;
    private String StreamDate;

    public LiveStreaming() {
    }

    public LiveStreaming(String StreamId, String StreamName, String StreamType, String StreamDate) {
        this.StreamId = StreamId;
        this.StreamName = StreamName;
        this.StreamType = StreamType;
        this.StreamDate = StreamDate;
    }

    public String getStreamId() {
        return StreamId;
    }

    public void setStreamId(String streamId) {
        this.StreamId = streamId;
    }

    public String getStreamName() {
        return StreamName;
    }

    public void setStreamName(String streamName) {
        this.StreamName = streamName;
    }

    public String getStreamType() {
        return StreamType;
    }

    public void setStreamType(String streamType) {
        this.StreamType = streamType;
    }

    public String getStreamDate() {
        return StreamDate;
    }

    public void setStreamDate(String streamDate) {
        this.StreamDate = streamDate;
    }
}