# GraphQL Application

A simple Spring Boot application demonstrating a GraphQL API for managing books and authors.

## Overview
This project showcases a minimal GraphQL setup with Spring Boot, using only two dependencies: Spring Web and Spring GraphQL. It includes:
- **Entities**: `Book` (id, name, pageCount, authorId) and `Author` (id, name).
- **Queries**: Fetch all books or a single book by ID, with nested author details.
- **GraphiQL**: Interactive UI for testing queries.

## Getting Started
1. **Prerequisites**: Java 17+, Maven.
2. **Clone the repo**: `git clone https://github.com/awaiswaheed321/GraphQLApplication.git`
3. **Run the app**: Open in your IDE and run `GraphQLApplication.java`.
4. **Test it**: Visit `http://localhost:8080/graphiql` and try this query:
   ```graphql
   {
     books {
       name
       author {
         name
       }
     }
   }

## Features
- Pre-populated data with 4 books and authors.
- GraphQL schema with `Query`, `Book`, and `Author` types.
- Unit test for the `books` query.

## Dependencies
- Spring Boot Starter Web
- Spring Boot Starter GraphQL

## Learn More
Check out the [Medium article](https://medium.com/@awaiswaheed321/exploring-graphql-with-a-simple-spring-boot-application-cc883bcec932) for a detailed walkthrough.
