# The Marathon — DSA & Interview Practice

Two folders, one goal: crack coding interviews.

```
java-snippets/     Java basics, number problems, patterns + interview questions
react-snippets/    React basics, hooks + interview questions
```

## Java

| Folder | What's inside |
|--------|---------------|
| `01-basics/` | loops, if-else, ternary, scanner |
| `02-number-problems/` | reverse number, sum of digits, composite check |
| `03-patterns/` | number pattern, star row, star rectangle |
| `04-interview/` | arrays, strings, collections, OOP, sorting & recursion |
| `QUESTIONS.md` | full interview question list, tracked with checkboxes |

Run any file (every class has its own `main`):

```bash
javac java-snippets/01-basics/EvenOdd.java
java -cp java-snippets/01-basics EvenOdd
```

## React

| Folder | What's inside |
|--------|---------------|
| `01-basics/` | JSX, props, conditional rendering, lists, events |
| `02-hooks/` | useState, useEffect, useRef, useMemo/useCallback, custom hook |
| `03-interview/` | stopwatch, todo with useReducer, debounced search |
| `QUESTIONS.md` | coding tasks + theory questions for interviews |

Snippets are plain `.jsx` files — drop any of them into a Vite / CRA project to run.

```bash
npx create-vite@latest practice --template react
# copy a snippet into src/App.jsx and npm run dev
```

## How to use

1. Open `java-snippets/QUESTIONS.md` and `react-snippets/QUESTIONS.md`
2. Pick one unchecked question, solve it from scratch
3. Compare with the snippet in this repo
4. Tick the checkbox and move on
