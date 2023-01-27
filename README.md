# person-api
## Avaliação Desenvolvedor(a) Back-end => Desafio Java
<br>
  
### O projeto
Desenvolver uma API REST utilizando Java e Spring Boot, ao qual deve permitir a gestão da entidade Pessoa (_Person_) e realizar a Criação, Edição, Consulta e Listagem de Pessoas.  
  
Utilizando conceitos de modelagem de dados foram implementadas duas novas entidades: Endereço (_Address_) e EndereçoPessoa (_PersonAddress_), sendo esta última uma entidade associativa ao qual conecta Pessoa e Endereço. Desta forma a tabela associativa poderá registrar um ou mais endereços de uma mesma pessoa, bem como informar se aquele registro de endereço é o principal da pessoa por meio do campo "mainAddress".  
  
Abaixo está o Diagrama de Classes ilustrando o relacionamento das entidades e seus campos:  
![Diagrama de Classes]()
  
### Deploy e endpoints
Foi utilizada a plataforma Railway.app para a realização do deploy da API de modo que os endpoints abaixo podem ser consultados diretamente pelo navegador.

- **GetAll Person**
    - person-api-production-ad0f.up.railway.app/person
- **GetAll Address**
    - person-api-production-ad0f.up.railway.app/address
- **GetAll PersonAddress**
    - person-api-production-ad0f.up.railway.app/personaddress
- **GetById Person**
    - person-api-production-ad0f.up.railway.app/person/{id}
- **GetById Address**
    - person-api-production-ad0f.up.railway.app/address/{id}
- **GetById PersonAddress**
    - person-api-production-ad0f.up.railway.app/personaddress/{id}


### Tecnologias utilizadas
- Java 17
- Spring Boot 3.0.2
- H2 Database
- Intellij IDEA
- Postman (ferramenta para testes de APIs)
- Railway.app (plataforma de infraestrutura em nuvem)
  
<br>
  
## Questionário Qualidade de código
  
<br>
  
P: Durante a implementação de uma nova funcionalidade de software solicitada, quais critérios você avalia e implementa para garantia de qualidade de software?  

R: Com base em um diagrama de fluxo do software eu avaliaria os pontos de conexão da nova funcionalidade, mapeando as interações que a mesma fará no software de modo a garantir que o código existente continuará a funcionar corretamente, além disso, conforme o desenvolvimento da funcionalidade, eu realizaria testes unitários e de integração, para que assim seja possível detectar quaisquer impactos e minimizar riscos ou retrabalho.
  
  
P: Em qual etapa da implementação você considera a qualidade de software?  
R: Considero que todas as etapas são importantes quando o objetivo é um software de boa qualidade, ou seja, ela deve ser refletida de ponta a ponta, na ponta que dá início temos a abstração do software que só existe para solucionar um problema, dessa forma, é importante refletir sobre qual será o desenho do projeto, seus requisitos (funcionais e não funcionais), seus componentes, suas implicações e as tecnologias mais recomendáveis antes de prosseguir para a fase de desenvolvimento, nesta é importante refletir sobre os padrões e diretrizes da linguagem de programação escolhida, sobre a estrutura de pastas, sobre as entidades, métodos e relacionamento, bem como preocupar-se em escrever um código coeso, bem escrito, que realiza aquilo que se propõem a fazer e que seja testável e fácil de dar manutenção, após isso temos a última etapa, porém, na minha visão softwares atuais não possuem um fim, pois existe o conceito de melhoria contínua, dessa forma, é importante refletir sobre a experiência do usuário, escalabilidade, disponibilidade e segurança do software.