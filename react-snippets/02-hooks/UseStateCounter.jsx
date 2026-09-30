import { useState } from "react";

export default function UseStateCounter() {
  const [count, setCount] = useState(0);
  const [theme, setTheme] = useState("light");

  return (
    <div style={{ background: theme === "dark" ? "#222" : "#fff", color: theme === "dark" ? "#fff" : "#000", padding: 16 }}>
      <h3>Count: {count}</h3>

      {/* setState is async + batches multiple updates in one render */}
      <button onClick={() => { setCount((c) => c + 1); setCount((c) => c + 1); }}>
        +2 (two calls = one render)
      </button>

      <button onClick={() => setCount(0)}>Reset</button>
      <button onClick={() => setTheme((t) => (t === "dark" ? "light" : "dark"))}>
        Toggle theme
      </button>
    </div>
  );
}
