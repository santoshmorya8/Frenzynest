package org.example.rhm.project.LiveStreaming.repository;

import org.example.rhm.project.LiveStreaming.model.LiveStreaming;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiveStreamingRepository extends JpaRepository<LiveStreaming,String> {
}