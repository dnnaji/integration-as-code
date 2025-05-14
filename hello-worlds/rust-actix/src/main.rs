use actix_web::{get, web, App, HttpServer, Responder};
use serde::Serialize;

#[derive(Serialize)]
struct HelloResponse {
    message: String,
}

#[get("/hello")]
async fn hello() -> impl Responder {
    web::Json(HelloResponse {
        message: "Hello World from Rust/Actix".to_string(),
    })
}

#[get("/")]
async fn root() -> impl Responder {
    web::Json(HelloResponse {
        message: "Rust/Actix Hello World root!".to_string(),
    })
}

#[actix_web::main]
async fn main() -> std::io::Result<()> {
    println!("Starting server at http://127.0.0.1:8085");
    HttpServer::new(|| {
        App::new()
            .service(hello)
            .service(root)
    })
    .bind("127.0.0.1:8085")?
    .run()
    .await
}