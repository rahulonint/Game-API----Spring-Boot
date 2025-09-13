# 🎮 Game API -- Spring Boot

A simple **Spring Boot REST API** that manages a list of popular games.\
Supports **CRUD operations** with in-memory storage, and demonstrates
`@RestController`, `@PathVariable`, `@RequestBody`, and CORS setup for
frontend integration.

------------------------------------------------------------------------

## 🚀 Features

-   ✅ Get all games\
-   ✅ Get a game by name\
-   ✅ Add a new game (POST)\
-   ✅ Update a game (PUT -- full update, PATCH -- partial update)\
-   ✅ Delete a game\
-   ✅ CORS configuration for React/Angular frontend

------------------------------------------------------------------------

## 🛠️ Tech Stack

-   Java 17+\
-   Spring Boot 3.x\
-   Maven\
-   REST APIs\
-   In-Memory Repository (`ArrayList`)

------------------------------------------------------------------------

## 📂 API Endpoints

### Get all games

    GET /gamelist

### Get a game by name

    GET /game/{gameName}

### Add a new game

    POST /game
    Body:
    {
      "id": 11,
      "name": "Counter Strike 2",
      "description": "A tactical FPS with updated Source 2 engine."
    }

### Update a game (PUT)

    PUT /game/{gameName}
    Body: { "id": 5, "name": "FIFA 24", "description": "Latest FIFA football simulator" }

### Partial update (PATCH)

    PATCH /game/{gameName}
    Body: { "description": "Updated game description" }

### Delete a game

    DELETE /game/{gameName}

------------------------------------------------------------------------

## 🌐 CORS Support

-   Configured for `http://localhost:3000` (React frontend).\
-   Can be updated in `SecurityConfig.java` or using `@CrossOrigin`.

------------------------------------------------------------------------

## 📖 Next Steps

-   Integrate with a **real database (MySQL/PostgreSQL)**\
-   Add **Spring Data JPA**\
-   Implement **JWT Authentication & Authorization**
