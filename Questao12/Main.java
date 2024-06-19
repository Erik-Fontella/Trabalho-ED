package Questao12;

// Considere um sistema de locação de veículos que utiliza listas
// duplamente encadeadas em memória para armazenar os dados em tempo de
// execução. Existem três listas, uma para armazenar clientes, outra para armazenar
// veículos e uma terceira para armazenar as locações. Explique as possíveis estratégias
// de implementação que garantiriam que um cliente e um veículo não pudessem ser
// excluídos caso estivessem atrelado à uma locação.

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando instância do sistema de locação
        SistemaLocacao sistema = new SistemaLocacao();

        // Adicionando clientes
        Cliente cliente1 = new Cliente(1, "João Silva");
        Cliente cliente2 = new Cliente(2, "Maria Oliveira");

        sistema.adicionarCliente(cliente1);
        sistema.adicionarCliente(cliente2);

        // Adicionando veículos
        Veiculo veiculo1 = new Veiculo(1, "Ford Fiesta");
        Veiculo veiculo2 = new Veiculo(2, "Chevrolet Onix");

        sistema.adicionarVeiculo(veiculo1);
        sistema.adicionarVeiculo(veiculo2);

        // Realizando uma locação
        Date dataInicio = new Date();
        Date dataFim = new Date(dataInicio.getTime() + 7 * 24 * 60 * 60 * 1000); // dataFim é 7 dias após dataInicio

        Locacao locacao1 = new Locacao(1, cliente1, veiculo1, dataInicio, dataFim);
        sistema.adicionarLocacao(locacao1);

        // Tentativa de remover cliente com locação ativa
        boolean remocaoCliente1 = sistema.removerCliente(cliente1);
        if (!remocaoCliente1) {
            System.out.println("Não foi possível remover o cliente 1. Existem locações ativas associadas.");
        }

        // Tentativa de remover veículo com locação ativa
        boolean remocaoVeiculo1 = sistema.removerVeiculo(veiculo1);
        if (!remocaoVeiculo1) {
            System.out.println("Não foi possível remover o veículo 1. Existem locações ativas associadas.");
        }

        // Exibindo as locações atuais
        System.out.println("Locações atuais:");
        sistema.imprimeLocacoes();

        // Simulando encerramento de uma locação após 7 dias
        sistema.encerrarLocacao(locacao1);

        // Exibindo as locações após encerramento
        System.out.println("\nLocações após encerramento:");
        sistema.imprimeLocacoes();

        

    }
}
