package com.wazuweb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wazuweb.model.dto.RespuestasDTO;
import com.wazuweb.service.RespService;

@Controller
@RequestMapping(value="/jugar") 
public class ResController {
	   
		@Autowired
		RespService respService;

		
		@RequestMapping(value="/list")
		public @ResponseBody List<RespuestasDTO> ajaxList(HttpServletRequest req, HttpServletResponse res) {
			List<RespuestasDTO> list = respService.list(req.getParameter("CODP"));
			return list;
			}
}
