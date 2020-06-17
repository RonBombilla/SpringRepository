package com.wazuweb.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import com.wazuweb.model.dto.PreguntasDTO;
import com.wazuweb.service.PregsService;


@Controller
@RequestMapping(value="/jugar") 
public class PregController {
	   
		@Autowired
		PregsService pregsService;

		@RequestMapping(value="/get")
		public @ResponseBody PreguntasDTO ajaxGet(HttpServletRequest req, HttpServletResponse res) {
			PreguntasDTO preg = pregsService.get(req.getParameter("CODP"));
			System.out.println(preg);
			return preg;
		}
}
