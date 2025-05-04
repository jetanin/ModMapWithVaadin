// import React from 'react';
// import History from '../components/History';

// const HistoryView = () => {
//   return (
//     <div style={{ padding: '20px' }}>
//       <h2>ประวัติการคำนวณเส้นทาง</h2>
//       <History />
//     </div>
//   );
// };

// export default HistoryView;

import React, { useEffect, useState } from 'react';
import axios from 'axios';

interface HistoryItem {
  start: string;
  targets: string[];
  numVertices: number;
  totalDistance: number;
  path: string[];
}

// const History = () => {
//   const [historyList, setHistoryList] = useState<HistoryItem[]>([]);
//   const [loading, setLoading] = useState<boolean>(true);

//   const fetchHistory = async () => {
//     try {
//       const response = await axios.get('/api/history');
//       setHistoryList(response.data);
//     } catch (error) {
//       console.error("Error fetching history:", error);
//     } finally {
//       setLoading(false);
//     }
//   };

//   useEffect(() => {
//     fetchHistory();
//   }, []);

//   return (
//     <div style={{ padding: '20px' }}>
//       <h2 className="font-bold text-lg mb-2 text-orange-700">ประวัติการคำนวณเส้นทาง</h2>
//       {loading ? (
//         <p>Loading...</p>
//       ) : (
//         <ul className="text-sm text-gray-800 list-disc pl-5">
//           {historyList.length > 0 ? (
//             historyList.map((item, index) => (
//               <li key={index}>
//                 <strong>จาก:</strong> {item.start} <strong>→ แวะ:</strong> {item.targets.join(', ')}<br />
//                 <strong>จำนวนจุดแวะ:</strong> {item.numVertices} | <strong>ระยะทางรวม:</strong> {item.totalDistance} เมตร
//                 <strong>เส้นทาง:</strong> {item.path.join(' → ')}
//               </li>
//             ))
//           ) : (
//             <li>ไม่มีข้อมูลประวัติ</li>
//           )}
//         </ul>
//       )}
//     </div>
//   );
// };

export default function HistoryList({ history }: { history: any[] }) {
  return (
    <div>
      <h2>SearchHistory</h2>
      <ul>
        {history.map((item, index) => (
          <li key={index}>
            {index+1}. Start: {item.start}, Visiting: {item.targets.join(', ')}, Distance: {item.totalDistance} m
            <br />
            {Array.isArray(item.path) ? item.path.join(' → ') : 'No path data'}
          </li>
        ))}
      </ul>
    </div>
  );
}