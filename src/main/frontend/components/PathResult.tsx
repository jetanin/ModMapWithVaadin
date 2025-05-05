import * as React from "react";

type PathResultProps = {
  path: string[];
  totalDistance: number;
};

const PathResult: React.FC<PathResultProps> = ({ path, totalDistance }) => {
  if (path.length === 0) return <p>No path found.</p>;

  return (
    <div className="rounded-xl p-4 bg-white shadow-md shadow-orange-800 mt-4">
      <h2 className="text-xl font-bold mb-2">Path Result</h2>
      <p><strong>Total Distance:</strong> {totalDistance}</p>
      <p>
        <strong>Path:</strong>{' '}
        {path.join(' → ')}
      </p>
    </div>
  );
};

export default PathResult;
