import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
	
	private VendaDataBuilder vendaBuilder;
	
	@Before
	public void inicio(){
		vendaBuilder = new VendaDataBuilder();
	}
	
	@Test
	public void deveCalcularOValorTotalDasCompras() {
		Venda vendaDeTomate = vendaBuilder.criarVenda("Tomate", 2f, 2.3f);
		Venda vendaDePinico = vendaBuilder.criarVenda("Pinico", 2f, 2.4f);
		
		Cliente cliente = new Cliente(Arrays.asList(vendaDePinico, vendaDeTomate));
		
		assertEquals(new Float(9.4), cliente.totalDeCompras());
		
	}

}
