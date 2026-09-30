function HelloWorld() {
  return <h1>Hello from React!</h1>;
}

function App() {
  return (
    <div>
      <HelloWorld />
      <p>JSX must return a single parent element or a fragment.</p>
    </div>
  );
}

export default App;
