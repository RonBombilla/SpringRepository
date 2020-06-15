package com.wazuweb.model.dao;

import java.util.List;

import com.wazuweb.model.dto.RespuestasDTO;

public interface RespuestasDAO {
	
	public List<RespuestasDTO> list(String cODP);
    
}
