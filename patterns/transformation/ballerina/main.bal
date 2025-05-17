import ballerina/io;

type User record {|
    string firstName;
    string lastName;
|};

type Greeting record {|
    string message;
|};

public function main() {
    User user = {firstName: "Jane", lastName: "Doe"};
    Greeting greeting = transform(user);
    io:println(greeting.message);
}

function transform(User user) returns Greeting {
    return {message: "Hello " + user.firstName + " " + user.lastName};
}
