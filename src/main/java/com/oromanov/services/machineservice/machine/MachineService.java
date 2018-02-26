package com.oromanov.services.machineservice.machine;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MachineService {
    private final MachineRepository machineRepository;

    public Machine getMachineByUserId(long userId){
        MachineEntity entity = getMachines().stream().filter(e -> e.getUserId() == userId).findFirst().get();
        return new Machine(entity.getId(), entity.getName(), entity.getUserId());
    }

    private List<MachineEntity> getMachines(){
        return machineRepository.findAll().collect(Collectors.toList());
    }
}
