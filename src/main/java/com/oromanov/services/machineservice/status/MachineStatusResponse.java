package com.oromanov.services.machineservice.status;

import lombok.Value;

@Value
public class MachineStatusResponse {
    long machineId;
    boolean machineAvailable;
}
