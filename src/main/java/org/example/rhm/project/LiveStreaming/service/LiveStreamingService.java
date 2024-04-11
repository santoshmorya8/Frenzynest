package org.example.rhm.project.LiveStreaming.service;

import org.example.rhm.project.LiveStreaming.model.LiveStreaming;

import java.util.List;


public interface LiveStreamingService {
    public String createLiveStreaming(LiveStreaming liveStreaming);
    public String updateLiveStreaming(LiveStreaming liveStreaming);
    public String deleteLiveStreaming(String userId);
    public LiveStreaming getLiveStreaming(String userId);
    public List<LiveStreaming> getAllLiveStreaming();
}