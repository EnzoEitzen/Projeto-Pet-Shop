package projetopetshop;

public class ProjetoPetShop {

    public static void main(String[] args) {
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setVisible(true);
        TelaPet telaPet = new TelaPet();
        telaPet.setVisible(true);
    }
    
}
