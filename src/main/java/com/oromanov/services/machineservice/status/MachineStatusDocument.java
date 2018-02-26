package com.oromanov.services.machineservice.status;

import com.couchbase.client.java.repository.annotation.Field;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Builder
@Document(expiry = 0)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MachineStatusDocument {
    @Id
    private String key;

    @Field
    @NotNull
    private String userId;

    @Field
    @NotNull
    private String machineId;

    @Field
    @NotNull
    private Boolean machineAvailable;
}
