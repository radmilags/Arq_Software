public class UserManager{
    private String email_adress;
    private String nome;

    public UserManager(String nome, String email_adress){
        this.nome = nome;
        this.email_adress = email_adress;
        System.out.println("O usuário foi cadastrado");
    }

    public String GetNome(){
        return this.nome;
    }

    public String GetEmail(){
        return this.email_adress;
    }
}