# objeto-java

Projeto feito para documentar como se instancia um objeto em Java.

## Execução local

Para executar o projeto localmente, precisaremos __compilar__ os códigos-fonte e __rodar__ os arquivos gerados pela compilação.
Os comandos abaixo foram executados em uma máquina que utiliza Debian GNU/Linux.0

```terminal
# Compilação
@cannudo ➜ /workspaces/objeto-java (main) $ javac Contador.java main.java
```

> O comando `javac` executa a compilação dos arquivos com extensão `.java` e gera os arquivos compilados com extensão `.class`. Para executar os arquivos `.class`, precisaremos utilizar o comando `java`.

```terminal
# Execução
@cannudo ➜ /workspaces/objeto-java (main) $ java main
```

## Explicações adicionais

Este projeto foi criado para documentar como se instancia um objeto em Java. Isso vai ser útil para a disciplina de Estrutura de Dados, que implementa as estruturas nesta linguagem de programação. As "estruturas genéricas de dados" serão implementadas nas interfaces.

### Formato das classes em Java
```java
<modificador-de-acesso-da-classe> class <nome-da-classe> {
    <modificador-de-acesso-do-método> <escopo-do-metodo> <tipo-de-retorno> <nome-do-método>(<tipo-do-parametro> <nome-do-parametro>) {
        <instruções-java>;
    }
}
```

#### Classe válida em Java
```java
public class Universo {
    public static void main(String[] args) {
        System.out.println("Olá, universo!");
    }
}
```

## Código

Nos códigos-fonte do projeto, podemos observar como se constrói uma classe e como instanciar um objeto.