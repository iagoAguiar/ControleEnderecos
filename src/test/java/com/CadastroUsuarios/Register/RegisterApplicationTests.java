package com.CadastroUsuarios.Register;






import com.CadastroUsuarios.Register.dto.EnderecoDTO;
import com.CadastroUsuarios.Register.dto.UsuarioDTO;
import com.CadastroUsuarios.Register.entidades.Endereco;
import com.CadastroUsuarios.Register.entidades.Usuario;
import com.CadastroUsuarios.Register.form.UsuarioForm;
import com.CadastroUsuarios.Register.mapper.EnderecoMapper;
import com.CadastroUsuarios.Register.mapper.UsuarioMapper;
import com.CadastroUsuarios.Register.repository.UsuarioRepository;
import com.CadastroUsuarios.Register.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
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

	@Mock
	private UsuarioRepository usuarioRepository;


	@InjectMocks
	private UsuarioService usuarioService;


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


		assertEquals(usuarioDTO.getNome(),usuario.getNome() );
		assertEquals(usuarioDTO.getEmail(), usuario.getEmail());
		assertEquals(usuarioDTO.getCpf(),  usuario.getCpf());
		assertEquals(usuarioDTO.getDataNascimento(), usuario.getDataNascimento() );
	}

	@Test
	void testeEnderecoDTO(){
		Endereco endereco = new Endereco("Rua Teotonio da Fonseca", 21, "casa", "Capão Redondo", "Rio de Janeiro","123456789");
		EnderecoDTO enderecoDTO = enderecoMapper.toDTO(endereco);


		assertEquals(enderecoDTO.getNome(), endereco.getNome());
		assertEquals(enderecoDTO.getNumero(), endereco.getNumero());
		assertEquals(enderecoDTO.getComplemento(), endereco.getComplemento());
		assertEquals(enderecoDTO.getBairro(), endereco.getBairro());
		assertEquals(enderecoDTO.getCidade(), endereco.getCidade());
		assertEquals(enderecoDTO.getCEP(), endereco.getCEP());
	}

	@Test
	void testeCadastro()  {
		Usuario usuario = new Usuario("Iago", "188.965.698-63",  "iagoaguiar202@gmail.com", "18/09/1993", "516161351");
		UsuarioDTO usuarioDTOesperado = new UsuarioDTO(usuario);
		Usuario usuarioEsperadoSalvo = usuarioMapper.toModel(usuarioDTOesperado);
		UsuarioForm usuarioForm = new UsuarioForm(usuario.getNome(),
				usuario.getCpf(),
				usuario.getEmail(),
				usuario.getDataNascimento(),
				usuario.getCEP(),
				usuario.getEndereco()
				);


		assertEquals(usuarioService.cadastrar(usuarioForm).getNome(), usuarioDTOesperado.getNome());
		assertEquals(usuarioService.cadastrar(usuarioForm).getCpf(), usuarioDTOesperado.getCpf());
		assertEquals(usuarioService.cadastrar(usuarioForm).getEmail(), usuarioDTOesperado.getEmail());
		assertEquals(usuarioEsperadoSalvo.getNome(), usuarioDTOesperado.getNome());

	}
}
