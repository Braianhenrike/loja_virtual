package lojaVirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lojaVirtual.controller.AcessoController;
import lojaVirtual.model.Acesso;
import lojaVirtual.repository.AcessoRepository;
import lojaVirtual.service.AcessoService;

@SpringBootTest(classes = LojaVirtualApplication.class)
public class LojaVirtualApplicationTests {
	
	@Autowired
	private AcessoController acessoController;
	
	
	@Test
	public void testeCadastraAcesso() {
	
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		
		acessoController.salvarAcesso(acesso);
	}

}
