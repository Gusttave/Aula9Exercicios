package Agenda;

public class Agenda{
    String nome, endereco, email;
    int telefone;

    public void setNome(String nome){
        this.nome = nome;

    }
    public String getNome(){
        return this.nome;
            
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setTelefone (int telefone){
        this.telefone = telefone;
    }
    pulic int getTelefone(){
        return this.telefone;
    }
public String toString(){
    return " ----------------------" + "\n" + 
           "Nome:" + this.nome + "\n" +
           "-----------------------" + "\n" +
           "telefone:" + this.telefone + "\n" +
           "-----------------------" + "\n" +
           "Endereco" + this.endereco + "\n" +
           "-----------------------" + "\n"+
           "E-mail" + this.email + "\n"+
           "-----------------------";
}

}