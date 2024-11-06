<h1>Projeto: Encontrar o Maior de Três Números em Java</h1>

<p>Este projeto é uma aplicação em Java que permite ao usuário inserir três números inteiros e, utilizando um método específico, determinar qual dos três é o maior. O programa também oferece ao usuário a opção de continuar inserindo novos números para novas comparações até que ele deseje encerrar.</p>

<h2>Estrutura do Projeto</h2>

<p>O projeto é composto por duas classes:</p>

<ol>
    <li><strong>Classe <code>Main</code></strong>: Controla a interação com o usuário e a execução do programa. Solicita que o usuário insira três números e chama o método de verificação da outra classe. Após exibir o maior número entre os três, pergunta se o usuário deseja realizar outra operação.</li>
    <li><strong>Classe <code>maiorNumero</code></strong>: Contém o método responsável por encontrar o maior número entre os três valores fornecidos. Este método, <code>numeral</code>, utiliza uma simples lógica condicional para comparar os números e retornar o maior deles.</li>
</ol>

<h3>Detalhes das Classes</h3>

<ul>
    <li><strong>Classe <code>Main</code></strong>
        <ul>
            <li>Cria uma instância de <code>Scanner</code> para capturar a entrada de dados do usuário.</li>
            <li>Utiliza um loop <code>do-while</code> para permitir que o usuário continue realizando operações até decidir encerrar.</li>
            <li>Em cada execução do loop, solicita que o usuário insira três números e passa esses valores ao método <code>numeral</code> da classe <code>maiorNumero</code>.</li>
            <li>Exibe o maior número encontrado e pergunta ao usuário se deseja continuar.</li>
            <li>Encerra o programa quando o usuário opta por não continuar.</li>
        </ul>
    </li>
    <li><strong>Classe <code>maiorNumero</code></strong>
        <ul>
            <li>Contém o método <code>numeral</code>, que recebe três inteiros como parâmetros.</li>
            <li>Compara os valores dos três números e determina o maior deles.</li>
            <li>Retorna o maior número para a classe <code>Main</code>.</li>
        </ul>
    </li>
</ul>

<h2>Objetivos do Projeto</h2>

<p>Os objetivos deste projeto são:</p>

<ol>
    <li><strong>Demonstrar a Comparação entre Três Números</strong>: Mostrar como encontrar o maior valor entre três números inteiros.</li>
    <li><strong>Uso de Métodos</strong>: Aplicar a lógica de comparação em um método específico para modularizar e organizar o código.</li>
    <li><strong>Interação do Usuário com Repetição</strong>: Permitir que o usuário execute a operação repetidamente até optar por sair, utilizando loops e condições de controle.</li>
</ol>

<h2>Funcionalidades</h2>

<ul>
    <li><strong>Entrada de Dados</strong>: O programa solicita três números inteiros do usuário.</li>
    <li><strong>Comparação de Números</strong>: O método <code>numeral</code> determina qual dos três números é o maior.</li>
    <li><strong>Continuidade Opcional</strong>: O usuário pode optar por realizar outra comparação ou encerrar o programa.</li>
</ul>

<h2>Conclusão</h2>

<p>Este projeto implementa uma aplicação em Java que compara três números inteiros e retorna o maior deles. A estrutura modular permite que a classe <code>Main</code> gerencie a interação com o usuário e a execução, enquanto a classe <code>maiorNumero</code> encapsula a lógica de comparação. O projeto demonstra como utilizar métodos para simplificar o código e organizá-lo de forma clara e reutilizável.</p>
