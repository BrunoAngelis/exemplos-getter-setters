public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa bruno = new Pessoa("Bruno Garcia de Angelis","12345678910");

        bruno.setEndereco("Rua Benedito Rosa");

        System.out.println(bruno.getNome()+" - "+bruno.getCpf());
    }
}
