package com.CadastroUsuarios.Register;






import dto.EnderecoDTO;
import dto.UsuarioDTO;
import entidades.Endereco;
import entidades.Usuario;
import mapper.EnderecoMapper;
import mapper.UsuarioMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class RegisterApplicationTests {

	private final UsuarioMapper usuarioMapper = UsuarioMapper.INSTANCE;
	private final EnderecoMapper enderecoMapper = EnderecoMapper.INSTANCE;


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

	@Test
	void testeUsuarioDTO() {
		Usuario usuario = new Usuario("Iago", "188.965.698-63",  "iagoaguiar202@gmail.com", "18/09/1993", "516161351");

		UsuarioDTO usuarioDTO =  usuarioMapper.toDTO(usuario);

		assertEquals(usuarioDTO.getNome(),"Iago" );
		assertEquals(usuarioDTO.getEmail(), "iagoaguiar202@gmail.com");
		assertEquals(usuarioDTO.getCpf(),  "188.965.698-63" );
		assertEquals(usuarioDTO.getDataNascimento(), "18/09/1993" );
	}

	@Test
	void testeEnderecoDTO(){
		Endereco endereco = new Endereco("Rua Teotonio da Fonseca", 21, "casa", "Capão Redondo", "Rio de Janeiro","123456789");
		EnderecoDTO enderecoDTO = enderecoMapper.toDTO(endereco);


		assertEquals(enderecoDTO.getNome(), "Rua Teotonio da Fonseca");
		assertEquals(enderecoDTO.getNumero(), 21);
		assertEquals(enderecoDTO.getComplemento(), "casa");
		assertEquals(enderecoDTO.getBairro(), "Capão Redondo");
		assertEquals(enderecoDTO.getCidade(), "Rio de Janeiro");
		assertEquals(enderecoDTO.getCEP(), "123456789");
	}
}
