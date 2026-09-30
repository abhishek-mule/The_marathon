import { useEffect, useRef, useState } from "react";

export default function UseRefFocus() {
  const inputRef = useRef(null);
  const intervalRef = useRef(null);
  const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    inputRef.current.focus();
  }, []);

  const startTimer = () => {
    if (intervalRef.current) return;
    intervalRef.current = setInterval(() => setSeconds((s) => s + 1), 1000);
  };

  const stopTimer = () => {
    clearInterval(intervalRef.current);
    intervalRef.current = null;
  };

  useEffect(() => () => clearInterval(intervalRef.current), []);

  return (
    <div>
      <input ref={inputRef} placeholder="Auto focused on mount" />
      <p>Timer: {seconds}s</p>
      <button onClick={startTimer}>Start</button>
      <button onClick={stopTimer}>Stop</button>
    </div>
  );
}

// useRef: mutable box that survives re-renders and does NOT trigger a re-render.
// Use it for DOM nodes, timers, previous values, sockets — not for state.
