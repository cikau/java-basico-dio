package aulas;

import org.w3c.dom.ls.LSOutput;

public class Aula5 {

    /*
    PALAVRAS RESERVADAS EM JAVA

    PALAVRAS RESERVADAS --> são identificadores de uma linguagem que
    já possuem uma finalidade específica, não podendo ser utilizados para nomear
    variáveis, classes, métodos e/ou atributos. São todas escritas em minúsculo.
    Java possui 52 palavras reservadas. Algumas delas são:

    - Tipos primitivos: int, boolean, double, byte, char, float...
    - Modificadores de acesso: public, private, protected...
    - Modificadores de classes, variáveis e métodos: abstract, class, void, final,
    extends, throws, interface, implements, new, static...
    - Controle de fluxo no bloco de código: break, continue, case...

JAVA DOC --> gerador de documentação criado pela Sun Microsystem para
documentar a API dos programas em Java , a partir do código-fonte. O
resultado é expresso em HTML. 

DOCUMENTAÇÃO --> reúne exemplos, detalhamentos, versões, formas de
métodos e atributos em Java. É como se fosse um "manual do usuário".

TAGS --> anotações especiais usadas para documentar o código. São colocadas
como comentários.
EX: @param (descreve um parâmetro passado para um método ou construtor),
@return (descreve o valor de retorno de um método), @throws ou @exception
(descreve uma exceção que pode ser lançada por um método) etc.


    */

    /*
    EXEMPLOS DE TAGS
    Método para somar dois números inteiros.

    @param numeroUm este é o primeiro parâmetro do método
    @param numeroDois este é o segundo parâmetro do método
    @return int o resultado ou retorno do método é a soma de dois números.
     */

    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

}
