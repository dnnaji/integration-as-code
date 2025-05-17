import ballerina/io;

type Order record {| 
    string type;
    string message;
|};

public function main() {
    Order first = {type: "A", message: "First"};
    Order second = {type: "B", message: "Second"};
    route(first);
    route(second);
}

function route(Order order) {
    if order.type == "A" {
        handleTypeA(order);
    } else {
        handleTypeB(order);
    }
}

function handleTypeA(Order order) {
    io:println("Handled type A: " + order.message);
}

function handleTypeB(Order order) {
    io:println("Handled type B: " + order.message);
}
