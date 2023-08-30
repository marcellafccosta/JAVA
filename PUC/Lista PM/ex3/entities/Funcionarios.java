package entities;


public class Funcionarios {

    public String[] nome, sexo, nascimento, idade;
    public int qntFuncionarios;

    public void relatorio() {
        System.out.println("Relatorio");
        for (int i = 0; i < qntFuncionarios; i++) {
            System.out.printf("funcionario %d:%n ", i + 1);
            System.out.println("nome: " + nome[i]);
            System.out.println("sexo: " + sexo[i]);
            System.out.println("data de nascimento: " + nascimento[i]);
            System.out.println("idade: " + idade[i]);
        }
    }

    public void funcionarios() {
        // quantidade e percentual total de funcionarios
        System.out.println("quantidade total de funcionarios: " + qntFuncionarios);

        // quantidade de funcionarios do sexo feminino
        int qntFeminino = 0;
        for (int i = 0; i < qntFuncionarios; i++) {
            if (sexo[i].equalsIgnoreCase("f")) {
                qntFeminino++;
            }
        }
        System.out.println("quantidade de funcionarios do sexo feminino: " + qntFeminino);

        // quantidade de funcionarios do sexo masculino
        int qntMasculino = 0;
        for (int i = 0; i < qntFuncionarios; i++) {
            if (sexo[i].equalsIgnoreCase("m")) {
                qntMasculino++;
            }
        }
        System.out.println("quantidade de funcionarios do sexo masculino: " + qntMasculino);

    }

}

