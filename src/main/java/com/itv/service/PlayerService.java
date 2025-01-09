package com.itv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.itv.model.Player;

@Component
public class PlayerService {
	
	
	public List<Player> listOfPlayers()
	{
		Player p1=new Player(1,"Alice",100,5000);
		Player p2=new Player(2,"Ben",100,5000);
		Player p3=new Player(3,"Chris",100,5000);
		Player p4=new Player(4,"David",100,5000);
		Player p5=new Player(5,"Elcid",100,5000);
		
		List<Player> team=new ArrayList();
		team.add(p1);
		team.add(p2);
		team.add(p3);
		team.add(p4);
		team.add(p5);
		
		return team;
	}

	public Player getPlayer(int j)  //j=3
	{
		System.out.println(j);
		List<Player> players=listOfPlayers();
		System.out.println(players);
		Player selectedPlayer=null;
		for(int i=0;i<players.size();i++)
		{
			if(players.get(i).getJno()==j)
			{
			System.out.println(players.get(i).getJno());
			selectedPlayer=players.get(i);
			break;
			}
		}
		System.out.println(selectedPlayer);
		return selectedPlayer;
	}
}
