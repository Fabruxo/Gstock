import dao.ProdutoDAO;
import dao.UsuarioDAO;
import model.*;
import util.Database;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Database.inicializarBanco();

        // TESTE DE USUÁRIO
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario admin = new UsuarioAdmin(0, "Heric", "admin", "123");
        usuarioDAO.inserirUsuario(admin);

        Usuario logado = usuarioDAO.buscarPorLoginSenha("admin", "123");

        if (logado != null) {
            System.out.println("Login realizado com sucesso!");
            System.out.println("Bem-vindo, " + logado.getNome());
            System.out.println("Tipo de usuário: " + logado.getTipoUsuario());
        }

        // TESTE DE PRODUTO
        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto("Filtro de Ar", "2010", "2020", "Civic");
        produtoDAO.inserirProduto(produto);

        List<Produto> produtos = produtoDAO.listarProdutos();

        System.out.println("\nProdutos cadastrados:");
        for (Produto p : produtos) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Ano Inicial: " + p.getAnoSuportadoInicio());
            System.out.println("Ano Final: " + p.getAnoSuportadoFim());
            System.out.println("Modelo: " + p.getModeloCarro());
            System.out.println("-------------------------");
        }
    }
}
