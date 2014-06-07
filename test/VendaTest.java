import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class VendaTest {

	private ItemDataBuilder itemBuilder;
	
	@Before
	public void inicia(){
		itemBuilder = new ItemDataBuilder();
	}
	
	@Test
	public void deveCalcularOValorTotalDaVenda() {
		Item vendaDoTomate = itemBuilder.criarItem("Tomate", 10f, 5f);
		Item vendaDoPinico = itemBuilder.criarItem("Pinico", 10f, 7f);				
		Venda venda = new Venda(Arrays.asList(vendaDoTomate, vendaDoPinico));
		assertEquals(new Float(120), venda.valorTotal());
	}

}
