# iPhone Component Modeling

Este projeto é uma representação do componente iPhone, modelando suas principais funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, utilizando conceitos de Programação Orientada a Objetos (POO) e interfaces em Java.

## Funcionalidades

1. **Reprodutor Musical**
    - `tocar()`: Inicia a reprodução da música.
    - `pausar()`: Pausa a reprodução da música.
    - `selecionarMusica(String musica)`: Seleciona a música a ser reproduzida.

2. **Aparelho Telefônico**
    - `ligar(String numero)`: Faz uma ligação para o número especificado.
    - `atender()`: Atende uma chamada recebida.
    - `iniciarCorreioVoz()`: Inicia o correio de voz.

3. **Navegador na Internet**
    - `exibirPagina(String url)`: Exibe a página da URL fornecida.
    - `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
    - `atualizarPagina()`: Atualiza a página atual.

## Estrutura do Projeto

- **Interfaces**
    - `ReprodutorMusical`: Define métodos relacionados ao reprodutor musical.
    - `AparelhoTelefonico`: Define métodos para funcionalidades telefônicas.
    - `NavegadorInternet`: Define métodos para navegação na web.

- **Classes**
    - `iPhone`: Implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`, fornecendo implementações concretas para todos os métodos.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/lurregiabarreto/POO-Desafio-DIO.git
