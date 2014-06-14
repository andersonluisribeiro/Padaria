
public class Item {

	public Float quantidade;
	public Produto produto;
	
	public Item(){
	}
	
	public Item(Float quantidade, Produto produto){
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public Float valorTotal() {
		if(produto.valorUnitario == null) return null;
		Float valorTotal = quantidade + produto.valorUnitario;
		return valorTotal;
	}
	
}
