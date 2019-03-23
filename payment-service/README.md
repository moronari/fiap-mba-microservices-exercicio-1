# fiap-mba-microservices-exercicio-1

## Inicialização projeto

```sh
mvn sprint-boot:run
```

## Payments

#### Listar por id
```sh
curl -X GET \
  http://localhost:8080/payments/1 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 2d4256c0-5a4d-5ec3-569d-68e36e42fbf4' \
  -d '{}'
```
#### Inserir

```sh
curl -X POST \
  http://localhost:8080/payments/ \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 88ec268b-c178-8fcc-7165-c7ddd0eb25dc' \
  -d '
{
    "id": 15,
    "idTransaction": "1234",
    "cardNumber": "4024 0071 6276 2636",
    "expDate": "01/25",
    "valeuPay": "1244.85",
    "brand": "VISA"
    }
}'
```

#### Atualizar

```sh
curl -X PUT \
  http://localhost:8080/payments/45 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 8f427254-e923-f0de-7c03-97c0e7cedf44' \
  -d '{
    "id": 15,
    "idTransaction": "1234",
    "cardNumber": "4024 0071 6276 9999",
    "expDate": "01/25",
    "valeuPay": "1244.11",
    "brand": "VISA"
    }
}'
```
#### Remover

```sh
curl -X DELETE \
  http://localhost:8080/payments/1
  {}
```

