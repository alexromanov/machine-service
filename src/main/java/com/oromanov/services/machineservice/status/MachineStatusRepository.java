package com.oromanov.services.machineservice.status;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface MachineStatusRepository extends CouchbaseRepository<MachineStatusDocument, String> {
    <D extends MachineStatusDocument> D save(D stateDocument);
}
