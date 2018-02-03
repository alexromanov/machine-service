package com.oromanov.services.gameservice.machine;

import lombok.*;

import javax.persistence.*;

/**
 * Created by aleksandr on 03.02.18.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Table(name = "machine")
public class MachineEntity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long machine_id;

	@NonNull
	private String machine_name;
}
