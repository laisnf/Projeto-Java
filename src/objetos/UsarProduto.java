package objetos;

import classes.Fornecedor;
import classes.Produto;

public class UsarProduto {

	public static void main(String[] args) {
		Fornecedor dell = new Fornecedor();
		dell.setRazaoSocial("Dell Computer");
		dell.setNomeFantasia("Dell");
		dell.setCnpj("1268774956887");
		System.out.println(dell.cadastro());
		
		Produto mouse = new Produto();
		mouse.SetNome(" Mouse sem fio");
		mouse.SetDescricao("Mouse sem fio recarregável");
		mouse.setPreco(54.20);
		mouse.setFornecedor(dell);
		System.out.println(mouse.cadastrar());
		System.out.println("O preço do produto é "+mouse.getPreco());

	}

}
