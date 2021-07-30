package com.CadastroUsuarios.Register;






import entidades.Endereco;
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

	@Test
	void testeCadastroEndereco(){
		Endereco endereco = new Endereco("Rua Teotonio da Fonseca", 21, "casa", "Capão Redondo", "Rio de Janeiro","123456789");
		assertEquals(endereco.getNome(), "Rua Teotonio da Fonseca");
		assertEquals(endereco.getNumero(), 21);
		assertEquals(endereco.getComplemento(), "casa");
		assertEquals(endereco.getBairro(), "Capão Redondo");
		assertEquals(endereco.getCidade(), "Rio de Janeiro");
		assertEquals(endereco.getCEP(), "123456789");

	}
	@Test
	void testeCadastroUsuario() {

		Usuario usuario = new Usuario("Iago", "188.965.698-63", "iagoaguiar202@gmail.com" , "18/09/1993", "516161351");

		Endereco endereco = new Endereco("Rua Teotonio da Fonseca", 21, "casa", "Capão Redondo", "Rio de Janeiro","123456789");
		List<Endereco> enderecos = new ArrayList<Endereco>();

		enderecos.add(endereco);
		usuario.setEndereco(enderecos);

		assertEquals(usuario.getNome(),"Iago" );
		assertEquals(usuario.getEmail(), "iagoaguiar202@gmail.com");
		assertEquals(usuario.getCpf(),  "188.965.698-63" );
		assertEquals(usuario.getDataNascimento(), "18/09/1993" );
		assertEquals(usuario.getEndereco(),enderecos);
	}


}
