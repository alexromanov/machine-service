package com.oromanov.services.machineservice.status;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MachineStatusService {
    private final MachineStatusRepository machineStatusRepository;

    public MachineStatus getMachineStatus(long machineId, long userId){
        MachineStatusDocument document = machineStatusRepository.findOne(machineId + "-" + userId);
        return new MachineStatus(Long.parseLong(document.getMachineId()), document.getMachineAvailable());
    }
}
