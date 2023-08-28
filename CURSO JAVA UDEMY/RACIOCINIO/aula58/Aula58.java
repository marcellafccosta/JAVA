public class Aula58 {
    public static void main(String[] args) {

        /*
         * formatar: toLowerCase(), toUpperCase(), trim()
         * recortar: substring(inicio), substring(inicio, fim)
         * substituir: Replace(char, char), Replace(string, string)
         * buscar: IndexOf, LastIndexOf
         * str.Split(" ")
         */

        String original = "abcde FGHIJ ABC abc DEFG    ";
        System.out.println("original: " + original);

        // converter tudo para letra minuscula
        String s01 = original.toLowerCase();
        System.out.println("toLowerCase: " + s01);

        // converter tudo para letra maiuscula
        String s02 = original.toUpperCase();
        System.out.println("toUpperCase: " + s02);

        // manter a mesma string original,
        // mas vai eliminar os espacos em branco nos cantos
        String s03 = original.trim();
        System.out.println("trim: " + s03);

        // pegar somente o caractere da posicao 2 em diante,
        // e montar uma nova string
        String s04 = original.substring(2);
        System.out.println("substring(2): " + s04);

        // recortar a partir do 2, mas abaixo do 9
        String s05 = original.substring(2, 9);
        System.out.println("substring(2, 9): " + s05);

        // trocar o a minusculo pelo x toda vez
        String s06 = original.replace('a', 'x');
        System.out.println("replace(char): " + s06);

        // trocar abc por xy toda vez
        String s07 = original.replace("abc", "xy");
        System.out.println("replace(String): " + s07);

        // primeira ocorrencia do bc
        int i = original.indexOf("bc");
        System.out.println("indexOf: " + i);

        //ultima ocorrencia do bc
        int j = original.lastIndexOf("bc");
        System.out.println("lastIndexOf: " + j);

        //recortar a string
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}