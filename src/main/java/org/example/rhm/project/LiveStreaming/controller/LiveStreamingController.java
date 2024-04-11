package org.example.rhm.project.LiveStreaming.controller;

import org.example.rhm.project.LiveStreaming.model.LiveStreaming;
import org.example.rhm.project.LiveStreaming.service.LiveStreamingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LiveStreaming")
public class LiveStreamingController {
    LiveStreamingService liveStreamingService;

    public LiveStreamingController(LiveStreamingService liveStreamingService) {
        this.liveStreamingService = liveStreamingService;
    }

    @PostMapping
    public String CreateLiveStreamingDetails(@RequestBody LiveStreaming liveStreaming) {
        liveStreamingService.createLiveStreaming(liveStreaming);
        return "Live Streaming Created Successfully";
    }

    @GetMapping()
    public List<LiveStreaming> getAllLiveStremingDetails(){
        return liveStreamingService.getAllLiveStreaming();
    }

    @PutMapping
    public String updateLiveStreamingDetails(@RequestBody LiveStreaming liveStreaming){
        liveStreamingService.updateLiveStreaming(liveStreaming);
        return "Live Streaming Updated Successfull";
    }

    @DeleteMapping("{streamId}")
    public String deleteLiveStreamingDetails(@PathVariable("streamId") String streamId) {
        liveStreamingService.deleteLiveStreaming(streamId);
        return "Live Streaming Deleted Successfully";
    }

    @GetMapping("{streamId}")
    public LiveStreaming getLiveStreamingDetails(@PathVariable("streamId") String streamId) {
        return liveStreamingService.getLiveStreaming(streamId);
    }
}