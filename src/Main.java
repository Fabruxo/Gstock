//CLASSE USADA SOMENTE PARA TESTAR AS FUNÇÕES

import model.UsuarioAdmin;

public class Main {
    public static void main(String[] args) {
        UsuarioAdmin admin = new UsuarioAdmin(2, "Heric", "admin", "1234");
        admin.login();
        admin.logout();
    }
}