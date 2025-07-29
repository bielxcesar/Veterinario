import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @Authors: Gabriel Agustin 11231102284, Pedro Henrique  11231101923
 */
public class Main extends Pet {

    public static void main(String[] args) {
        String AgentamentoSN = JOptionPane.showInputDialog("Você tem agendamento? (S/N)");
        if (AgentamentoSN != null && AgentamentoSN.equalsIgnoreCase("S")) {
            Main petMain = new Main();
            petMain.setNome("Hromeu");
            petMain.setPet("Pintinho");
            petMain.setDiagnosticoInicial("vômito");
            petMain.setIdade(2);
            petMain.setEspecie("Ave");
            petMain.setRaca("Calopsita");
            petMain.setSexo("M");
            petMain.setColoracao("amarelo");
            petMain.setStatus("amarelo");
            petMain.setDataEntrada("11-09-2001");
            petMain.setPeso(8.0f);

            System.out.println("Id: " + petMain.getId() + "\nNome: " + petMain.getNome() + "\nPet: " + petMain.getPet() +
                    "\nDiagnóstico Inicial: " + petMain.getDiagnosticoInicial() +
                    "\nIdade: " + petMain.getIdade() + "\nEspécie: " + petMain.getEspecie() +
                    "\nRaça: " + petMain.getRaca() + "\nSexo: " + petMain.getSexo() +
                    "\nColoração: " + petMain.getColoracao() + "\nStatus: " + petMain.getStatus() +
                    "\nData de entrada: " + petMain.getDataEntrada() + "\nPeso: " + petMain.getPeso() + "Kg");

            String opcao = JOptionPane.showInputDialog("Deseja ver a Declaração do médico? (S/N)");

            if (opcao != null && opcao.equalsIgnoreCase("S")) {
                String tratamento;
                String medicamento;

                String diagnostico = petMain.getDiagnosticoInicial();
                System.out.println("Diagnóstico Inicial: " + diagnostico); // Adicionar esta linha para depuração

                // Determine a medicação com base no diagnóstico inicial
                medicamento = switch (diagnostico.toLowerCase()) {
                    case "rotina" -> "Repouso e carinho";
                    case "vômito" -> "Plasil 2 vezes ao dia";
                    case "convulsão" -> "Fenobarbital 3 vezes ao dia";
                    case "intestino solto" -> "Intestin 2 vezes ao dia";
                    case "ferimento" -> "Merthiolate 2 vezes ao dia";
                    default -> "Observação para melhor diagnóstico";
                };

                // Determine o tratamento com base no status
                tratamento = switch (petMain.getStatus().toLowerCase()) {
                    case "verde" -> "Exame de consulta";
                    case "amarelo" -> "Atendimento normal";
                    case "vermelho" -> "Atendimento urgente";
                    case "branco" -> "Manter em observação";
                    default -> "Status desconhecido";
                };

                Date x = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                System.out.println("\n-- Diagnóstico --\n\nNome: " + petMain.getNome() + "\nPet: " + petMain.getPet() +
                        "\nDiagnóstico Inicial: " + diagnostico + "\nIdade: " + petMain.getIdade() +
                        "\nEspécie: " + petMain.getEspecie() + "\nDeclaração do médico: " + tratamento +
                        "\nMedicação: " + medicamento + "\nData/hora: " + formatter.format(x));

            } else if (opcao != null && opcao.equalsIgnoreCase("N")) {
                System.out.println("\n-- Nenhuma declaração fornecida --");
            } else {
                System.out.println("Entrada inválida.");
            }
        } else if (AgentamentoSN != null && AgentamentoSN.equalsIgnoreCase("N")) {
            System.out.println("--Realize um agendamento--");
        }
    }
}