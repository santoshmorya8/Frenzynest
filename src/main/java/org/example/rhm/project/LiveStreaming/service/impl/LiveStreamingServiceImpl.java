package org.example.rhm.project.LiveStreaming.service.impl;

import org.example.rhm.project.LiveStreaming.model.LiveStreaming;
import org.example.rhm.project.LiveStreaming.repository.LiveStreamingRepository;
import org.example.rhm.project.LiveStreaming.service.LiveStreamingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveStreamingServiceImpl implements LiveStreamingService {

    LiveStreamingRepository liveStreamingRepository;

    public LiveStreamingServiceImpl(LiveStreamingRepository liveStreamingRepository) {
        this.liveStreamingRepository = liveStreamingRepository;
    }

    @Override
    public String createLiveStreaming(LiveStreaming liveStreaming) {
        liveStreamingRepository.save(liveStreaming);
        return "Success";
    }

    @Override
    public String updateLiveStreaming(LiveStreaming liveStreaming) {
        liveStreamingRepository.save(liveStreaming);
        return "Success";
    }

    @Override
    public String deleteLiveStreaming(String userId) {
        liveStreamingRepository.deleteById(userId);
        return "Success";
    }

    @Override
    public LiveStreaming getLiveStreaming(String streamId) {
        return liveStreamingRepository.findById(streamId).get();
    }

    @Override
    public List<LiveStreaming> getAllLiveStreaming() {
        return liveStreamingRepository.findAll();
    }
}