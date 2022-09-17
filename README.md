# Student-REST-API

## API endpoints

### GET Mapping

`GET /getAll`
http://localhost:8090/api/student/getAll

`GET /getByFirstName/{firstName}`
http://localhost:8090/api/student/getByFirstName/nikhil

`GET /getByFirstNameAndLastName/{firstName}/{lastName}`
http://localhost:8090/api/student/getByFirstNameAndLastName/nikhil/kumar

`GET /getByFirstNameOrLastName/{firstName}/{lastName}`
http://localhost:8090/api/student/getByFirstNameOrLastName/nikhil/kumar

`GET /getByFirstNameIn`
http://localhost:8090/api/student/getByFirstNameIn

`GET /getAllWithPagination`
http://localhost:8090/api/student/getAllWithPagination/?pageNo=1&pageSize=2

`GET /getAllWithSorting`
http://localhost:8090/api/student/getAllWithSorting

`GET /like/{firstName}`
http://localhost:8090/api/student/like/hi

`GET /startsWith/{firstName}`
http://localhost:8090/api/student/startsWith/nik

`GET /getByCity/{city}`
http://localhost:8090/api/student/getByCity/Delhi


### POST Mapping

`POST /create`
http://localhost:8090/api/student/create


### PUT Mapping

`PUT /update`
http://localhost:8090/api/student/update

`PUT /updateFirstName/{id}/{firstName}`
http://localhost:8090/api/student/updateFirstName/1/Nik


### DELETE Mapping

`DELETE /delete/{id}`
http://localhost:8090/api/student/delete/1

`DELETE /deleteByFirstName/{firstName}`
http://localhost:8090/api/student/deleteByFirstName/nikhil


