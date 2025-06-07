🏥 Health Plan Module
This module manages health insurance plans in your Health Insurance Management System.
It uses Spring Boot, REST API, MySQL, and JPA to perform the full set of CRUD operations.
1. Add a New Health Plan
🔗 Endpoint: POST /api/plans

📥 Request Payload (JSON):
🔄 Flow:
The request is sent to HealthPlanController.addPlan().

It delegates the task to HealthPlanService.addPlan().

The service calls HealthPlanRepository.save(plan) which is a JPA method.

The entity is persisted in the MySQL database.

The saved entity (with generated ID) is returned.

 2. Get All Health Plans
🔗 Endpoint: GET /api/plans

🔄 Flow:
Client sends a GET request.

Controller → Service → Repository → findAll() returns a List<HealthPlan>.

Spring Boot auto-converts the list to JSON using Jackson.

 3. Get a Health Plan by ID
🔗 Endpoint: GET /api/plans/{id}

🔄 Flow:
Controller receives the id from the path variable.

Service method: getPlanById(int id) calls repository.findById(id).

If not found, throw ResourceNotFoundException (custom exception).

If found, return the health plan object.

 4. Update an Existing Plan
🔗 Endpoint: PUT /api/plans/{id}

📥 Request Payload:
🔄 Flow:
Controller receives id and body.

Calls service.updatePlan(id, plan).

Service fetches the existing plan with getPlanById(id).

Updates individual fields, then saves using repository.save().

 5. Delete a Health Plan
🔗 Endpoint: DELETE /api/plans/{id}

🔄 Flow:
Controller receives the id.

Calls service.deletePlan(id).

Service checks if the plan exists.

If yes, repository.delete(healthPlan) is called.

If not, throws ResourceNotFoundException.



