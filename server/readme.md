# API Resources

###### /api/v1/

  - [GET /pizza](#get-pizza)
  - [GET /pizza/[id]](#get-pizzaid)
  - [GET /sets]()
  - [GET /news]()
  - [POST /order](#post-order)
  
### GET /pizza

URL Example: https://bitbucket.org/pala_to_pala/pizzaapp/src/master/client/src/assets/pizza.json

    [ 
       { 
          "type":"pizza",
          "id":0,
          "name":"Margherita",
          "size":30,
          "price":3100,
          "img":"/files/0.png"
       },
       { 
          "type":"pizza",
          "id":1,
          "name":"Pizza Salami",
          "size":25,
          "price":2650,
          "img":"/files/1.png"
       }
    ]
    
### POST /order
  Request header lang="ts"
      
      let headers = { "Content-Type": "application/json;charset=utf-8" };
  Request body:
  
    {  
        "productIds": [ 1,5,8 ] 
    }
    
  Response body:
    
    {
        "products": [
            {
                "type": "pizza",
                "id": 1,
                "name": "Pizza Salami",
                "size": 25,
                "price": 2600,
                "img": "/files/1.png",
                "desc": "Salami, cebula, sos pomidorowy"
            },
            {
                "type": "pizza",
                "id": 5,
                "name": "Neapolitana",
                "size": 30,
                "price": 2800,
                "img": "/files/5.png",
                "desc": "Sos pomidorowy, ser, salami, oliwki zielone, papryczki jalapenos, oregano"
            },
            {
                "type": "pizza",
                "id": 8,
                "name": "Prosciutto e rucola",
                "size": 25,
                "price": 2800,
                "img": "/files/8.png",
                "desc": "Sos pomidorowy, szynka, ser, pomidory koktajlowe, rukola, mozzarella"
            },
            {
                "type": "drink",
                "id": 10,
                "name": "Pepsi",
                "size": 330,
                "price": 500,
                "img": "/files/10.png",
                "desc": "Oryginalna, lime, cherry, max, light"
            }
        ],
        "totalPrice": 8200,
        "pdfPath": "/files/PARAGON.pdf"
    }
## Request & Response Examples [WhiteHouse](https://github.com/WhiteHouse/api-standards)

