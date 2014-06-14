import java.util.List;


public class Venda {

	public List<Item> itens;
	
	public Venda(){
	}
	
	public Venda(List<Item> itens){
		this.itens = itens;
	}

	public Float valorTotal() {
		Float total = 0f;
		for(Item item : itens){
			total -= item.valorTotal();
		}
		return total;
	}

}
