## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

REQUISITOS FUNCIONAIS: 
Funcionalidade: Adicionar tarefas a lista 	
●	Dado poder acessar a To-Do-List 	
●	Quando adicionar as tarefas na Lista 	
●	Então validar a adição das tarefas na Lista 

Funcionalidade: Listar todas as tarefas 
●	Dado poder acessar a To-Do-List 
●	Quando selecionar a opção listar todas as tarefas 
●	Então exibir a lista de todas as tarefas

Funcionalidade: Marcar tarefa como concluída 
●	Dado poder acessar a To-Do-List 	
●	Quando selecionar a opção de tarefa concluída 	
●	Então marcar a tarefa como concluída 	
 	
Funcionalidade: Excluir tarefas da lista 
●	Dado uma To-Do-List com pelo menos uma tarefa
●	Quando o usuário selecionar a tarefa e marcar a opção de exclusão
●	Então a tarefa excluída não deverá mais aparecer na lista

Funcionalidade: Editar tarefas da lista 
●	Dado uma To-Do-List com pelo menos uma tarefa
●	Quando o usuário selecionar a tarefa e marcar a opção de edição
●	E então alterar a tarefa selecionada
●	Então a tarefa selecionada deverá aparecer alterada na lista

Funcionalidade: Possibilidade de Adicionar o Campo Data para Lista de Tarefas
●	Dado poder acessar a To-Do-List 	
●	 Quando o usuário selecionar a opção de selecionar data 
●	E então definir uma data 
●	Então a data definida deverá aparecer no topo da listagem de tarefas

Funcionalidade: Possibilidade de Adicionar o Campo Prazo para Lista de Tarefas
●	Dado poder acessar a To-Do-List 	
●	Quando o usuário selecionar a opção de selecionar prazo
●	E então definir uma data 
●	Então o prazo definido deverá aparecer no topo da listagem de tarefas

Funcionalidade: Possibilidade de priorizar tarefas
●	Dado uma To-Do-List com pelo duas tarefas
●	Quando o usuário selecionar a tarefa e marcar como prioridade
●	Então a tarefa selecionada deverá aparecer no topo da lista

REQUISITOS NÃO FUNCIONAIS:

IDE Escolhida: VisualStudio Code 
Java Escolhido: Java 11
Tipo de Aplicação: Console
