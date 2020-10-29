package com.thamirestissot.assembly.repository;

import com.thamirestissot.assembly.repository.entity.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<AgendaEntity, Integer> {
}