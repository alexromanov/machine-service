package com.oromanov.services.machineservice;

import com.oromanov.services.machineservice.status.MachineStatus;
import com.oromanov.services.machineservice.status.MachineStatusDocument;
import com.oromanov.services.machineservice.status.MachineStatusRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = {MachineStatusTestConfiguration.class})
public class MachineStatusDbIntegrationTest {
    @Autowired
    private MachineStatusRepository machineStatusRepository;

    @Test
    public void test() throws Exception {
        MachineStatusDocument document = MachineStatusDocument.builder().key("1-1").build();
        document.setMachineAvailable(true);
        document.setMachineId("1");
        document.setUserId("1");

        machineStatusRepository.save(document);

        MachineStatusDocument extractedStatus = machineStatusRepository.findOne("1-1");

        System.out.println("");
    }
}
