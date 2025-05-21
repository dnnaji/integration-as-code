using System;
using System.Collections.Generic;
using System.Linq;

static string AggregateQuotes(IEnumerable<string> quotes)
{
    var counts = quotes
        .GroupBy(q => q)
        .ToDictionary(g => g.Key, g => g.Count());
    return string.Join(",",
        counts.Select(kvp => $"{kvp.Key}({kvp.Value})"));
}

string[] quotes = { "hello", "world", "hello" };
Console.WriteLine(AggregateQuotes(quotes));
