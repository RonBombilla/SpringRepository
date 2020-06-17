package com.wazuweb.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wazuweb.model.dto.RespuestasDTO;

@Repository
@Transactional
public class RespuestasDAOImpl implements RespuestasDAO{
	
	
	
	private String list = "SELECT * FROM RESPUESTAS WHERE CODP=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<RespuestasDTO> list (String CODP) {
		Object[] args = {CODP};
		List<RespuestasDTO> listResp = jdbcTemplate.query(list, args,
				BeanPropertyRowMapper.newInstance(RespuestasDTO.class));
		return listResp;
	}
}