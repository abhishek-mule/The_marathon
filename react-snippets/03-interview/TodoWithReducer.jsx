import { useReducer, useState } from "react";

const initialState = { todos: [], nextId: 1 };

function todoReducer(state, action) {
  switch (action.type) {
    case "ADD":
      return {
        todos: [...state.todos, { id: state.nextId, text: action.text, done: false }],
        nextId: state.nextId + 1,
      };
    case "TOGGLE":
      return {
        ...state,
        todos: state.todos.map((t) => (t.id === action.id ? { ...t, done: !t.done } : t)),
      };
    case "DELETE":
      return { ...state, todos: state.todos.filter((t) => t.id !== action.id) };
    default:
      throw new Error("Unknown action: " + action.type);
  }
}

export default function TodoWithReducer() {
  const [state, dispatch] = useReducer(todoReducer, initialState);
  const [text, setText] = useState("");

  const add = (e) => {
    e.preventDefault();
    if (!text.trim()) return;
    dispatch({ type: "ADD", text: text.trim() });
    setText("");
  };

  return (
    <div>
      <form onSubmit={add}>
        <input value={text} onChange={(e) => setText(e.target.value)} placeholder="New task" />
        <button type="submit">Add</button>
      </form>

      <ul>
        {state.todos.map((todo) => (
          <li key={todo.id}>
            <label>
              <input
                type="checkbox"
                checked={todo.done}
                onChange={() => dispatch({ type: "TOGGLE", id: todo.id })}
              />
              <span style={{ textDecoration: todo.done ? "line-through" : "none" }}>
                {todo.text}
              </span>
            </label>
            <button onClick={() => dispatch({ type: "DELETE", id: todo.id })}>x</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

// useReducer when state is complex or several updates depend on each other.
// Bonus interview question: add a FILTER action and a filtered selector.
