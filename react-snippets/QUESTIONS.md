# React — Frequently Asked Interview Questions

Track your progress: `[ ]` todo, `[x]` done. Files marked with a path have a snippet in this repo.

## Part A — Coding Questions (do these by hand)

### Basics

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Render a component and pass props with default values | Easy | `01-basics/HelloWorld.jsx`, `01-basics/PropsDemo.jsx` |
| 2 | Conditional rendering — three ways | Easy | `01-basics/ConditionalRender.jsx` |
| 3 | Render a list with a correct `key` | Easy | `01-basics/ListMap.jsx` |
| 4 | Controlled input — form with validation | Easy | `01-basics/EventHandling.jsx` |
| 5 | Counter with increments that depend on previous state | Easy | `01-basics/EventHandling.jsx` |

### Hooks

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Why does `setCount(c => c + 1)` beat `setCount(count + 1)`? | Easy | `02-hooks/UseStateCounter.jsx` |
| 2 | Fetch data on mount, show loading and error states, clean up the request | Medium | `02-hooks/UseEffectFetch.jsx` |
| 3 | Auto-focus an input and manage a timer with `useRef` | Medium | `02-hooks/UseRefFocus.jsx` |
| 4 | `useMemo` vs `useCallback` vs `React.memo` — rebuild this demo | Medium | `02-hooks/UseMemoCallback.jsx` |
| 5 | Write a custom hook (e.g. `useCounter`, `useLocalStorage`) | Medium | `02-hooks/CustomHook.jsx` |
| 6 | Build a stopwatch with start/pause/reset | Medium | `03-interview/Stopwatch.jsx` |
| 7 | Build a todo list with `useReducer` (add / toggle / delete) | Medium | `03-interview/TodoWithReducer.jsx` |
| 8 | Debounced search with an abortable fetch | Hard | `03-interview/DebounceSearch.jsx` |

### Additional coding tasks to attempt

- [ ] Infinite scroll with `IntersectionObserver`
- [ ] `useDebounce` custom hook extracted from the search example
- [ ] `useLocalStorage` — persist state across reloads
- [ ] Modal with focus trap and Escape-to-close
- [ ] Theme provider with `useContext` + toggle
- [ ] Drag-and-drop sortable list
- [ ] Virtualised long list (render only visible rows)

## Part B — Theory Questions

### Rendering & Components

1. What is reconciliation and how does the virtual DOM diff work?
2. What is the difference between a controlled and an uncontrolled component?
3. When does React re-render? List every trigger.
4. What are React Fragments and why do they matter?
5. `children` prop — what is it and when do you use it?
6. Prop drilling — what is it and how do you avoid it? (context / composition)

### State & Data Flow

7. Props vs state — differences, immutability rules
8. Why is state updated asynchronously? What is batching in React 18?
9. Lifting state up — when do you do it?
10. When would you use `useReducer` over `useState`?
11. What is the significance of keys in a list?

### Hooks

12. Rules of hooks — why can't hooks be called conditionally?
13. What does an empty dependency array `[]` mean in `useEffect`?
14. What runs on mount, on update, and on unmount? Order of cleanup.
15. `useRef` vs `useState` — does changing a ref trigger a render?
16. What is a stale closure? How do you fix it?
17. When does a `useEffect` loop happen and how do you stop it?
18. Write a `useInterval` or `usePrevious` custom hook.

### Performance

19. Why does an object/array literal inside render cause re-renders?
20. `React.memo` — when does it help and when does it do nothing?
21. What is code splitting and how do you do it with `React.lazy`?
22. How would you debug a slow React app? (React DevTools Profiler)

### Ecosystem & Fundamentals

23. `useContext` vs Redux — when is context enough?
24. What happens when you call `setState` on an unmounted component?
25. Class lifecycle methods vs hooks — map each one (`mount → useEffect([])`)
26. React 18 features: concurrent rendering, `useTransition`, `useId`, Strict Mode double-invoke
27. What is the significance of the `key` prop on a component inside a list?
28. SSR / Next.js basics: what does `useEffect` NOT run on the server?

## Part C — JavaScript questions asked alongside React

- [ ] `var` vs `let` vs `const` + hoisting + temporal dead zone
- [ ] Closures with a counter example
- [ ] `this` binding — arrow vs regular functions
- [ ] Event delegation and event bubbling
- [ ] Debounce vs throttle — implement both
- [ ] Promises, `async/await`, and error handling
- [ ] `Array.map` vs `forEach` vs `filter` vs `reduce`
- [ ] Deep clone vs shallow clone (`structuredClone`, spread)
- [ ] What is the event loop? Microtask vs macrotask ordering
