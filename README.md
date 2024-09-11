# Sistema de Estoque para Supermercado de Bairro

Bem-vindo ao repositório do **Sistema de Estoque para Supermercado de Bairro**. Este projeto tem como objetivo ajudar pequenos mercados a gerenciar suas operações de estoque, compras, vendas, fornecedores, clientes e funcionários. Ele foi desenvolvido em **Java** usando princípios da **Programação Orientada a Objetos (POO)** para criar um sistema modular, fácil de entender e manter.

## Autores:
- Francisco Eudo da Silva - mat.: 2023011967
- Gabriel Vasconcelos Andrade da Silva - mat.: 2023009898
- Wagner Fernando Lavandoski Padilha - mat.: 2023012089

## Funcionalidades Principais

1. **Gerenciamento de Produtos**: 
    - Cadastro e controle de produtos no estoque.
    - Verificação de limites de estoque máximo e mínimo para evitar rupturas ou excessos de estoque.
    - Função de reposição automática de estoque com base em compras recebidas.

2. **Gerenciamento de Fornecedores**: 
    - Cadastro e manutenção de informações de fornecedores.
    - Integração com o recebimento de produtos e controle de pedidos.

3. **Gerenciamento de Vendas**: 
    - Registra as vendas realizadas, calculando o impacto no estoque.
    - Processamento de pagamentos e tipos de pagamento aceitos (cartão, dinheiro, etc.).
    - Função de trocas e devoluções.

4. **Gerenciamento de Clientes**: 
    - Registro de informações de clientes.
    - Histórico de compras e acompanhamento de devoluções e trocas.

5. **Gerenciamento de Funcionários**: 
    - Cadastro de funcionários, incluindo vendedores e gerentes.

## Estrutura do Projeto

O projeto é dividido em várias classes para organizar os diferentes aspectos do sistema. Aqui estão algumas das principais classes incluídas:

- **Product.java**: Classe que gerencia o cadastro de produtos, incluindo controle de estoque.
- **ProductReceived.java**: Gerencia o recebimento de produtos dos fornecedores.
- **Supplier.java**: Classe para cadastrar e gerenciar fornecedores.
- **Sale.java**: Gerencia as vendas realizadas, incluindo o impacto no estoque.
- **Employee.java**: Controle dos funcionários.
- **Customer.java**: Gerencia os clientes do supermercado.
- **ExchangeAndReturn.java**: Gerencia as trocas e devoluções de produtos.
- **PaymentType.java**: Controla os tipos de pagamento aceitos.
- **PurchaseRequest.java**: Gerencia pedidos de compra de produtos aos fornecedores.
- **Address.java**: Classe que gerencia os endereços dos clientes e fornecedores.
- **ProductToOperate.java**: Classe-auxiliar para outras classes operarem as quantidade dos produtos.

## Como Rodar o Projeto

### Pré-requisitos:

- **Java**: Certifique-se de ter o JDK instalado. Você pode baixar o JDK [aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **IDE**: Recomendamos usar uma IDE como IntelliJ IDEA, Eclipse ou VS Code com suporte para projetos Java.

### Passos para configurar o projeto:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/sistema-estoque-supermercado.git

2. **Importe o projeto em sua IDE:**

- Abra a IDE de sua escolha.
- Selecione a opção para importar um projeto existente e navegue até o diretório onde o repositório foi clonado.

3. **Compile o projeto:**

- A IDE deve identificar automaticamente os arquivos .java e compilar o código.

4. **Execute o projeto:**

- O projeto principal pode ser executado diretamente da IDE. Você pode criar um ponto de entrada em uma classe Main.java se ainda não existir.
- Exemplo:
  ```bash
  public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Sistema de Estoque!");
        // Aqui você pode instanciar objetos e testar o sistema
    }
  }
