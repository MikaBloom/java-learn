package cap11;

class Cliente {

	private String nome;
	String endereco;
   

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   void mostra() {
      System.out.println("\n Nome: " + this.nome);
   }

   public String toString(){
      return " Nome: " + this.nome;
   }
}
