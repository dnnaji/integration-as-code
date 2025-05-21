import ballerina/io;

public function aggregateQuotes(string[] quotes) returns string {
    map<int> counts = {};
    foreach string q in quotes {
        int count = counts.hasKey(q) ? counts[q] : 0;
        counts[q] = count + 1;
    }

    string result = "";
    boolean first = true;
    foreach var [key, value] in counts.entries() {
        if !first {
            result += ",";
        }
        result += key + "(" + value.toString() + ")";
        first = false;
    }
    return result;
}

public function main() {
    string[] quotes = ["hello", "world", "hello"];
    io:println(aggregateQuotes(quotes));
}
