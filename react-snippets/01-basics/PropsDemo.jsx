function UserCard({ name, role, age = 20 }) {
  return (
    <div className="card">
      <h2>{name}</h2>
      <p>Role: {role}</p>
      <p>Age: {age}</p>
    </div>
  );
}

export default function PropsDemo() {
  return (
    <div>
      <UserCard name="Abhishek" role="Developer" />
      <UserCard name="Priya" role="Designer" age={26} />
    </div>
  );
}

// Props are read-only. Child never mutates props -> one-way data flow.
// Always destructure in the parameter list instead of props.name everywhere.
