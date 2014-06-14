import java.util.Arrays;


public class VendaDataBuilder {

	public Venda criarVenda(String tipoDeProduto, Float quantidade, Float valorUnitario) {
		TipoDeProduto tipo = new TipoDeProduto(tipoDeProduto);
		Produto produto = new Produto(valorUnitario, tipo);
		Item item = new Item(quantidade, produto);
		
		Venda venda = new Venda(Arrays.asList(item));
		return venda;
		
	}

}
