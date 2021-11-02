package br.com.javacompleto.javacore._078Wrappers.teste;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        //Classes Wrappers. Aqui temos objetos que estendem a Classe Number
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = 10; //poderia ser Integer integerWrapper = new Integer(10);
                                        //ou ainda: Integer integerWrapper = new Integer("10");
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character characterWrapper = 'A'; //Aqui não pode Character characterWrapper = Charaqcter("A");
                                            //mas pode Character characterWrapper = new Character('A');
        Boolean booleanWrapper = true; //Aqui não é case sensitive!

        //Unboxing (Automático)
        int i = integerWrapper; //Antes teria que usar um método...
                                // neste caso integerWrapper.intValuue();

        //Métodos auxiliares... .parseXXX
        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);

        Long longW2 = Long.valueOf("10"); // o método valueOf() retorna um Wrapper

        System.out.println(Character.isDigit('A')); //O método isDigit()
        System.out.println(Character.isDigit('9')); //retorna se é um dígito

        System.out.println(Character.isLetter('A')); //Retorna se é letra
        System.out.println(Character.isLetterOrDigit('9')); //retorna se é letra ou dígito

        System.out.println(Character.isUpperCase('a')); //retorna se é Maiúscula
        System.out.println(Character.isLowerCase('#')); //retorna se é Minúscula
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
