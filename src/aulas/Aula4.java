package aulas;

public class Aula4 {

/* PROGRAMAÇÃO ORIENTADA A OBJETOS (POO)

CLASSE: é o molde, o projeto de algum objeto real. O nome de uma classe
deve ter SEMPRE a primeira letra MAIÚSCULA, além de nomes compostos
com CamelCase. São definidas por atributos (variáveis e valores) e métodos.
EX: uma conta de banco.

public class ContaDoBanco {
 //código aqui
}

OBJETO/INSTÂNCIA: é a representação do objeto em si. Instanciar é criar
um objeto a partir de uma classe.
EX: é a conta de banco real de um cliente.

MÉTODOS (ou FUNÇÕES): comandos que servem para evitar repetição do código e facilitar
a vida do programador. Representam os comportamentos das classes (o que cada classe
faz e como faz). Devem ser nomeados como verbos e PODEM ou NÃO ter PARÂMETROS. Devem ser
SEMPRE definidos dentro de uma classe.

EXEMPLOS DE MÉTODOS:

-Método com parâmetros:
public int somar (int a, int b) {
return a + b;
}

-Método sem parâmetros:
concluirProcessamento ( ) { }

CRITÉRIO DE NOMEAÇÃO DE MÉTODOS:

- Deve ser nomeado como VERBO;
- Padrão camelCase (todas as letras minúsculas, exceto a primeira letra da segunda palavra)


public = método pode ser acessado por qualquer classe.

private = método só pode ser acessado pela classe à qual pertence.

void = não retorna valores. Seus valores NÃO podem ser guardados em outras variáveis.

tipo do método = retorna valores a depender do tipo. Seus valores podem ser guardados em outras variáveis.

parâmetros = são variáveis e afins que entregamos ao método.

{  } delimitam o escopo do método, ou seja, o que ele vai fazer.

return = retorna os valores do método.

static = permite que o método seja acessado por uma classe.

throws Exception --> significa que um método pode conter exceções, ou seja,
que, a depender dos dados inseridos ou do código, ele pode apresentar imprevistos
e, possivelmente, problemas.

ESCOPO: pode ser entendido como o ambiente onde uma variável pode ser
acessada. Em Java, o escopo de variáveis depende do bloco onde elas foram
declaradas.

EXEMPLO:

public class Conta {

//variável da classe Conta:
double saldo = 10.0;

public void sacar(double valor) {
//variável local de método (só pertence ao método):
double novoSaldo = saldo - valor;
}
public void imprimirSaldo( ) {
//disponível em toda a classe:
System.out.println(saldo);
//somente o método sacar conhece a variável abaixo:
System.out.println(novoSaldo);
    }
}

*/

}
