import { useEffect, useState } from "react";

// Debounced search: type fast, API called only after you pause.
// #1 most asked JS/React performance question.
export default function DebounceSearch() {
  const [query, setQuery] = useState("");
  const [results, setResults] = useState([]);
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    if (!query.trim()) {
      setResults([]);
      return;
    }

    setLoading(true);
    const controller = new AbortController();

    const timer = setTimeout(async () => {
      try {
        const res = await fetch(
          `https://jsonplaceholder.typicode.com/users?name_like=${encodeURIComponent(query)}`,
          { signal: controller.signal }
        );
        const data = await res.json();
        setResults(data);
      } catch (err) {
        if (err.name !== "AbortError") console.error(err);
      } finally {
        setLoading(false);
      }
    }, 400); // debounce delay

    // cleanup clears the previous timer + aborts the in-flight request
    return () => {
      clearTimeout(timer);
      controller.abort();
    };
  }, [query]);

  return (
    <div>
      <input
        value={query}
        onChange={(e) => setQuery(e.target.value)}
        placeholder="Search users..."
      />
      {loading && <p>Searching...</p>}
      <ul>
        {results.map((u) => (
          <li key={u.id}>{u.name}</li>
        ))}
      </ul>
    </div>
  );
}
