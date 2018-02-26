package com.oromanov.services.machineservice;

import com.oromanov.services.machineservice.machine.Machine;
import com.oromanov.services.machineservice.machine.MachineEntity;
import com.oromanov.services.machineservice.machine.MachineRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by aleksandr on 03.02.18.
 */

@RunWith(SpringRunner.class)
@ActiveProfiles("shouldFindSingleMachine")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestPropertySource(properties = {"embedded.couchbase.enabled=false"})
public class MachinesDbIntegrationTest {
	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	private MachineRepository repository;

	@Test
	public void shouldFindSingleMachine(){
		MachineEntity machine = new MachineEntity();
		machine.setName("TEST");
		machine.setUserId(4L);

		testEntityManager.persistAndFlush(machine);

		assertThat(repository.findAll().filter(e -> e.getUserId() == machine.getUserId()).findFirst().get())
				.isEqualTo(machine)
				.withFailMessage("BLABLA");
	}
}
