# jwt-token_unit-test
Spring Security using JWT Token and Unit Test


----------------------------> NOTE <----------------------------

- git clone https://github.com/elvistj10/jwt-token_unit-test

- open cmd and cd to unit-test directory

- running using maven spring boot command 'mvn spring-boot:run'

- testing using postman

- Login authorization : (token validity = 5 minutes)

	method POST : http://localhost:9091/authenticate
	using body raw application/json :
	{
		"username" : "elvis",
		"password" : "password"
	}

- Insert new Data :

	method POST : http://localhost:9091/siswa/add
	headers : Authorization : Bearer tokenValue
	using body raw application/json : 

	[
		{
			"nama" : "Zamrun",
			"alamat" : "Makasar"
		},
		{
			"nama" : "Andi",
			"alamat" : "Bogor"
		}
	]

- Get All data : 

	method GET : http://localhost:9091/siswa/list
	headers : Authorization : Bearer tokenValue

- Get One data : 

	method GET : http://localhost:9091/siswa/1
	headers : Authorization : Bearer tokenValue

- Update data : 

	method PUT : http://localhost:9091/siswa/update/1
	headers : Authorization : Bearer tokenValue
	using body raw application/json : 

	{
		"nama" : "Elvis Tanaem",
		"alamat" : "Kupang"
	}

- Delete data : 

	method DELETE : http://localhost:9091/siswa/delete/1
	headers : Authorization : Bearer tokenValue
	
