package com.stackroute.playerapp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Repository;

import com.stackroute.playerapp.model.Player;

@Repository
public class PlayerRepository {

	private List<Player> playerlist = new ArrayList<>();
	
	public Player addPlayer(Player player) {
		playerlist.add(player);
		return player;
	}
	
	public List<Player> getAllPlayers() {
		return playerlist;
	}
	
	public Player deletePlayer(String playerid) {
		Player deletedPlayer = new Player();
		Player alb;
		ListIterator<Player> alblist = playerlist.listIterator();
		
		while(alblist.hasNext()) {
			if((alb = alblist.next()).getPlayerid().equals(playerid)) {
				alblist.remove();
				deletedPlayer = alb;

			}
		}
		
		return deletedPlayer;
	}
	
	public Player updatePlayer(Player player) {
		
		return null;
	}

	public Player getPlayerById(String playerid) {
		Player playerdata = null;
		for(Player player: playerlist) {
			if(playerid.equals(player.getPlayerid())) {
				playerdata = player;
				break;
			}
		}
		return playerdata;
	}
	
}
