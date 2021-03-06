package com.wazuweb.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wazuweb.model.dto.PreguntasDTO;


@Repository
@Transactional
public class PreguntasDAOImpl implements PreguntasDAO{

	public String list = "SELECT * FROM PREGUNTAS";
	public String select = "SELECT * FROM PREGUNTAS WHERE CODP=?";
	public String random = "select * from (select * from preguntas ORDER BY DBMS_RANDOM.RANDOM) where rownum <=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public PreguntasDTO get(String CODP) {
        PreguntasDTO preguntasDTO;
        Object[] args = {1};
        
        try{
        preguntasDTO = jdbcTemplate.queryForObject(random, args, BeanPropertyRowMapper.newInstance(PreguntasDTO.class));
		
        } catch (EmptyResultDataAccessException e) {
	    	preguntasDTO=null;
	    	e.printStackTrace();
	    } catch (Exception e) {
	    	preguntasDTO=null;
	    	e.printStackTrace();
	    }
	    return preguntasDTO;
	}
}