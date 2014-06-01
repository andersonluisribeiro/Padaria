import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ItemTest {

	private ItemDataBuilder builder;
	
	@Before
	public void inicia(){
		builder = new ItemDataBuilder();
	}
	
	@Test
	public void deveCalcularOValorTotalDoItem() {
		Item item = builder.criarItem("Higiene", 2.99f, 5f);
		assertEquals(new Float(14.95f), item.valorTotal());
	}
	
	@Test
	public void deveReturnarNuloQuandoOValorDoItemForNulo(){
		Item item = builder.criarItem("Higiene", null, 5f);
		assertEquals(null, item.valorTotal());
	}

}
