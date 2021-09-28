package com.richardbeletatti.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richardbeletatti.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
