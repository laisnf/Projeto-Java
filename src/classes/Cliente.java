package classes;

public class Cliente {
//	Atributos(características) da classe Cliente.
//	Os atributos são do cliente e, portanto, são privados.
	private String nome;
	private String email;
	private String cpf;
    private Integer idade;
    
//    Métodos de acesso aos atributos da classe Cliente.
//    Com eles vamos enviar dados e podemos resgatar os dados.
    
      public void setNome(String nome) {
    	  this.nome = nome;
      }
      
      public void setEmail(String Email) {
    	  this.email = email;
    	  
      }
    
      public void setCpf(String cpf) {
    	  this.cpf = cpf;
    	  
      }
      
      public void setIdade(Integer idade) {
    	  this.idade = idade;
    	  
      }
    
    
    public String cadastrar() {
    	String msg = "O cliente "+nome+" foi cadastrado";
    	return msg;
    	
    }
}
