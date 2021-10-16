# API para ser consumida pelo projeto thisevent-web

## Links relevantes

[thisevent-fiap-web](https://github.com/OscarSilvaOfficial/thisevent-fiap-web.git)

## Rodar o projeto

### Infra do projeto:
  * Para rodar é necessário estar rodando o mysql
  * Porta 3306,
  * Usuário root
  * Senha 123456
  * Caso queira trocar, basta alterar as configurações no [application.properties](./bin/main/application.properties)

### Ferramentas usuadas:

Para facilitar o start eu adicionei o arquivo mysql.yml,
para iniciar o mysql via docker-compose.

Comandos:
``` shell
docker-compose -f mysql.yml up
```
caso o container não suba execute o comando
``` shell
docker start mysql-local
```
