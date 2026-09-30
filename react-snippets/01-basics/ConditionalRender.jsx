import { useState } from "react";

export default function ConditionalRender() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [items] = useState(["React", "Java", "SQL"]);

  return (
    <div>
      {/* 1. Ternary */}
      {isLoggedIn ? <p>Welcome back!</p> : <p>Please log in.</p>}

      {/* 2. Short-circuit AND */}
      {isLoggedIn && <button onClick={() => setIsLoggedIn(false)}>Logout</button>}

      {/* 3. Show only if array has items */}
      {items.length > 0 && (
        <ul>
          {items.map((item) => (
            <li key={item}>{item}</li>
          ))}
        </ul>
      )}

      {!isLoggedIn && <button onClick={() => setIsLoggedIn(true)}>Login</button>}
    </div>
  );
}
