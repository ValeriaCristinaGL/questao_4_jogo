## 🎮 Jogo – Aplicando o Padrão Factory Method

📖 **Descrição**  
Projeto de exemplo para aplicar o padrão **Factory Method**.  
O sistema simula um jogo de ação com fases brasileiras. Cada fase possui inimigos específicos, e o jogador sempre enfrenta um inimigo ao entrar em uma localização.

---

🎯 **Objetivo**  
Refatorar o código para usar o padrão Factory Method.  
Permitir que cada localização produza seu próprio inimigo.  
Garantir que o jogador enfrente um inimigo em qualquer fase.  
Simular três fases: Amazônia, Sertão e Rio de Janeiro.

---

🧠 **Padrão Factory Method aplicado**  
- `Enemy` (interface) → define o método `attack()`.  
- Inimigos concretos: `MutantAnimal`, `Cangaceiro`, `Criminoso`.  
- `Location` (classe abstrata) → define `createEnemy()` e `enterLocation()`.  
- Localizações concretas: `AmazonLocation`, `SertaoLocation`, `RioLocation`.  
- `GameSimulator` → simula o jogo instanciando as localizações.

Esse padrão foi **crucial** porque:
- Permite que cada fase produza seu próprio inimigo sem alterar o código do jogador.  
- Garante flexibilidade para adicionar novas fases no futuro.  
- Mantém o código desacoplado e fácil de expandir.

---

🧠 **Lógica para resolver a questão**  
1. Criar interface `Enemy` com método `attack()`.  
2. Criar inimigos concretos com ataques distintos.  
3. Criar classe abstrata `Location` com método fábrica `createEnemy()`.  
4. Criar localizações concretas que retornam seus respectivos inimigos.  
5. No `GameSimulator`, instanciar as localizações e chamar `enterLocation()`.

---

🛠️ **Estrutura**

```
src/
├─ Enemy.java
├─ MutantAnimal.java
├─ Cangaceiro.java
├─ Criminoso.java
├─ Location.java
├─ AmazonLocation.java
├─ SertaoLocation.java
├─ RioLocation.java
├─ GameSimulator.java
PROMPTS.md
AJUSTES.md
```

---

▶️ **Execução**

**Compile:**
```bash
javac src/*.java
```

**Rode:**
```bash
java -cp src GameSimulator
```

**Saída Esperada:**
```
Player enters location...
Mutant animal attacks with claws!
Player enters location...
Cangaceiro attacks with rifle!
Player enters location...
Criminoso attacks with pistol!
```

---

📑 **Documentação da IA**  
- `PROMPTS.md` → prompts usados e respostas resumidas.  
- `AJUSTES.md` → ajustes feitos sobre as respostas da IA.

---

📌 **Histórico de commits**

- adicionar interface Enemy  
- implementar MutantAnimal, Cangaceiro e Criminoso  
- adicionar classe abstrata Location  
- implementar fábricas concretas para cada localização  
- adicionar GameSimulator com simulação  
- documentar prompts e ajustes da IA  
- adicionar README com explicações e instruções

---

👨‍💻 **Autores**  
Pedro Victor da Silva Pereira  
Valéria Cristina

---

Se quiser, posso gerar agora os arquivos `AJUSTES.md` para cada questão com os ajustes que você fez sobre as respostas da IA. Só me dizer!
