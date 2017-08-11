# API-CodeChallenge : Implementation of Hello World REST API

- Clone the folder to a local machine
- Open the project in eclipse
- Build the project
- Access the URL : https://localhost:8080/Hello

SWAGGER DOCUMENTATION OF THE API

Upload the YAML text to http://editor.swagger.io/

swagger: '2.0'
info:
  title: 'HelloWorld'
  license:
    name: 'Hello World API'
  description: >-
    Implementation of REST API for code challenge
  version: '1'
host: 'localhost:8080'
schemes:
  - https
paths:
  '/hello':
    get:
      operationId: Print Hello message
      tags:
        - CodeChallenge
      produces:
        - application/json
      responses:
        '200':
          description: OK
          examples:
            application/json: |
              {
              'Message':'hello world'
              }
