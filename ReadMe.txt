The task was developed by using Spring Boot framework.


Dependency:
  1.Spring Tool Suite (STS)
  2.postman (optional) or hit the below request in the browser 
  3. Used Inmemory database 
     url: http://localhost:8080/h2
     default user : sa
     default password (blank) :
     jdbcURL : jdbc:h2:mem:agilisium

  4. Githug url : https://github.com/imganapathy/SampleProject
  5. Clone or download the project.


Request and Response for two end points with different credentials

http://localhost:8080/config/api/getConfigdetails

[{"configId":1,"osDetail":"Linux","productId":1},{"configId":2,"osDetail":"Windows","productId":2},{"configId":3,"osDetail":"IOS","productId":3},{"configId":4,"osDetail":"Android","productId":3}]

Credentail :  
 User: user2
 password: pass2


http://localhost:8080/product/api/getproductdetails

[{"productId":1,"productName":"Laptop"},{"productId":2,"productName":"Desktop"},{"productId":3,"productName":"Mobile"}]

Credentail :  
 User: user1
 password: pass1