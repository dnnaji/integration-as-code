var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

// Define the GET endpoint for /hello
app.MapGet("/hello", () => {
    // Return an anonymous object, ASP.NET Core handles JSON serialization
    return new { Message = "Hello World from .NET" };
});

// Define GET endpoint for /hello that takes a name parameter
app.MapGet("/hello/{name}", (string name) => {
    // Name should be capitalized
    name = char.ToUpper(name[0]) + name.Substring(1);
    return new { Message = $"Hello {name} from .NET" };
});

// Define GET endpoint for /hello-world
app.MapGet("/hello-world", () => {
    // Return an anonymous object, ASP.NET Core handles JSON serialization
    return new { Message = "Hello World from .NET" };
});

// Optional: Add a root endpoint for basic check
app.MapGet("/", () => "Hello World Minimal API Root!");

app.Run(); // Keep this line
