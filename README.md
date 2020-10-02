# Event Management

API REST para gestão de eventos.

## Tecnologias utilizadas

- Spring Boot
- MySQL
- Java 8+

## Rotas Disponíveis

```
POST /events                        -     Realiza a criação de um evento

POST /users                         -     Realiza a criação de um usuário

POST /subscriptions                 -     Realiza a operação de inscrição de um usuário em um evento

DELETE /subscriptions/{id}          -     Realiza o cancelamento de uma inscrição de um usuário em um evento

GET /users/{id}/subscriptions       -     Lista as inscrições de um usuário

GET /events/{id}/subscriptions      -     Lista os inscritos de um evento

POST /subscriptions/{id}/confirm    -     Realiza entrada do usuário no evento.
```

## Para instalar e executar

No arquivo que se encontra em 'src/main/resources/application.properties', é preciso configurar, de acordo com a máquina local, os respectivos campos:

- **spring.datasource.url**: url do Banco de Dados local
- **spring.datasource.username**: nome de usuário de acesso ao Banco de dados local
- **spring.datasource.password**: senha de acesso ao Banco de dados local

Agora basta apenas executar o arquivo 'src/main/java/com/challenge/eventmanagement/EventmanagementApplication.java', que é a função principal do sistema.
