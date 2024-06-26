# DIO - Santander 2024 - Backend com Java

## Desafio de Projeto: Modelando o iPhone com UML

### Autor
- [Daniel Corbetta](https://github.com/danielcorbetta)

## Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Contexto

Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes: 00:15 até 00:55
  
### Funcionalidades a Modelar

1. **Reprodutor Musical**
   1. Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   1. Métodos: `ligar(String numer)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   1. Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivos
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Instruções
1. Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2. Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe [Mermaid](https://mermaid.js.org/)), uma alternativa open-source e compatível com arquivos Markdown como este.
3. Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
4. Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:
```md
https://github.com/glysns/trilha-java-basico/desafios/poo/README.md
```

## Minha Solução
### Diagrama de Classe

Para a modelagem do Diagrama de Classe, eu utilizei o [Mermaid](https://mermaid.js.org/).

```mermaid
classDiagram

class IPhone {
    
}

class ReprodutorMusical {
    <<interface>>
    +tocar() 
    +pausar() 
    +selecionarMusica(String musica)
}

class AparelhoTelefonico {
    <<interface>>
    +ligar(String numero)
    +atender()
    +iniciarCorreioVoz()
}

class NavegadorInternet {
    <<interface>>
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
}

IPhone --> ReprodutorMusical
IPhone --> AparelhoTelefonico
IPhone --> NavegadorInternet
```

### Classes .java
- [IPhone](/classes/IPhone.java)
- [AparelhoTelefonico](/classes/AparelhoTelefonico.java)
- [NavegadorInternet](/classes/NavegadorInternet.java)
- [ReprodutorMuscial](/classes/ReprodutorMusical.java)