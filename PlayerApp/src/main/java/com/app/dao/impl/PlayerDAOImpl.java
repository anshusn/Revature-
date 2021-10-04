package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.app.dao.PlayerDAO;
import com.app.dbutil.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.model.Team;

public class PlayerDAOImpl implements PlayerDAO{
	private static Logger log=Logger.getLogger(PlayerDAOImpl.class);
	
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="select id,name,age,city,gender,sportsName,teamName from Player p join Team m on p.id=t.id where p.id=?";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			ResultSet resultset=preparedstatement.executeQuery();
			if(resultset.next()) {
				player=new Player();
				player.setId(id);
				player.setAge(resultset.getInt("Age"));
				player.setCity(resultset.getString("City"));
				player.setSportsname(resultset.getString("sportsName"));
				player.setGender(resultset.getString("gender"));
				Team team=new Team();
				team.setId(resultset.getInt("Id"));
				team.setTeamName(resultset.getString("teamname"));
				player.setTeam(team);
			}else {
				throw new BusinessException("entered Player id "+id+" does not exists");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return player;
	}

	@Override
	public List<Player> getPlayerByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayerByTeamname(String teamname) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayerBycity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayerByname(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayerBysportsname(String sportsname) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayerBygender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
