package com.oromanov.services.machineservice.machine;

import lombok.*;

import javax.persistence.*;

/**
 * Created by aleksandr on 03.02.18.
 */
@RequiredArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "machine")
public class MachineEntity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "user_id")
	private long userId;
}
