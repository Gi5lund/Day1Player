package dat3.day1player.repository;

import dat3.day1player.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer>
	{
		Player findByName(String player);
		Player findByNameLike(String name);
	}
