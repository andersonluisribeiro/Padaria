import java.util.Arrays;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
		
		Venda vendaDeTomate = mock(Venda.class);
		when(vendaDeTomate.valorTotal()).thenReturn(4.6f);
		
		Venda vendaDePinico = mock(Venda.class);
		when(vendaDePinico.valorTotal()).thenReturn(4.8f);
		
		Cliente cliente = new Cliente(Arrays.asList(vendaDePinico, vendaDeTomate));
		
		assertEquals(new Float(9.4), cliente.totalDeCompras());
		
	}

}
