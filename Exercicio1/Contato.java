public class Contato {

    //Atributos da classe
     private int  contato ;
     private int telefone;
     private String nome   ;
     private String email ;

    //Métodos construtores
     public Contato () {}

     public Contato ( int contato , String nome , int  telefone , String email ) {   
        this.contato = contato ;
        this.nome = nome ;
        this.telefone = telefone ;
        this.email = email ;
    }


    //Métodos getters e setters

    public  int  getContatogetContato () {
        return  contato ;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
