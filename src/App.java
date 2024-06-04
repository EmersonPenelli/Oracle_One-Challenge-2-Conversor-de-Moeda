
    public static void main(String[] args) {

        // Construção da lista de oções do menu
        // Construção da lista de opções do menu

        MenuPrincipalEnum[] menuPrincipal = MenuPrincipalEnum.values();
        String[] menuPrincipalOpcoes = new String[menuPrincipal.length];
                    try {
                        moeda.conversor();
                    } catch (RuntimeException e) {

                        System.out.println(e.getMessage());
                    }
                    break;

                case "1": // Conversor de temperatura
                    Temperatura temperatura = new Temperatura();
                    try {
                        temperatura.conversor();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2": // Conversor de velocidade
                    Velocidade velocidade = new Velocidade();
                    try {
                        velocidade.conversor();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "-1", "3": // Fechar programa
                    fechar = true;
                    break;
                default:
                    break;

            }
        }

        // Agradecimento
        JOptionPane.showMessageDialog(null, "AVISO_MENSAGEM", Global.TITULO, 0);

    }
}
