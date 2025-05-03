package model;

public class UsuarioComum extends Usuario {

    public UsuarioComum(long id, String nome, String login, String senha) {
        super(id, nome, login, senha, TipoUsuario.CLIENTE);
    }

    public void verProdutoEstoque() {
        // lógica de visualização
    }

    @Override
    public void login() {
        System.out.println("Cliente logado.");
    }

    @Override
    public void logout() {
        System.out.println("Cliente deslogado.");
    }
}
