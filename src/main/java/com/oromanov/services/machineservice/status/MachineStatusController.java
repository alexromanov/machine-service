package com.oromanov.services.machineservice.status;

import com.oromanov.services.machineservice.machine.Machine;
import com.oromanov.services.machineservice.machine.MachineEntity;
import com.oromanov.services.machineservice.machine.MachineService;
import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aleksandr on 03.02.18.
 */
@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/machine")
public class MachineStatusController {
    private final MachineService machineService;
    private final MachineStatusService machineStatusService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MachineStatusResponse getMachineStatusForUser(@RequestParam long userId){
        Machine machine = machineService.getMachineByUserId(userId);
        MachineStatus status = machineStatusService.getMachineStatus(machine.getId(), userId);
        return new MachineStatusResponse(status.getMachineId(), status.isAvailable());
    }
}
