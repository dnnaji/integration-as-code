#[macro_use]
extern crate rocket;
use rocket::serde::json::Json;
use serde::Serialize;

#[derive(Serialize)]
struct HelloResponse {
    message: String,
}

#[get("/hello")]
fn hello() -> Json<HelloResponse> {
    Json(HelloResponse {
        message: "Hello World from Rust/Rocket".to_string(),
    })
}

#[get("/")]
fn root() -> Json<HelloResponse> {
    Json(HelloResponse {
        message: "Rust/Rocket Hello World root!".to_string(),
    })
}

// Add a new endpoint for /hello/{name} that takes a name parameter & capitalizes the name.
#[get("/hello/<name>")]
fn hello_name(name: String) -> Json<HelloResponse> {
    let output_name = name.chars().next().unwrap().to_uppercase().to_string() + &name[1..];
    Json(HelloResponse {
        message: format!("Hello {} from Rust/Rocket", output_name,),
    })
}

#[launch]
fn rocket() -> _ {
    println!("Starting server at http://127.0.0.1:8086");
    rocket::build().mount("/", routes![hello, root, hello_name])
}
