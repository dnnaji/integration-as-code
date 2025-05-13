var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

// Define the GET endpoint for /hello
app.MapGet("/hello", () => {
    // Return an anonymous object, ASP.NET Core handles JSON serialization
    return new { Message = "Hello World from .NET" };
});

// Optional: Add a root endpoint for basic check
app.MapGet("/", () => "Hello World Minimal API Root!");

app.Run(); // Keep this line
