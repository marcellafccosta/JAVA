import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        /*
         * //exercicio um
         * 
         * Scanner sc = new Scanner(System.in);
         * int vetA[] = new int[15];
         * int vetB[] = new int[15];
         * 
         * System.out.println("Digite os valores:");
         * for (int i = 0; i < 15; i++) {
         * vetA[i] = sc.nextInt();
         * }
         * for (int i = 0; i < 15; i++) {
         * vetB[i] = calculaFat(vetA[i]);
         * 
         * }
         * 
         * System.out.println("Vetor Um");
         * for (int i = 0; i < 15; i++) {
         * System.out.printf("%d ", vetA[i]);
         * }
         * 
         * System.out.println("Vetor Dois");
         * for (int i = 0; i < 15; i++) {
         * System.out.printf("%d ", vetB[i]);
         * }
         * 
         * sc.close();
         * }
         * 
         * public static int calculaFat(int num) {
         * if (num == 0) {
         * return 1;
         * } else {
         * int fat = 1;
         * for (int i = 1; i <= num; i++) {
         * fat *= i;
         * }
         * return fat;
         * }
         */

        /*
         * // exercicio dois
         * Scanner sc = new Scanner(System.in);
         * int vetA[] = new int[10];
         * int vetParImpar[] = new int[2];
         * 
         * for (int i = 0; i < 10; i++) {
         * vetA[i] = sc.nextInt();
         * }
         * 
         * for (int i = 0; i < 10; i++) {
         * if (i % 2 == 0) {
         * vetParImpar[0]++;
         * } else {
         * vetParImpar[1]++;
         * }
         * }
         * 
         * System.out.printf("par = %d, impar = %d", vetParImpar[0], vetParImpar[1]);
         * 
         * sc.close();
         */

      /*  // exercicio tres
        Scanner sc = new Scanner(System.in);
        String[] nome, sexo, nascimento, idade;
        int qntFuncionarios;
        

        System.out.print("digite a quantidade de funcionarios: ");
        qntFuncionarios = sc.nextInt();
        sc.nextLine();

        nome = new String[qntFuncionarios];
        sexo = new String[qntFuncionarios];
        nascimento = new String[qntFuncionarios];
        idade = new String[qntFuncionarios];

    

        for (int i = 0; i < qntFuncionarios; i++) {
           
            System.out.printf("funcionario %d: ", i + 1);
            nome[i] = sc.nextLine();

            System.out.print("sexo: ");
            sexo[i] = sc.nextLine();

            System.out.print("data de nascimento: ");
            nascimento[i] = sc.nextLine();

            System.out.print("idade: ");
            idade[i] = sc.nextLine();


        }


        // a - relatorio
        System.out.println("Relatorio");
        for (int i = 0; i < qntFuncionarios; i++) {
            System.out.printf("funcionario %d:%n ", i + 1);
            System.out.println("nome: " + nome[i]);
            System.out.println("sexo: " + sexo[i]);
            System.out.println("data de nascimento: " + nascimento[i]);
            System.out.println("idade: " + idade[i]);
        }

        // b - imprimir
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


        // idade media geral dos funcionarios
        double idadeMediaGeral;


        // idade media dos funcionarios do sexo feminino

        // idade media dos funcionarios do sexo masculino

        sc.close();*/

    }

   

}