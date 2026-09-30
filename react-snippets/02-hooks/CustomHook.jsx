import { useState } from "react";

// Custom hook: plain function starting with "use" that reuses hook logic.
function useCounter(initialValue = 0) {
  const [count, setCount] = useState(initialValue);

  const increment = () => setCount((c) => c + 1);
  const decrement = () => setCount((c) => c - 1);
  const reset = () => setCount(initialValue);

  return { count, increment, decrement, reset };
}

export default function CustomHook() {
  const cart = useCounter(0);
  const likes = useCounter(10);

  return (
    <div>
      <p>Cart items: {cart.count}</p>
      <button onClick={cart.increment}>Add to cart</button>
      <button onClick={cart.decrement}>Remove</button>
      <button onClick={cart.reset}>Clear cart</button>

      <hr />

      <p>Likes: {likes.count}</p>
      <button onClick={likes.increment}>Like</button>
      <button onClick={likes.reset}>Reset likes</button>
    </div>
  );
}
