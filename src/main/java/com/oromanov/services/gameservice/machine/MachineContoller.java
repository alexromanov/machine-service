package com.oromanov.services.gameservice.machine;

import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

	@RequestMapping(value = "/machines", method = RequestMethod.GET)
	public List<MachineEntity> getMachines(){
		return machineService.getAllAvailableMachines();
	}

	@RequestMapping(value = "/machines/{id}", method = RequestMethod.GET)
	public MachineEntity getMachineById(@PathVariable String id){
		return machineService.getMachineById(Long.parseLong(id));
	}
}
