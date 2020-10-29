package com.thamirestissot.assembly.repository;

import com.thamirestissot.assembly.repository.entity.VotingSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingSessionRepository extends JpaRepository<VotingSessionEntity, Integer> {
}