package com.oromanov.services.machineservice.status;

import com.oromanov.services.machineservice.machine.Machine;
import com.oromanov.services.machineservice.machine.MachineService;
import com.oromanov.services.machineservice.status.MachineStatus;
import com.oromanov.services.machineservice.status.MachineStatusController;
import com.oromanov.services.machineservice.status.MachineStatusService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by aleksandr on 03.02.18.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MachineStatusController.class)
@TestPropertySource(properties = {"embedded.mariadb.enabled=false", "embedded.couchbase.enabled=false"})
public class MachineStatusControllerTest {
	@MockBean
	private MachineService machineService;

	@Autowired
	private MockMvc mvc;

	@MockBean
	private MachineStatusService machineStatusService;

	@Test
	public void shouldGetOneMachineById() throws Exception {
		given(machineService.getMachineByUserId(1L)).willReturn(new Machine(1L, "TEST", 1L));
		given(machineStatusService.getMachineStatus(1L, 1L)).willReturn(new MachineStatus(1L, true));

		mvc.perform(get("/machine?userId=1")).andExpect(status().isOk());
	}
}
