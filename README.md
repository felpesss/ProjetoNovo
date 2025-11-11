Relatório do Projeto – Sistema de Gerenciamento de Tarefas em Java
Introdução

Este projeto tem como objetivo desenvolver um sistema simples de gerenciamento de tarefas utilizando a linguagem Java.
O sistema permite adicionar, listar e remover tarefas, aplicando princípios da Programação Orientada a Objetos (POO) e os padrões GRASP (Controller e Creator).

O projeto busca reforçar conceitos fundamentais da POO, como encapsulamento, classes e responsabilidades bem definidas, além de demonstrar boas práticas de design orientado a objetos.

Objetivos
2.1 Objetivo Geral

Desenvolver um sistema básico de gerenciamento de tarefas aplicando os padrões GRASP para promover baixo acoplamento e alta coesão.

2.2 Objetivos Específicos

Criar classes que representem tarefas e a lista de tarefas.

Implementar métodos para adicionar, listar e remover tarefas.

Aplicar os padrões Controller e Creator de forma prática.

Demonstrar a separação de responsabilidades entre as classes.

Justificativa

A escolha deste projeto se deve à sua simplicidade e aplicabilidade prática.
Um sistema de tarefas é uma ótima forma de compreender como dividir responsabilidades entre classes e aplicar os princípios GRASP, fundamentais para o desenvolvimento de sistemas bem estruturados.

Metodologia

O sistema foi desenvolvido em Java, com a divisão das classes em pacotes para organização e clareza do código:

model – Contém a classe Task, que representa uma tarefa.

controller – Contém a classe TaskController, responsável por gerenciar as ações do sistema.

persistence – Responsável por armazenar e recuperar tarefas (simulando um repositório).

view – Interface simples de execução do sistema.

Durante o desenvolvimento, os padrões GRASP foram aplicados da seguinte forma:

Controller: aplicado na classe TaskController, que centraliza o controle das ações do sistema.

Creator: aplicado na classe TaskList, responsável por criar e gerenciar objetos do tipo Task.

Funcionamento do Sistema

O usuário pode:

Adicionar novas tarefas.

Visualizar todas as tarefas cadastradas.

Remover tarefas específicas.

Resultados Obtidos

O sistema executou todas as operações corretamente, demonstrando a aplicação dos princípios GRASP.
O uso do Controller centralizou o fluxo do programa, enquanto o Creator garantiu que a criação das tarefas fosse realizada por uma classe responsável, mantendo o código coeso e de fácil manutenção.

Conclusão

O projeto permitiu consolidar o entendimento dos padrões GRASP, especialmente Controller e Creator, mostrando na prática como eles contribuem para a clareza e organização do código.
Além disso, reforçou o aprendizado de Programação Orientada a Objetos e o valor de uma boa divisão de responsabilidades entre classes.
