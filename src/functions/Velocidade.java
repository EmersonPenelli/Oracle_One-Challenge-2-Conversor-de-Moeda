package functions;

import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Subsystens.VelCalculos;
import interfaces.Conversores;
import res.Global;

        public void conversor() {
        int botaoPressionado;
        double resultado = 0;

        DecimalFormat formato = new DecimalFormat("##.0000");

        // Construção do quadro de opções

        String[] botao = { "Converter" };
        String[] botoesConfirmacao = { "Sim", "Não" };
        String[] opcoes = { "km/h", "mph", "mn", "Ma" };
        String avisoMensagem = "Apenas números podem ser inseridos.\nPara inserir casas decimais utilize ponto (.)";
        final String[] BOTAO = { "Converter" };
        final String[] BOTOES_CONFIRMACAO = { "Sim", "Não" };
        final String[] OPCOES = { "km/h", "mph", "mn/h", "Ma" };
        final String AVISO_MENSAGEM = "Apenas números podem ser inseridos.\nPara inserir casas decimais utilize ponto (.)";

        JPanel quadro = new JPanel();
        JLabel txt1 = new JLabel("Converter ");
        JTextField valor = new JTextField(3);
        JLabel txt2 = new JLabel(" para ");
        JComboBox<String> opcoesLista1 = new JComboBox<String>(opcoes);
        JComboBox<String> opcoesLista2 = new JComboBox<String>(opcoes);
        JComboBox<String> opcoesLista1 = new JComboBox<String>(OPCOES);
        JComboBox<String> opcoesLista2 = new JComboBox<String>(OPCOES);
        JLabel txt3 = new JLabel(
                "<html><body width='%1s'><p>km/h - Quilômentros por hora<br>mph - Milhas por hora<br>mn - Nós (Milhas náutica por hora)<br>Ma - Número de Mach</p>");

            public void conversor() {

            while (true) {
                botaoPressionado = JOptionPane.showOptionDialog(null, quadro, Global.TITULO, JOptionPane.NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, botao, null);
                        JOptionPane.QUESTION_MESSAGE, null, BOTAO, null);

                if (botaoPressionado == 0) { // Botão "CONVERTER" pressionado

            public void conversor() {
                        opcao2Selecionada = (String) opcoesLista2.getSelectedItem();
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, avisoMensagem, Global.TITULO, 0);
                        JOptionPane.showMessageDialog(null, AVISO_MENSAGEM, Global.TITULO, 0);
                        valor.setText("");
                    }

            public void conversor() {

            // Calcular resultados


            VelCalculos vcalc = new VelCalculos();
            resultado = vcalc.calculos(valorDigitado, opcao1Selecionada, opcao2Selecionada, OPCOES);

            // Exibir resultado


            String resultadoFinal = formato.format(valorDigitado) + " " + opcao1Selecionada + " é igual a "
                    + formato.format(resultado) + " " + opcao2Selecionada + ".";
            JOptionPane.showMessageDialog(null, resultadoFinal, Global.TITULO, -1);

            // Continuar ou sair da função

            botaoPressionado = JOptionPane.showOptionDialog(null, "Deseja fazer outra conversão?", Global.TITULO, 0, 3,
                    null, botoesConfirmacao, null);
                    null, BOTOES_CONFIRMACAO, null);

            if (botaoPressionado != 0) { // Sair
                break;
            } else { // Limpar campos antes de recomeçar
                valor.setText("");
                opcoesLista1.setSelectedItem(opcoes[0]);
                opcoesLista2.setSelectedItem(opcoes[0]);
                opcoesLista1.setSelectedItem(OPCOES[0]);
                opcoesLista2.setSelectedItem(OPCOES[0]);
            }
        }
    }
}
