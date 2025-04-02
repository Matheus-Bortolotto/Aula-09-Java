# Veiculo.java

Este projeto contém a classe `Veiculo`, que representa um veículo para aluguel, e seus testes unitários utilizando JUnit.

## Estrutura do Código

### Classe Veiculo

A classe `Veiculo` possui os seguintes atributos e métodos:

- **Atributos:**
  - `modelo`: Nome do modelo do veículo.
  - `valorDiaria`: Valor da diária do aluguel.

- **Métodos:**
  - `Veiculo(String modelo, double valorDiaria)`: Construtor que inicializa os atributos e valida se o valor da diária não é negativo.
  - `double calcularCusto(int dias)`: Calcula o custo total do aluguel baseado no número de dias. Se o período for igual ou superior a 7 dias, aplica um desconto de 10%.
  - `double calcularMulta(int diasAtraso)`: Calcula a multa pelo atraso na devolução do veículo. O valor é 1.5 vezes o valor da diária por dia de atraso.
  - `boolean desconto(int dias)`: Método privado que verifica se o desconto deve ser aplicado (aluguel por 7 dias ou mais).

### Classe de Testes VeiculoTest

A classe `VeiculoTest` utiliza JUnit para validar o funcionamento da classe `Veiculo`. Os testes incluem:

- **Testes para `calcularCusto`**
  - Cálculo sem desconto.
  - Cálculo com desconto para 7 ou mais dias.
  - Cálculo para 0 dias (deve retornar 0).
  - Validação de entrada negativa (deve lançar uma exceção `IllegalArgumentException`).

- **Testes para `calcularMulta`**
  - Sem atraso (deve retornar 0).
  - Com atraso de 1 dia.
  - Com atraso de múltiplos dias.

- **Testes para o construtor**
  - Validação do valor da diária (não pode ser negativo).

## Como Executar

1. **Compilar o código:**
   ```sh
   javac -cp .:junit-5.7.1.jar org/example/Veiculo.java org/example/VeiculoTest.java
   ```

2. **Executar os testes:**
   ```sh
   java -jar junit-platform-console-standalone-1.7.1.jar --class-path . --select-class org.example.VeiculoTest
   ```

## Tecnologias Utilizadas

- Java
- JUnit 5
