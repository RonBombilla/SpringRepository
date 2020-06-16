package com.wazuweb;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.wazuweb.model.UsuarioSecurity;
import com.wazuweb.repo.IUsuarioLog;

@RunWith (SpringRunner.class)
@SpringBootTest
class WazuWebApplicationTests {

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private IUsuarioLog log;
	
	@Test
	public void crearUsuarioTest() {
		UsuarioSecurity us = new UsuarioSecurity();
		us.setId(4);
		us.setNombre("ronbombilla");
		us.setClave(encoder.encode("kkhuate6651"));
		UsuarioSecurity retorno = log.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
