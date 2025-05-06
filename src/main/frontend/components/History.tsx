import React, { useEffect, useState } from 'react';
import axios, { toFormData } from 'axios';

interface HistoryItem {
  start: string;
  targets: string[];
  numVertices: number;
  totalDistance: number;
  path: string[];
}


export default function HistoryList({ history }: { history: any[] }) {
  return (
    <div>
        <ul>
          <div id='historyContainer' className='rounded-xl p-4 bg-white shadow-md shadow-orange-800 mt-4'>
          <h2>SearchHistory</h2>
          {history.map((item, index) => (
            <li key={index}>
              {index+1}. Start: {item.start}, Visiting: {item.targets.join(', ')}, Distance: {item.totalDistance} m
              <br />
              {Array.isArray(item.path) && item.path.length > 0 ? item.path.join(' → ') : 'No path data'}
            </li>
          ))}
          </div>
        </ul>
    </div>
  );
}