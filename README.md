Java - Arquitetura MVC

Este projeto é uma calculadora de operações básicas desenvolvida em Java, utilizando o padrão de arquitetura **MVC (Model-View-Controller)**. Foi criado com o objetivo de praticar organização de código, tratamento de erros e princípios de separação de responsabilidades.

## Funcionalidades

- Soma de múltiplos números  
- Subtração sequencial  
- Multiplicação sequencial  
- Divisão sequencial (com tratamento de divisão por zero)  
- Menu interativo via terminal  
- Validação de entrada com tratamento de exceções

## Estrutura do Projeto

- `model/Calculadora.java` — Contém a lógica das operações matemáticas  
- `view/CalculadoraView.java` — Responsável pela interação com o usuário (entrada e saída)  
- `controller/CalculadoraController.java` — Gerencia o fluxo entre a interface e a lógica  
- `Main.java` — Ponto de entrada do programa

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/JaderMeinerz/Calculadora.git

2. Compile o projeto:

javac -d out src/org/example/**/*.java


3. Execute o programa:

java -cp out org.example.Main



> É necessário ter o Java instalado (versão 8 ou superior).



Próximos Passos

Refatorar operações usando expressões Lambda

Adicionar testes automatizados com JUnit

Melhorar a modularidade e reutilização de código

Criar uma interface gráfica (opcional)

Internacionalização (i18n)


Status

> Projeto em desenvolvimento contínuo para fins de estudo e prática.



Repositório

Acesse o projeto completo aqui:
github.com/JaderMeinerz/Calculadora
