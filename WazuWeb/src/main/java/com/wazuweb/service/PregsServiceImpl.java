package com.wazuweb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wazuweb.model.dao.PreguntasDAO;
import com.wazuweb.model.dto.PreguntasDTO;


@Service
public class PregsServiceImpl implements PregsService {
	@Autowired
    PreguntasDAO preguntasDAO;


	@Override
	public PreguntasDTO get(String CODP) {
		return preguntasDAO.get(CODP);
	}
}