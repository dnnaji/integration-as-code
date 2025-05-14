import ballerina/http;
import ballerina/log;

// Define the listener on port 8084
listener http:Listener helloListener = new (8084);

// Define the service attaching to the listener
service / on helloListener {

    // Define the resource function for GET requests to /hello
    // It returns a map which automatically serializes to JSON
    resource function get hello() returns map<json>|http:InternalServerError {
        log:printInfo("Processing /hello request");
        // Return a map conforming to the desired JSON structure
        return {"message": "Hello World from Ballerina"};
    }

    // Optional: Add a root resource
    resource function get .() returns string {
         log:printInfo("Processing / request");
         return "Ballerina Hello World root!";
    }
}
