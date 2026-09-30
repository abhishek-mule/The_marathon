import { useEffect, useRef, useState } from "react";

export default function Stopwatch() {
  const [time, setTime] = useState(0);
  const [running, setRunning] = useState(false);
  const intervalRef = useRef(null);

  useEffect(() => {
    if (running) {
      intervalRef.current = setInterval(() => setTime((t) => t + 1), 10);
    }
    return () => clearInterval(intervalRef.current);
  }, [running]);

  const reset = () => {
    setRunning(false);
    setTime(0);
  };

  const mm = String(Math.floor(time / 100) % 100).padStart(2, "0");
  const ss = String(Math.floor(time / 10) % 60).padStart(2, "0");
  const cs = String(time % 10).padStart(2, "0");

  return (
    <div>
      <h2>
        {mm}:{ss}:{cs}
      </h2>
      <button onClick={() => setRunning((r) => !r)}>{running ? "Pause" : "Start"}</button>
      <button onClick={reset} disabled={!running && time === 0}>
        Reset
      </button>
    </div>
  );
}

// Frequently asked: build a stopwatch/timer without looking it up.
// Key points: interval in useEffect, cleanup on unmount, store id in useRef.
