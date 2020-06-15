package com.wazuweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wazuweb.model.dao.RespuestasDAO;
import com.wazuweb.model.dto.RespuestasDTO;

@Repository
@Transactional
public class RespServiceImpl implements RespService{
	
	
		@Autowired
	    RespuestasDAO respuestasDAO;
		
        @Override
		public List<RespuestasDTO> list(String CODP) {
			return respuestasDAO.list(CODP);
		}
	}

