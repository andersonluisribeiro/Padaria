import java.util.List;


public class Cliente {
	
	private List<Venda> vendas;
	
	public Cliente(){
		
	}
	
	public Cliente(List<Venda> vendas){
		this.vendas = vendas;
	}

	public Float totalDeCompras() {
		Float total = 0f;
		for(Venda venda : vendas){
			total += venda.valorTotal();
		}
		return total;
		
	}

}
