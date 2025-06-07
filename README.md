🏥 Health Plan Module – Feature Flow
This module handles complete CRUD operations for health insurance plans in the system using Spring Boot and REST APIs.

1️⃣ Add a New Health Plan
Endpoint: POST /api/plans
Flow:

1. Client sends a JSON request containing plan details.

2. Controller receives the request and delegates to the service.

3. Service passes the data to the repository.

4. Repository saves the plan to the database.

5. The system returns the saved plan with a generated ID.

2️⃣ Get All Health Plans
Endpoint: GET /api/plans
Flow:

1. Client sends a GET request.

2. Controller calls the service.

3. Service fetches all plans via the repository.

4.The list of all health plans is returned as JSON.

3️⃣ Get a Health Plan by ID
Endpoint: GET /api/plans/{id}
Flow:

1. Client provides the ID in the URL path.

2. Controller receives it and calls the service.

3. Service fetches the plan by ID using the repository.

4. If found, the plan is returned; if not, an error is thrown.

4️⃣ Update an Existing Health Plan
Endpoint: PUT /api/plans/{id}
Flow:

1. Client sends the updated plan data with the ID in the path.

2. Controller passes this to the service.

3. Service retrieves the existing plan and updates it.

4. Repository saves the updated plan back to the database.

5. Updated plan is returned.

5️⃣ Delete a Health Plan
Endpoint: DELETE /api/plans/{id}
Flow:

1. Client sends a DELETE request with the plan ID.

2. Controller calls the service to delete it.

3. Service checks if the plan exists.

4. If found, it is deleted via the repository.

5.A success message is returned.

