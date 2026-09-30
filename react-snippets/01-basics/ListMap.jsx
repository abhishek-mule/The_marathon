const users = [
  { id: 1, name: "Abhishek", role: "Java" },
  { id: 2, name: "Priya", role: "React" },
  { id: 3, name: "Rahul", role: "SQL" },
];

export default function ListMap() {
  return (
    <ul>
      {users.map((user) => (
        <li key={user.id}>
          {user.name} — {user.role}
        </li>
      ))}
    </ul>
  );
}

// key must be a stable unique id.
// Using index as key breaks reordering/filtering performance and state sync.
// Interview favourite: what happens if you forget key? -> React warns, re-renders entire list.
