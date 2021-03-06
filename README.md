# ResolveAE<br>

Repositório referente ao trabalho integrado desenvolvido no quinto periodo de sistema de informação no IFES Serra. Disciplinas envolvidas Programação Orientada a Objetos 2, Banco de Dados 2, Projeto de Sistemas, Engenharia de Software.

Repositório voltado p/ Banco de Dados 2: [ResolveAE_BD2](https://github.com/duraes-antonio/resolveae_bd2)<br>

# Sumário<br>

### 1. COMPONENTES<br>
Integrantes do grupo<br>
Antônio Carlos D.:  [duraes-antonio](https://github.com/duraes-antonio)<br>
Elimar Macena:      [elimarmacena](https://github.com/elimarmacena)<br>

### 2.DIARIO DE BORDO DO TRABALHO <br>
<a href="https://docs.google.com/document/d/1IdetJXo8JxywMN9Et_-meReJdg83JbfsaWmf0YkEg0g/edit?usp=sharing">Diário de bordo</a>

### 3.PMC(Project Model Canvas) <br>
<a href="https://docs.google.com/spreadsheets/d/1B-QtfgM4DjDoLwGBw3BMwjk412ga9ftL_5a3BK7fzBo/edit?usp=sharing">PMC</a>


### 4.INFORMACOES REFERENTE AO SISTEMA<br>

#### 4.1 Motivação<br>

<p align="justify">
    Tão cansativa quanto ouvir um "meu sobrinho faz de graça" ou "o seu Zé Marosvaldo faz pela metade do preço", é a atividade de buscar por pessoas qualificadas e/ou com experiência na área.<br><br>
    Desta forma, a presença de uma plataforma que disponibilize informações sobre a formação e experiência do profissional e detalhes sobre o serviço prestado por ele, não só pode oferecer uma diversidade de especialistas e fomentar a competividade mas também a oferta de emprego e valorização do mercado de TI no Brasil.<br><br>
    Entregar ao profissional de TI um histórico para controle e realização de estimativas com base nos serviços já prestados, uma descrição mais elaborada do potencial que ele pode oferecer ao cliente e o mais importante, a possibilidade de oferecer seus serviços e usar como atrativo sua experiência e qualificação, são itens que, embora pareçam superficiais, são oportunidades que o profissional têm para se destacar em uma área que está cada vez mais difundida no cenário brasileiro<a href=https://g1.globo.com/economia/tecnologia/noticia/tecnologia-no-brasil-volta-crescer-em-2017-e-mantem-pais-entre-os-10-maiores-mercados-do-mundo.ghtml>[1]</a>.
</p><br>

#### 4.2 Mini-Mundo<br>

<p align="justify">
Para facilitar a busca dos profissionais de TI por pessoas físicas, seria interessante ter um sistema que dispõe informações sobre a formação da pessoa prestadora de serviço, como cursos feitos e experiência em trabalhos passados; informações pessoais como nome, endereço (bairro, cidade, estado), além de meios de contato como telefone (fixo ou móvel) e redes sociais (Facebook, Instagram, LinkedIn, …).<br>
    
É bastante importante ter informações sobre o quadro de horários do profissional, pois sabendo qual dia da semana e intervalo de horário estará livre, é possível encontrar um horário que não prejudique ou tenha impacto reduzido sob a rotina do cliente.<br>

O profissional, pessoa que presta um serviço, é peça central no sistema, ele deve ser responsável por descrever o serviço oferecido, para isso, deve informar um título que resuma sua atividade, uma descrição mais alongada, uma faixa de valor que está disposto a receber, a área (Manutenção, Desenvolvimento, Design, Infraestrutura, etc) que melhor descreve o tipo de serviço, e uma sub-área (Desenvolvimento mobile, formatação de computadores, etc).<br>

A fim de assegurar a contratação do serviço, seria ideal um campo para inserir um texto que representa uma espécie de contrato ou termo de compromisso, onde haveria a descrição do acordo, a data em que foi elaborado, a data da última modificação, quando o serviço se iniciará e a previsão de seu término. O conteúdo do contrato deve estar livre para ser um acordo direto entre o contratado e contratante do serviço.<br>

O feedback do cliente também deve ter seu espaço, portanto, deseja-se poder avaliar com uma nota (de 1 a 5) e comentários, os serviços contratados após a conclusão de sua prestação. Futuramente, para recompensar bons profissionais e exibir suas qualidades para os potenciais clientes seria bem-vindo premiações como medalhas virtuais por número de trabalhos atendidos, anos de experiência no sistema, bom atendimento, entre outras.
</p><br>

#### 4.3 Protótipo de Telas(Mockups) <br>
[PROTÓTIPO PDF](https://github.com/duraes-antonio/ResolveAE/blob/master/Documentacao/Mockups/resolveAE.pdf)<br><br>
[ARQUIVO BRUTO](https://github.com/duraes-antonio/ResolveAE/blob/master/Documentacao/Mockups/resolveAE.bmpr)<br>

### 5 MODELAGEM DO SISTEMA<br>

#### 5.0 Nomenclatura e Convenções<br>

* Para modelos entidade-relacionamento(ER) e operações com banco de dados convecinou-se seguir o formato dos exemplos do site do PostgreSQL[2].<br>
* Para modelar os diagramas de caso de uso, de classes, e codificação, optou-se por seguir a tática CamelCase.<br>

#### 5.1 Diagrama de Classes<br>

<p align="center"><img src="https://github.com/duraes-antonio/ResolveAE/blob/master/Documentacao/Diagramas/Imagens/diag_classe.svg"></p><br>

#### 5.2 Modelo Conceitual - Entidade-Relacionamento<br>

<p align="center">
    <img src="https://github.com/duraes-antonio/ResolveAE/blob/master/Documentacao/Diagramas/Imagens/modelo_er_conceitual.png"></p><br>
    <a href="https://github.com/duraes-antonio/ResolveAE/blob/master/Documentacao/Diagramas/Arquivos/modelo_er_conceitual.brM3">Download brmodelo(.brM3)</a><br>

#### 5.3 Modelo Logico - Entidade-Relacionamento<br>

<p align="center">
    <img src="https://github.com/duraes-antonio/ResolveAE/blob/master/Documentacao/Diagramas/Imagens/modelo_er_logico.png"></p><br>
    <a href="https://github.com/duraes-antonio/ResolveAE/blob/master/Documentacao/Diagramas/Arquivos/modelo_er_logico.brM3">Download brmodelo(.brM3)</a><br>

### 5.4 Padrões de Projeto Aplicados<br>
Exibição e explicação dos padrões de projeto utilizados podem ser acessados clicando [aqui](https://docs.google.com/presentation/d/1krAiRMQfGEQmZai_m4LEOqmLGbQGTpEczI7saDPJr1Q/edit?usp=sharing).<br>

### REFERÊNCIAS
[1]. G1. "Tecnologia no Brasil volta crescer em 2017 e mantém país entre os 10 maiores mercados do mundo". Acesso em 16/09/2018. Disponível em: https://g1.globo.com/economia/tecnologia/noticia/tecnologia-no-brasil-volta-crescer-em-2017-e-mantem-pais-entre-os-10-maiores-mercados-do-mundo.ghtml<br>
[2]. PostgreSQL. "CREATE TABLE". Acesso em 05/10/2018. Disponível em: https://www.postgresql.org/docs/9.1/static/sql-createtable.html

