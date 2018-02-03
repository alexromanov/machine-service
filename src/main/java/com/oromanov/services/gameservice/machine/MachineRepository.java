package com.oromanov.services.gameservice.machine;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aleksandr on 03.02.18.
 */
public interface MachineRepository extends JpaRepository<MachineEntity, Long> {
}
