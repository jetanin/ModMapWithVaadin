import React from 'react';
import History from '../components/History';

const HistoryView = () => {
  return (
    <div style={{ padding: '20px' }}>
      <h2>ประวัติการคำนวณเส้นทาง</h2>
      <History />
    </div>
  );
};

export default HistoryView;