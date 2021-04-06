package br.com.fastur.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fastur.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}