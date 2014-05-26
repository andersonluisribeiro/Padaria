import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class VendaTest {

	@Test
	public void deveCalcularOValorTotalDaVenda() {
		
		Produto tomate = new Produto();
		tomate.valorUnitario = 10f;
		
		Produto pinico = new Produto();
		pinico.valorUnitario = 10f;
		
		Item vendaDoTomate = new Item();
		vendaDoTomate.quantidade = 5f;
		vendaDoTomate.produto = tomate;
		
		Item vendaDoPinico = new Item();
		vendaDoPinico.quantidade = 7f;
		vendaDoPinico.produto = pinico;
		
		List<Item> itens = new ArrayList<Item>();
		itens.add(vendaDoPinico);
		itens.add(vendaDoTomate);
		
		Venda venda = new Venda();
		venda.itens = itens;
		
		Float resultado = venda.valorTotal();
		Float resultadoEsperado = 120f;
		assertEquals(resultadoEsperado, resultado);
	}

}
