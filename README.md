# Task Management API

This is a simple REST API for managing tasks, built with Spring Boot as part of the Lords Engineering College Bootcamp.

## Instructions to Run

1. Clone the repository.
2. Open the project in a Java IDE (like IntelliJ IDEA or VS Code).
3. Run the main application class `TaskManagerApplication.java`.
4. The application will start on `http://localhost:8080`.

## API Endpoints

The base URL is `/api/tasks`.

### Create a Task
- **Method:** `POST`
- **URL:** `/api/tasks`
- **Sample JSON Body:**
  ```json
  {
      "title": "My First Task",
      "description": "A description for the task.",
      "status": "TODO"
  }
  ```

### Get All Tasks
- **Method:** `GET`
- **URL:** `/api/tasks`

### Update a Task
- **Method:** `PUT`
- **URL:** `/api/tasks/{id}` (e.g., `/api/tasks/1`)
- **Sample JSON Body:**
  ```json
  {
      "title": "Updated Task Title",
      "description": "Updated description.",
      "status": "COMPLETED"
  }
  ```

### Delete a Task
- **Method:** `DELETE`
- **URL:** `/api/tasks/{id}` (e.g., `/api/tasks/1`)
