# 🚀 Bootcamp Java - Modelagem Orientada a Objetos

Projeto desenvolvido para praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java, simulando a estrutura de um Bootcamp com cursos, mentorias e desenvolvedores.

## 📚 Objetivo

Aplicar na prática conceitos como:

- Abstração
- Encapsulamento
- Herança
- Polimorfismo
- Collections em Java
- Modelagem de domínio

---

## 🧩 Estrutura do Projeto

O sistema é composto pelas seguintes entidades principais:

### 📦 Domínio

- **Bootcamp**
    - Nome, descrição
    - Lista de conteúdos (cursos e mentorias)

- **Curso**
    - Título
    - Descrição
    - Carga horária

- **Mentoria**
    - Título
    - Descrição
    - Data

- **Dev**
    - Nome
    - Conteúdos inscritos
    - Conteúdos concluídos
    - Cálculo de XP

---

## ⚙️ Funcionalidades

✔️ Inscrição de desenvolvedor em um bootcamp  
✔️ Progresso nos conteúdos (cursos e mentorias)  
✔️ Controle de conteúdos inscritos e concluídos  
✔️ Cálculo de experiência (XP) acumulada

---

## 🧪 Exemplo de Execução

A classe `Main` simula o fluxo completo:

```java
Curso curso1 = new Curso();
curso1.setTitulo("curso java");
curso1.setDescricao("descrição curso java");
curso1.setCargaHoraria(8);

Curso curso2 = new Curso();
curso2.setTitulo("curso js");
curso2.setDescricao("descrição curso js");
curso2.setCargaHoraria(4);

Mentoria mentoria = new Mentoria();
mentoria.setTitulo("mentoria de java");
mentoria.setDescricao("descrição mentoria java");
mentoria.setData(LocalDate.now());

Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("Descrição Bootcamp Java Developer");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);

Dev devCamila = new Dev();
devCamila.setNome("Camila");

devCamila.inscreverBootcamp(bootcamp);
devCamila.progredir();
devCamila.progredir();
```

---

## 📈 Saída Esperada
```java
Conteúdos Inscritos Camila: [...]
Conteúdos Concluídos Camila: [...]
XP: ...
```
---
## 🛠️ Tecnologias Utilizadas
- Java 8+
- API de Datas (java.time.LocalDate)
- Collections (Set, List)
---
## 🧠 Conceitos Aplicados

Este projeto reforça:

- Modelagem de domínio baseada em objetos
- Separação de responsabilidades
- Uso de coleções para controle de estado
- Regras de negócio encapsuladas nas entidades

---
#### 🚀 Possíveis Melhorias
* Criar API REST com Spring Boot
- Persistência com banco de dados (JPA / Hibernate)
- Testes unitários (JUnit)
- Interface gráfica ou integração com frontend
- Sistema de níveis baseado em XP

---
### 👨‍💻 Autor

**Maurício Rempel Carmignan**

_Desenvolvedor Backend Java_

<a href="https://www.linkedin.com/in/mauricio-rempel-back-end/"> 
<img src="https://jsdelivr.net" width="30" height="30" alt="LinkedIn" />
</a>
