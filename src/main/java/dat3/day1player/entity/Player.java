package dat3.day1player.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//------------------------
@Entity
@Table(name = "spiller")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "playername",length=70,nullable = false)
	private String name;
	String country;
	String position;
	public  Player(String name, String country, String position) {
		this.name = name;
		this.country = country;
		this.position = position;
	}
}
