
import java.util.ArrayList;
import java.util.Scanner;

public class Questao{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String[][] quiz = {
            {"1. O que é um processador e qual é sua principal função em um sistema computacional?", "Armazenar dados permanente", " Executar instruções e realizar cálculos", " Controlar dispositivos de entrada e saída", 
" Manter a tela ligada", "nenhuma das alternativas "},
            {"2. Qual é a diferença entre memória interna e memória externa ?", "A memória interna é volátil e a externa é permanente", "A memória externa é mais rápida que a interna", "A memória interna armazena dados por mais tempo que a externa", "A memória externa é usada pelo processador para cálculos", "nenhuma das alternativas"},
            {"3. Para que serve a memória cache em um processador ?", "armazenar Dados Temporarios", "armazenar Arquivos Sistema", "armazenar Programas Usuario", "armazenar Documentos Salvos", "nenhuma das alternativas"},
            {"4. Dê um exemplo de um dispositivo de entrada e um de saída em um computador.", "mouse", "monitor", "impressora", "foneDeOuvido", "nenhuma das alternativas"},
            {"5. O que é a arquitetura de John von Neumann ?", "programa E Dados Na Mesma Memoria", "modelo Separacao Memoria", "sistema Multiprocessadores", "memoria Dedicada Instrucoes", "nenhuma das alternativas"},
            {"6. Qual é a principal diferença entre um sistema operacional multitarefa e um sistema monousuário ?", "multi tarefa Multiplos Processos", "multitarefa Requer Mais Memoria", "monousuario Multiplos Usuarios", "monousuario Mais Eficiente", "nenhuma das alternativas"},
            {"7. O que significa a sigla IoT ?", "internet Das Coisas", "internet De Tudo", "internet De Transferencia", "internet Operacional Tecnica", "nenhuma das alternativas"},
            {"8. Qual é o papel da memória RAM em um computador ?", "armazenar Dados Temporarios", "armazenar Dados Permanentemente", "executar Instrucoes Programas", "conectar Dispositivos Externos", "nenhuma das alternativas"},
            {"9. Quais são os benefícios do uso de memória cache para o desempenho do sistema?", "melhora Desempenho Armazenando Dados", "aumenta Tempo Resposta", "reduz Uso Memoria Externa", "diminui Quantidade Dados Processados", "nenhuma das alternativas"},
            {"10. Cite um exemplo de aplicação de IoT em uma cidade inteligente.", "semaforos Sensores Inteligentes", "televisao Conectada", "impressoras Conectadas","rede Social Cidadãos", "nenhuma das alternativas"},
            {"11. Explique o conceito de memória virtual e como ela é gerenciada pelo sistema operacional.", "espaco Disco Rigido Expansao RAM", "memoria Fisica Inativa", "memoria Processador Quando RAM Cheia", "memoria Reservada Dados Criticos", "nenhuma das alternativas"},
            {"12. Descreva a estrutura e função de um pipeline no processador e como ele melhora o desempenho.", "tecnica Divide Processamento Instrucoes", "processo Refrigeração Processador", "canal Comunicacao CPU Memoria", "sistema Gerenciar Multiplicidade", "nenhuma das alternativas"},
            {"13. Como a arquitetura de John von Neumann influencia o modelo de processamento sequencial em um sistema computacional?", "causa Gargalo Memoria", "intrduz Processamento Paralelo", "melhora Seguranca Multitarefa", "separa Dados Instrucoes", "nenhuma das alternativas"},
            {"14. Quais são os desafios de segurança em IoT quando aplicado a cidades inteligentes ?", "vulnerabilidades Sensores Dispositivos", "falta Integração Dispositivos Fabricantes", "dificuldade Expansao Rede","problemas Sincronizacao Dados", "nenhuma das alternativas"},
            {"15. Explique a diferença entre a memória cache L1, L2 e L3 em termos de acesso e velocidade.", "cache L1 Maior Mais Lenta", "cache L1 Menor Mais Rapida", "cache L2 Apenas Dispositivos Externos", "cache L3 Nao Usada Processadores Modernos", "nenhuma das alternativas"}
        };
        
        ArrayList<String> respostaCorreta = new ArrayList<>();
        ArrayList<String> respostaErrada = new ArrayList<>();
        
        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.out.println("Aluno: Oneir Júnior Ferreira");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Universidade: Unifan");
        System.out.println("Curso: Engenharia de software 2 período - Turma B");
        System.out.println("Data: 29/09/24 ");
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.out.println("SEJA BEM VINDO AO QUIZ SOBRE TI !");
        System.out.println("");
        System.out.println("Responda as respectivas perguntas selecionando o número correspondente a resposta");
        System.out.println("");
        
        //exibir pergunta
        for ( int i = 0; i < quiz.length; i++) {
            System.out.println(quiz[i][0]);
            
            //exibir opções de pergunta//
            for (int j = 1; j < quiz[i].length; j++) {
                System.out.println(j + ". " + quiz[i][j]);
            }
            
            //receber respostas do usuário//
            System.out.println("");
            System.out.print("Escolha uma opção (1 - " + (quiz[i].length - 1) + "): ");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            if (quiz[i][escolha].equalsIgnoreCase(quiz[i][1])) {
                // Adicionar ao array de respostas corretas
                respostaCorreta.add(quiz[i][0] + " (Sua resposta: " + quiz[i][escolha] + ")");
            } else {
                // Adicionar ao array de respostas erradas
                respostaErrada.add(quiz[i][0] + " (Sua resposta: " + quiz[i][escolha] + " | Resposta correta: " + quiz[i][1] + ")");
            }
        
        //Exibir resultados
        System.out.println("\nRespostas corretas:");
        for (String correta : respostaCorreta) {
            System.out.println(correta);
        }
        
        System.out.println("\nRespostas erradas:");
        for (String errada : respostaErrada) {
            System.out.println(errada);
        }
        
        //Exibir contagem final
        System.out.println("\nVocê acertou " + respostaCorreta.size() + " de " + quiz.length + " perguntas.");
        System.out.println("");
        }
    }   
}
