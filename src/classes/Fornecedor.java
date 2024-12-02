package classes;

public class Fornecedor {
	private String RazaoSocial;
	private String nomeFantasia;
	private String cnpj;
//	Para cadastrar fornecedor preciso de um método:
	public String cadastro() {
		String msg = "Fornecedor cadastrado";
		return msg;
	}
//	Caso fosse um método com sim ou não uso variável booleana:
//	public Boolean cadastrou() {
//		Boolean rs = true;
//		retrun rs;
	
    public void setRazaoSocial(String razaoSocial) {
    	this.RazaoSocial = razaoSocial;
    }
    public void setNomeFantasia(String nomeFantasia) {
    	this.nomeFantasia = nomeFantasia;
    }
    public void setCnpj(String cnpj) {
    	this.cnpj = cnpj;
    }
}
    

