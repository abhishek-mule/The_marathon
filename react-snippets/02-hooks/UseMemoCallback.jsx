import { useCallback, useMemo, useState } from "react";

function ExpensiveList({ numbers, multiplier, onAdd }) {
  console.log("ExpensiveList rendered");
  return (
    <ul>
      {numbers.map((n) => (
        <li key={n}>{n * multiplier}</li>
      ))}
      <button onClick={() => onAdd(numbers.length + 1)}>Add number</button>
    </ul>
  );
}

export default function UseMemoCallback() {
  const [numbers, setNumbers] = useState([1, 2, 3, 4, 5]);
  const [multiplier, setMultiplier] = useState(2);

  // useMemo: memoise a VALUE, skips heavy recalculation
  const sorted = useMemo(() => {
    console.log("sorting...");
    return [...numbers].sort((a, b) => b - a);
  }, [numbers]);

  // useCallback: memoise a FUNCTION, keeps reference stable so child does not re-render
  const handleAdd = useCallback(() => {
    setNumbers((prev) => [...prev, prev.length + 1]);
  }, []);

  return (
    <div>
      <button onClick={() => setMultiplier((m) => m + 1)}>Multiplier: {multiplier}</button>
      <p>Sorted desc: {sorted.join(", ")}</p>
      <ExpensiveList numbers={numbers} multiplier={multiplier} onAdd={handleAdd} />
    </div>
  );
}

// Interview line: useMemo = value, useCallback = function, React.memo = whole component.
