package model;

public class UsuarioAdmin extends Usuario {

    public UsuarioAdmin(long id, String nome, String login, String senha) {
        super(id, nome, login, senha, TipoUsuario.ADMIN);
    }

    public void criarUsuario() {
        //função para criar um novo usuário
    }

    public void editarUsuario() {
        //função para editar um usuário
    }

    public void deletarUsuario() {
        //função para deletar um usuário
    }

    @Override
    public void login() {
        System.out.println("Admin logado.");
    }

    @Override
    public void logout() {
        System.out.println("Admin deslogado.");
    }
}
