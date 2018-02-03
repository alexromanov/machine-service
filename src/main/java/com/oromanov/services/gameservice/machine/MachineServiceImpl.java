package com.oromanov.services.gameservice.machine;

import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by aleksandr on 03.02.18.
 */
@Slf4j
@AllArgsConstructor
@Service
@Transactional
public class MachineServiceImpl implements MachineService {
	private final MachineRepository repository;

	public List<MachineEntity> getAllAvailableMachines() {
		return repository.findAll();
	}
}
