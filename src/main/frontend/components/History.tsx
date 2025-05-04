// import React, { useEffect, useState } from 'react';
// import axios from 'axios';

// interface HistoryItem {
//     start: string;
//     targets: string[];
//     numVertices: number;
//     totalDistance: number;
// }

// export default function History() {
//     const [historyList, setHistoryList] = useState<HistoryItem[]>([]);
//     const [loading, setLoading] = useState<boolean>(true);

//     const fetchHistory = async () => {
//         try {
//             const response = await axios.get('/api/history'); // <-- ปรับให้ตรงกับ backend
//             setHistoryList(response.data);
//         } catch (error) {
//             console.error("Error fetching history:", error);
//         } finally {
//             setLoading(false);
//         }
//     };

//     useEffect(() => {
//         fetchHistory();
//     }, []);

//     return (
//         <div>
//             <h2 className="font-bold text-lg mb-2 text-orange-700">ประวัติการค้นหาเส้นทาง</h2>
//             {loading ? (
//                 <p>Loading...</p>
//             ) : (
//                 <ul className="text-sm text-gray-800 list-disc pl-5">
//                     {historyList.length > 0 ? (
//                         historyList.map((item, index) => (
//                             <li key={index}>
//                                 <strong>จาก:</strong> {item.start} <strong>→ แวะ:</strong> {item.targets.join(', ')}<br />
//                                 <strong>จำนวนจุดแวะ:</strong> {item.numVertices} | <strong>ระยะทางรวม:</strong> {item.totalDistance} เมตร
//                             </li>
//                         ))
//                     ) : (
//                         <li>ไม่มีข้อมูลประวัติ</li>
//                     )}
//                 </ul>
//             )}
//         </div>
//     );
// }
