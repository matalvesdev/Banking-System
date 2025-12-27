# Banking System 🏦

Sistema bancário simples desenvolvido em Java que simula operações básicas de conta corrente, incluindo saques, depósitos, transferências e consulta de saldo.

## 📋 Sobre o Projeto

Banking System é uma aplicação Java console que demonstra conceitos fundamentais de Programação Orientada a Objetos através da simulação de operações bancárias.  O sistema permite criar contas correntes e realizar transações financeiras básicas com validações de saldo e valores.

## ✨ Funcionalidades

- 💰 **Criar Conta Corrente** - Cadastro com CPF, nome e saldo inicial
- 💸 **Sacar** - Retirada de valores com validação de saldo
- 💵 **Depositar** - Adicionar valores à conta
- 🔄 **Transferir** - Transferência entre contas correntes
- 📊 **Consultar Saldo** - Verificação do saldo atual
- ✅ **Validações** - Verificação de saldo suficiente e valores válidos

## 🛠️ Tecnologias Utilizadas

- **Java 21** - Linguagem de programação
- **Maven** - Gerenciador de dependências e build
- **JetBrains Annotations** - Anotações para melhoria de código
- **POO** - Programação Orientada a Objetos

## 🏗️ Estrutura do Projeto

```
Banking-System/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   ├── ContaCorrente.java
│                   └── Main.java
├── pom.xml
└── README. md
```

## 📦 Classe ContaCorrente

### Atributos

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| `cpf` | String | CPF do titular (11 dígitos) |
| `nome` | String | Nome do titular |
| `saldo` | double | Saldo atual da conta |

### Métodos

#### Construtor
```java
public ContaCorrente(String cpf, String nome, double saldo)
```
Cria uma nova conta corrente com CPF, nome e saldo inicial.

#### sacar(double valor)
```java
public void sacar(double valor)
```
Realiza saque se houver saldo suficiente. 

**Validações:**
- Verifica se o valor solicitado é menor ou igual ao saldo disponível

**Exemplo:**
```java
conta.sacar(200.0);  // Saque realizado com sucesso!
```

#### depositar(double valor)
```java
public void depositar(double valor)
```
Adiciona valor ao saldo da conta.

**Validações:**
- Verifica se o valor é maior que zero

**Exemplo:**
```java
conta.depositar(300.0);  // Depósito realizado com sucesso!
```

#### transferir(ContaCorrente contaDestino, double valor)
```java
public void transferir(ContaCorrente contaDestino, double valor)
```
Transfere valor para outra conta corrente.

**Validações:**
- Verifica se há saldo suficiente na conta de origem
- Debita da conta de origem
- Credita na conta de destino

**Exemplo:**
```java
contaOrigem.transferir(contaDestino, 150.0);
```

#### verSaldo()
```java
public double verSaldo()
```
Retorna o saldo atual da conta. 

**Exemplo:**
```java
double saldo = conta.verSaldo();
System.out.println("Saldo:  " + saldo);
```

## 🚀 Como Executar

### Pré-requisitos

- Java 21 ou superior
- Maven 3.6+

### Passo 1: Clone o repositório

```bash
git clone https://github.com/matalvesdev/Banking-System.git
cd Banking-System
```

### Passo 2: Compile o projeto

```bash
mvn clean compile
```

### Passo 3: Execute o programa

```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```

Ou compile e execute diretamente:

```bash
mvn clean package
java -cp target/SystemBank-1.0-SNAPSHOT.jar org.example. Main
```

## 💻 Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        // Criar contas
        ContaCorrente contaMateus = new ContaCorrente("12345678901", "Mateus", 1000.0);
        ContaCorrente contaFlor = new ContaCorrente("10987654321", "Flor", 500.0);

        // Operações bancárias
        contaMateus.sacar(200.0);           // Saque:  R$ 200,00
        contaMateus.depositar(300.0);       // Depósito: R$ 300,00
        contaMateus.transferir(contaFlor, 150.0);  // Transferência: R$ 150,00

        // Consultar saldos
        System.out.println("Saldo Mateus:  " + contaMateus.verSaldo());
        System.out.println("Saldo Flor: " + contaFlor.verSaldo());
    }
}
```

### Saída Esperada

```
Saque realizado com sucesso! Saldo atual: 800.0
Depósito realizado com sucesso! Saldo atual:  1100.0
Depósito realizado com sucesso!  Saldo atual: 650.0
Transferência realizada com sucesso! Saldo atual: 950.0
Saldo Mateus: 950.0
Saldo Flor: 650.0
```

## 🔧 Fluxo de Operações

### Exemplo Completo de Transações

```
Estado Inicial:
- Conta Mateus: R$ 1.000,00
- Conta Flor: R$ 500,00

Operação 1: Mateus saca R$ 200,00
- Conta Mateus: R$ 800,00
- Conta Flor: R$ 500,00

Operação 2: Mateus deposita R$ 300,00
- Conta Mateus: R$ 1.100,00
- Conta Flor: R$ 500,00

Operação 3: Mateus transfere R$ 150,00 para Flor
- Conta Mateus: R$ 950,00
- Conta Flor: R$ 650,00

Estado Final:
- Conta Mateus: R$ 950,00
- Conta Flor:  R$ 650,00
```

## 📝 Validações Implementadas

### Saque
- ✅ Valor deve ser menor ou igual ao saldo disponível
- ❌ Saque bloqueado se saldo insuficiente

### Depósito
- ✅ Valor deve ser maior que zero
- ❌ Depósito bloqueado se valor inválido

### Transferência
- ✅ Valor deve ser menor ou igual ao saldo da conta de origem
- ✅ Débito na conta de origem
- ✅ Crédito automático na conta de destino
- ❌ Transferência bloqueada se saldo insuficiente

## 🎯 Conceitos de POO Aplicados

### Encapsulamento
- Atributos privados (`cpf`, `nome`, `saldo`)
- Acesso controlado através de métodos públicos

### Abstração
- Interface simples para operações bancárias
- Complexidade interna oculta do usuário

### Reutilização
- Método `depositar()` reutilizado dentro de `transferir()`

## 📊 Diagrama de Classes

```
┌─────────────────────────┐
│   ContaCorrente         │
├─────────────────────────┤
│ - cpf: String           │
│ - nome: String          │
│ - saldo: double         │
├─────────────────────────┤
│ + ContaCorrente(...)    │
│ + sacar(valor)          │
│ + depositar(valor)      │
│ + transferir(conta, val)│
│ + verSaldo(): double    │
└─────────────────────────┘
```

## 🔮 Possíveis Melhorias Futuras

- [ ] Adicionar número de conta único
- [ ] Implementar diferentes tipos de conta (Poupança, Investimento)
- [ ] Sistema de autenticação com senha
- [ ] Histórico de transações
- [ ] Taxas e tarifas bancárias
- [ ] Limite de saque e transferência
- [ ] Persistência de dados (banco de dados)
- [ ] Interface gráfica (JavaFX ou Swing)
- [ ] Geração de extratos
- [ ] Validação de CPF
- [ ] Implementar padrão de exceções customizadas

## 🧪 Testes

```bash
mvn test
```

## 👨‍💻 Autor

Desenvolvido por [matalvesdev](https://github.com/matalvesdev)

## 📄 Licença

Este projeto está sob a licença MIT.  Veja o arquivo LICENSE para mais detalhes.

---

💰 *"Sua primeira simulação bancária em Java!"* 💰

⭐ Se este projeto foi útil para você, considere dar uma estrela! 
