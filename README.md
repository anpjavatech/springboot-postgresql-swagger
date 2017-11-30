Application consist of :: 
SpringBoot, 
Postgres, 
Liquibase

API definition : To save Person details in Postgres DB.

Method : POST,
Path : /save,
RequestBody : 
{ "person_id":1, "first_name":"XXX", "last_name":"XXX", "gender":"YY", "age":88, "martial_status":"YYY", "email":"YYYYYYYY.com", "mobile_number":"HHHHH", "address_line_1":"JJJJJ", "address_line_2":"IIIII", "state":"NNNNN", "postal_code":8888 },

ResponseBody : 
{ "person_id": 1, "first_name": "XXX", "last_name": "XXX", "gender": "YY", "age": 88, "martial_status": "YYY", "email": "YYYYYYYY.com", "mobile_number": "HHHHH", "personAddress": { "address_line_1": "JJJJJ", "address_line_2": "IIIII", "state": "NNNNN", "postal_code": 8888 } }
