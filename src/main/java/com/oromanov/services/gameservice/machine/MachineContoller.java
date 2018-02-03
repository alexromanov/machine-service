package com.oromanov.services.gameservice.machine;

import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by aleksandr on 03.02.18.
 */
@RestController
@Slf4j
@AllArgsConstructor
public class MachineContoller {
	private final MachineService machineService;

	@GetMapping
	public List<String> getMachines(){
		return machineService.getAllAvailableMachines().stream().map(e -> e.getMachine_name()).collect(Collectors.toList());
	}
}
