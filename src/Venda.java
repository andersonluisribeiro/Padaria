import java.util.List;


public class Venda {

	public List<Item> itens;

	public Float valorTotal() {
		Float total = 0f;
		for(Item item : itens){
			total += item.valorTotal();
		}
		return total;
	}

}
