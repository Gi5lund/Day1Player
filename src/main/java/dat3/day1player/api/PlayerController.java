package dat3.day1player.api;

import dat3.day1player.entity.Player;
import dat3.day1player.repository.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/players")
public class PlayerController
	{
		PlayerRepository playerRepository;
		public PlayerController(PlayerRepository playerRepository){
		this.playerRepository= playerRepository;}
		@GetMapping
		List<Player> getPlayers() {
			return  playerRepository.findAll();
		}
	}
