import javax.swing.JOptionPane;

import enums.MenuPrincipalEnum;
import features.Moeda;

class App {
    public static void main(String[] args) {

        String mensagem = "Escolha uma opção";
        String[] opcoes = {"Conversor de moeda", "Conversor de temperatura", "Conversor de velocidade"};
        String opcaoSeleciona = "";
        // Construção da lista de oções do menu
        MenuPrincipalEnum[] menuPrincipal = MenuPrincipalEnum.values();
        String[] opcoes = new String[menuPrincipal.length];
        for (int i = 0; i < menuPrincipal.length; i++) {
            opcoes[i] = menuPrincipal[i].getOpcao();
        }

        opcaoSeleciona += JOptionPane.showInputDialog(null, mensagem, "Menu", -1, null, opcoes, args);
        // Menu Principal
        String opcaoSeleciona = "";
        opcaoSeleciona += JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", -1, null, opcoes, opcoes[0]);

        System.out.println(opcaoSeleciona);

        switch (opcaoSeleciona) {
            case "Conversor de moeda":
                Moeda ConversorMoedas = new Moeda();
                ConversorMoedas.ConversorMoedas();
                break;

            case "Conversor de temperatura":
                break;

            case "Conversor de velocidade":
                break;

            case "Fechar programa":
                break;
        }

        JOptionPane.showMessageDialog(null, "Obrigado e espero ter ajudado!", "Menu", -1);
    }
}
