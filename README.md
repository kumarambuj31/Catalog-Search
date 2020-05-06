# Catalog-Search

Create product catalog and search. H2 in memory database is used to store the details.

1) Create Product

curl -X POST \
  http://localhost:8080/product \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 12c22090-f5d0-61cb-726f-a89ff5fec0b2' \
  -d '{"productId":"d3550427-403a-43f5-90e2-d6696fb40836","name":"TROUSER PANT","colour":"BLUE","size":"LARGE","brand":"ABC","price":{"productId":"d3550427-403a-43f5-90e2-d6696fb40836","currency":"INR","value":4599.0}}'
  
  
 2) Create Seller
 
  curl -X POST \
  http://localhost:8080/seller \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 17f976b3-c01b-734e-df02-8f0dd900c6a0' \
  -d '{"sellerId":"d3550427-403a-43f5-90e2-d6696fb40839","sellerName":"TROUSER PANT SELLER","rating":"3","addresss":"ADD ADD","pincode":"560049"}'
  
 3) Create Stock
 
  curl -X POST \
  http://localhost:8080/stock \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 83f45633-4245-9773-ee77-70b793191df6' \
  -d '{"id":"1",
	"sellerId":"d3550427-403a-43f5-90e2-d6696fb40839","productId":"d3550427-403a-43f5-90e2-d6696fb40836",
"totalQty":"5","soldQty":"3"}'

4) Fetch the all product and their availability
curl -X GET \
  http://localhost:8080/products \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 9852f73a-ba32-aa97-96d1-3d3c3abc5601'
  
  
  Response:
  [
    {
        "productId": "d3550427-403a-43f5-90e2-d6696fb40836",
        "name": "TROUSER PANT",
        "colour": "BLUE",
        "size": "LARGE",
        "brand": "ABC",
        "price": {
            "productId": "d3550427-403a-43f5-90e2-d6696fb40836",
            "currency": "INR",
            "value": 4599
        },
        "available": 2
    }
]
