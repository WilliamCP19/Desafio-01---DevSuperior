# Desafio-01---DevSuperior

### Obejtivo do Desafio
Componentes e Injeção de Dependência

## Descrição da Atividade
Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor básico do pedido, e adicionar o valor do frete. 
A regra para cálculo do frete é a seguinte:

| Valor Básico do Pedido (Sem Desconto) | Frete    |
| ----------------------------------    | -------- |
| Abaixo de R$ 100.00                   | R$ 20.00 |
| De R$ 100.00 até R$ 200.00            | R$ 12.00 |
| R$ 200.00 ou mais                     |  Grátis  |

### Exemplo

| ENTRADA (Código, Valor Básico, Porcentagem de Desconto | SAÍDA                  |
| ------------------------------------------------------ | ---------------------- |
| Código: 1034                                           | Pedido Código 1034     |
| Preço: 150.00                                          | Valor Total: R$ 132.00 |
| Desconto: 20.0                                         

*A saída deverá ser mostrada no log do terminal da aplicação.

### Entidade 

| ORDER    | Tipo    |
| -------- | ------- |
| code     | Integer |
| basic    | Double  |
| discount | Double  |

### Services

#### OrderService
Serviço OrderService: responsável por operações referentes a pedidos.

| Método | Parâmetro           | Retorno |
| ------ | ------------------- | ------- |
| total  | Entidade ORDER      | Double  |

*OrderService depende de ShippingService.

#### ShippingServive
Serviço ShippingService: responsável por operações referentes a frete.

| Método    | Parâmetro           | Retorno |
| --------- | ------------------- | ------- |
| shipment  | Entidade ORDER      | Double  |
