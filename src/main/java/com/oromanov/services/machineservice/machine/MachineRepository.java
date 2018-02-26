package com.oromanov.services.machineservice.machine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.stream.Stream;

/**
 * Created by aleksandr on 03.02.18.
 */
public interface MachineRepository extends Repository<MachineEntity, Long> {

    Stream<MachineEntity> findAll();
}
