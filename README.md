Use postman api to test the application as follows:
1. Create:
   <br> Use POST to update the database with the new user details. Pass your data as raw JSON data in body of the request.  <br>
   <img width="636" alt="image" src="https://github.com/pratikshakh01/UserDetails/assets/55578997/7fb6dbf7-a57b-46fb-9a86-27163fce82ee"><br>
2. Get User By Id:<br> Use GET to recieve data from the database of the user whose id is passed in the url of the request as shown. All the user's details will be shown in the response in JSON format.
   <br>
   <img width="640" alt="image" src="https://github.com/pratikshakh01/UserDetails/assets/55578997/4bd4f63a-166e-4b64-91cc-b04e4e1a74b1"><br>
3. Get all user details: :<br> Use GET to recieve data from the database of the all the users. The details will be shown in the response in JSON format.
   <br>
   <img width="641" alt="image" src="https://github.com/pratikshakh01/UserDetails/assets/55578997/7dd8dc67-de2a-4aca-b85b-6edf4f60ce5b"><br>
4. Update a particular user's details: <br> Use PUT method to update the particular user details by passing data as raw JSON data in body of the request. <br>
   <img width="675" alt="image" src="https://github.com/pratikshakh01/UserDetails/assets/55578997/b84c60e4-7164-4d1b-8cf7-46bd93ef403d"><br>
5. Deleting a particular user: <br> Use DELETE method to delete a particular user whose ID is passed with url in request.
   <br>
   <img width="636" alt="image" src="https://github.com/pratikshakh01/UserDetails/assets/55578997/ff97b103-14ed-401b-9246-f24c07e04187"><br>
6. Deleting all the users: <br> Use DELETE method to delete all the users and their details present in the database.
   <br>
   <img width="639" alt="image" src="https://github.com/pratikshakh01/UserDetails/assets/55578997/287d5f55-2b82-4300-b282-7cf82dbbf1c4"><br>

You can change the database connection details in application.yaml file.
