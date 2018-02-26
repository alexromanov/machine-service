package com.oromanov.services.machineservice.status;

import lombok.Value;

@Value
public class MachineStatus {
    long machineId;
    boolean available;

    public static MachineStatus empty() {return new MachineStatus(0L, false);};
}
