package com.CadastroUsuarios.Register;






import entidades.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RegisterApplicationTests {

	@Test
	void testeCadastroUsuarioSemEndereco() {

		Usuario usuario = new Usuario("Iago", "188.965.698-63", "iagoaguiar202@gmail.com" , "18/09/1993", "516161351");

		assertEquals(usuario.getNome(),"Iago" );
		assertEquals(usuario.getEmail(), "iagoaguiar202@gmail.com");
		assertEquals(usuario.getCpf(),  "188.965.698-63" );
		assertEquals(usuario.getDataNascimento(), "18/09/1993" );
	}


}
