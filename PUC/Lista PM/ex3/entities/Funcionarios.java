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
        double percentualTotal = (qntFuncionarios * 100.0) / qntFuncionarios;
        System.out.println("quantidade total de funcionarios: " + qntFuncionarios);
        System.out.println("percentual total de funcionarios: " + percentualTotal);

        // funcionarios do sexo feminino
        int qntFeminino = 0;
        double percentualF = 0;
        double idadeF = 0;
        for (int i = 0; i < qntFuncionarios; i++) {
            if (sexo[i].equalsIgnoreCase("f")) {
                qntFeminino++;
                idadeF += Integer.parseInt(idade[i]);
                percentualF = (qntFeminino * 100.0) / qntFuncionarios;
            }
        }

        double idadeMediaF = idadeF / qntFeminino;



        System.out.println("FUNCIONARIAS FEMININAS");
        System.out.println("quantidade de funcionarios do sexo feminino: " + qntFeminino);
        System.out.println("percentual de funcionarios do sexo feminino: " + percentualF);
        System.out.println("idade media feminina: " + idadeMediaF);

        // funcionarios do sexo masculino
        int qntMasculino = 0;
        double percentualM = 0;
        double idadeM = 0;
        for (int i = 0; i < qntFuncionarios; i++) {
            if (sexo[i].equalsIgnoreCase("m")) {
                qntMasculino++;
                idadeM += Integer.parseInt(idade[i]);
                percentualM = (qntMasculino * 100.0) / qntFuncionarios;
            }
        }

        double idadeMediaM = idadeM / qntMasculino;
        System.out.println();
        System.out.println("FUNCIONARIOS MASCULINOS");
        System.out.println("quantidade de funcionarios do sexo masculino: " + qntMasculino);
        System.out.println("percentual de funcionarios do sexo masculino: " + percentualM);
        System.out.println("idade media masculina: " + idadeMediaM);

    }

}