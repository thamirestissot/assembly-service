package com.thamirestissot.assembly.repository;

import com.thamirestissot.assembly.repository.entity.VoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<VoteEntity, Integer> {
}