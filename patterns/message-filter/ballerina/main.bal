import ballerina/io;

public function main() {
    string[] messages = ["a", "bb", "ccc", "dd"];
    foreach var msg in messages {
        filter(msg);
    }
}

function filter(string msg) {
    if msg.length() > 1 {
        io:println(msg);
    }
}
