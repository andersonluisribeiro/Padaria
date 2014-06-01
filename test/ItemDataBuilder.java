
public class ItemDataBuilder {

	public Item criarItem(String tipoDoProduto, Float valorUnitarioDoProduto, Float quantidade){
		TipoDeProduto tipo = new TipoDeProduto(tipoDoProduto);
		Produto produto = new Produto(valorUnitarioDoProduto, tipo);
		Item item = new Item(quantidade, produto);
		return item;
	}

}
