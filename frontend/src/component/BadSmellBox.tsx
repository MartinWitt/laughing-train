import { BadSmell } from "../data/BadSmell";


function BadSmellBox(badSmell: BadSmell) {
  return (
    <div>
      <h1>{badSmell.name}</h1>
      <p>{badSmell.messageMarkdown}</p>
      <p>{badSmell.snippet}</p>
    </div>
  );
}