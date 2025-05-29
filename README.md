# API Test Suite with REST Assured and JUnit

This repository contains a set of automated API tests written in Java using the REST Assured library and JUnit framework. The tests target the public dummy API at [Reqres](https://reqres.in/).

## 📋 Prerequisites

Make sure the following tools and dependencies are set up in your environment:

- Java Development Kit (JDK) 8 or above
- Maven or Gradle for dependency management
- Internet connection (to access the Reqres API)


## 📂 Test Cases

The test cases are implemented in the `APITests.java` file.

### ✅ `test1`
- Sends a `GET` request to `/api/users?page=2`
- Prints the response
- Asserts that the status code is `200 OK`

### ✅ `test2`
- Sends a `GET` request to `/api/users?page=2` using fluent syntax
- Verifies status code `200 OK`

### 🔄 `updateData`
- Sends a `PUT` request to `/api/users/2` with a JSON body
- Updates user data (name and job)
- Expects `200 OK` and logs the response body

### ➕ `addData`
- Sends a `POST` request to `/api/users`
- Adds new user data (name and job)
- Expects `201 Created` and logs the response body

### ❌ `deleteData`
- Sends a `DELETE` request to `/api/users/2`
- Expects `204 No Content`
- Confirms the response body does not contain `"204"`

## 📄 Notes

- The API used is a mock API for testing and prototyping.
- No actual data is created or persisted on the server.
- The tests are suitable for learning or demonstrating API automation.

### Author
Malebo Phosa
