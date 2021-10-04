package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerDAO {
	
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getPlayerByAge(int age) throws BusinessException;
	public List<Player> getPlayerByTeamname(String teamname) throws BusinessException;
	public List<Player> getPlayerBycity(String city) throws BusinessException;
	public List<Player> getPlayerByname(String name) throws BusinessException;
	public List<Player> getPlayerBysportsname(String sportsname) throws BusinessException;
	public List<Player> getPlayerBygender(String gender) throws BusinessException;
	

}
