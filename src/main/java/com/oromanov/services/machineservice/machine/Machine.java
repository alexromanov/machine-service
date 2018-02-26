package com.oromanov.services.machineservice.machine;

import lombok.Value;

@Value
public class Machine {
    long id;
    String name;
    long userId;
}
