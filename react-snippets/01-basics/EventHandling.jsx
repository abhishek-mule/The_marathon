import { useState } from "react";

export default function EventHandling() {
  const [count, setCount] = useState(0);

  // Passing the function reference (not calling it)
  const increment = () => setCount((c) => c + 1);

  return (
    <div>
      <p>Count: {count}</p>

      <button onClick={increment}>+1</button>

      {/* Use functional update when new state depends on old state */}
      <button onClick={() => setCount((c) => c + 5)}>+5</button>

      {/* Event object is passed automatically */}
      <button onClick={(e) => console.log("clicked:", e.target.textContent)}>
        Log me
      </button>

      <button onClick={() => setCount(0)}>Reset</button>
    </div>
  );
}
