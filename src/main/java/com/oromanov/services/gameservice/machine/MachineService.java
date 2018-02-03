package com.oromanov.services.gameservice.machine;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aleksandr on 03.02.18.
 */
public interface MachineService {
	List<MachineEntity> getAllAvailableMachines();
}
