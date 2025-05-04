<meta name="viewport" content="width=device-width, initial-scale=1.0" />
import '../styles/tailwind.css';

import { Button } from '@vaadin/react-components';
import { ComboBox } from '@vaadin/react-components';
import React, {useEffect, useState, useRef} from "react";
import  SvgIcon  from "./Svg.jsx";
import {ViewConfig} from "@vaadin/hilla-file-router/types.js";
import axios from 'axios';

import History from '../components/history';
import PathResult from '../components/PathResult';

export const config: ViewConfig = {
    menu: {
        exclude: true
    },
};

export default function MainView() {
    const [selectedStartPoint, setSelectedStartPoint] = useState<string | null>(null);
    const [selectedValues, setSelectedValues] = useState<string[]>([]);
    const [isStartPointLocked, setIsStartPointLocked] = useState<boolean>(false);
    const [totalDistance, setTotalDistance] = useState<number | null>(null);
    const [numVerices, setNumVerices] = useState<number | null>(null);
    const [history, setHistory] = useState<any[]>([]); // State to store history data
    const [path, setPath] = useState<string[]>([]); // State to store path data
    const Building = [
        { label: '● S1 อาคารวิศวกรรมเครื่องกล 4 (Mechanical Engineering Building 4)', value: 'S1' },
        { label: '● S2 อาคารจอดรถ (Car Parking Building)', value: 'S2' },
        { label: '● S3 อาคารสถาบันนวัตกรรมการเรียนรู้เฉลิมพระเกียรติ 80 พรรษา มูลนิธิไทยคม (Innovation Learning Institute of 80 Year Commemoration of King Rama IX) รร.ดรุณสิกขาลัย (Darunsikkhalai School For Innovative Learning)', value: 'S3' },
        { label: '● S4 อาคารวิศววัฒนะ (Engineering Building : Wissawa Wattana Building) วิศวกรรมหล่อโลหะ (Foundry Engineering Laboratory) วิศวกรรมแม่พิมพ์ขึ้นรูป (Metal Forming Engineering Laboratory) วิศวกรรมโยธาและโลจิสติกส์ (Civil and Logistics Engineering Laboratory) วิศวกรรมเครื่องกล (Mechanical Engineering Laboratory) วิศวกรรมอุตสาหการ, วิศวกรรมเครื่องมือและวัสดุ, วิศวกรรมคอมพิวเตอร์ (Production Engineering, Tools and Materials Engineering, Computer Engineering Laboratory)', value: 'S4' },
        { label: '● S5 บ้านธรรมรักษา 2 (Dhammaraksa Residence Hall 2 : Male Dormitory)', value: 'S5' },
        { label: '● S6 บ้านธรรมรักษา 1 (Dhammaraksa Residence Hall 1 : Male Dormitory)', value: 'S6' },
        { label: '● S7 อาคารพัฒนาเด็กเล็ก มจธ. (KMUTT Child Development Building)', value: 'S7' },
        { label: '● S8 อาคารโรงประลองเทคโนโลยีและวัสดุ (Technology and Materials Workshop Building)', value: 'S8' },
        { label: '● S9 อาคารเรียนและปฏิบัติการคณะพลังงาน สิ่งแวดล้อมและวัสดุ (School of Energy Environment and Materials Building)', value: 'S9' },
        { label: '● S10 อาคารสังคมสีเขียว มจธ. (KMUTT Green Society Building)', value: 'S10' },
        { label: '● S11 อาคารเรียนรวม 5 (Classroom Building 5)', value: 'S11' },
        { label: '● S12 อาคารเรียนรวม 4 (Classroom Building 4)', value: 'S12' },
        { label: '● S13 อาคารเรียนรวม 3 (Classroom Building 3)', value: 'S13' },
        { label: '● S14 อาคารพระจอมเกล้าราชานุสรณ์ 190 ปี (King Mongkuts 190th Anniversary Memorial Building)', value: 'S14' },
        { label: '● S15 อาคารภาควิชาวิศวกรรมเคมี (Department of Chemical Engineering Building)', value: 'S15' },
        { label: '● N1 อาคารศูนย์ต้อนรับ (Welcome Center Building)', value: 'N1' },
        { label: '● N2 อาคารสำนักงานอธิการบดี (Office of The President Building)', value: 'N2' },
        { label: '● N3 อาคารภาควิชาเคมี (Department of Chemistry Building)', value: 'N3' },
        { label: '● N4 อาคารภาควิชาฟิสิกส์ - คณิตศาสตร์ (Department of Physics - Mathematics Building)', value: 'N4' },
        { label: '● N5 อาคารศูนย์เครื่องมือวิทยาศาสตร์เพื่อมาตรฐานและอุตสหกรรม (Scientific Instrument Center for Standards and Industry Building)', value: 'N5' },
        { label: '● N6 อาคารภาควิชาจุลชีววิทยา (Department of Microbiology Building)', value: 'N6' },
        { label: '● N7 อาคารปฏิบัติการพื้นฐานทางวิทยาศาสตร์ (Fundamental Science Laboratory Building)', value: 'N7' },
        { label: '● N8 สถานีสูบน้ำ (Water Pump Building)', value: 'N8' },
        { label: '● N9 อาคารสถาบันวิทยาการหุ่นยนต์ภาคสนาม (Institute of Field Robotics Building)', value: 'N9' },
        { label: '● N10 อาคารสำนักหอสมุด (KMUTT Library Building)', value: 'N10' },
        { label: '● N11 อาคารคณะเทคโนโลยีสารสนเทศ (School of Information Technology Building)', value: 'N11' },
        { label: '● N12 อาคารอเนกประสงค์ (Utility Exchange Building)', value: 'N12' },
        { label: '● N13 อาคาร Workshop & Greenhouse (Workshop & Greenhouse Building)', value: 'N13' },
        { label: '● N14 อาคารไฟฟ้าแรงสูง (Hi - Voltage Building)', value: 'N14' },
        { label: '● N15 อาคารเรียนและปฏิบัติทางศิลปศาสตร์ (School of Liberal Arts Building)', value: 'N15' },
        { label: '● N16 อาคารการเรียนรู้พหุวิทยาการ (Learning Exchange Building)', value: 'N16' },
        { label: '● N17 อาคารเรียนรวม 2 (Classroom Building 2)', value: 'N17' },
        { label: '● N18 อาคารปฏิบัติการทางวิศวกรรมอุตสาหการ 4 (Production Engineering Laboratory Building 4)', value: 'N18' },
        { label: '● N19 อาคารปฏิบัติการทางวิศวกรรมอุตสาหการ 5 (Production Engineering Laboratory Building 5)', value: 'N19' },
        { label: '● N20 อาคารเรียนรวม 1 (Classroom Building 1)', value: 'N20' }
    ];

    const handleStartPointChange = (event: any) => {
        const startValue = event.detail.value;
        setSelectedStartPoint(startValue);
        setIsStartPointLocked(true);
        console.log(startValue);
    };

    const handleValueChange = (event: any) => {
        const value = event.detail.value;
        console.log('Selected values:', value);
        if (value === selectedStartPoint) {
            console.log(`Value "${value}" is the same as the start point and will not be added.`);
            return;
        }
        setSelectedValues((prevValues) => {
            if (Array.isArray(prevValues)) {
                return [...prevValues, value];
            }
            return [value];
        });
        console.log(selectedValues);
    };

    const handleClear = () => {
        setSelectedValues([]);
        setSelectedStartPoint(null);
        setNumVerices(null);
        setTotalDistance(null);
        setIsStartPointLocked(false);
        setPath([]);
        console.log("Start values:", selectedStartPoint);
        console.log("Cleared values:", selectedValues);
        console.log("NumVertices:", numVerices);
        console.log("Total Distance:", totalDistance);
        console.log("Path:", path);
    };
    
    const handleSubmit = async () => {
        if (!selectedStartPoint || selectedValues.length === 0) {
            alert("Please select a start point and at least one value.");
            return;
        }
    
        const requestData = {
            selectedStartPoint: selectedStartPoint,
            selectedValues: selectedValues,
        };
    
        try {
            const response = await axios.post('/api/PathFinder', requestData);
            if (response.data.status === "success") {
                setNumVerices(response.data.numVerices);
                setTotalDistance(response.data.totalDistance);
                alert(`Total Distance: ${response.data.totalDistance} meters`);
                setPath(response.data.path);
                setHistory((prevHistory) => [
                    ...prevHistory,
                    {
                        start: selectedStartPoint,
                        targets: selectedValues,
                        numVertices: response.data.numVerices,
                        totalDistance: response.data.totalDistance,
                    },
                ]);
            } else {
                alert(`Error: ${response.data.message}`);
            }
        } catch (error) {
            console.error("Error submitting data:", error);
            alert("An unexpected error occurred. Please try again.");
        }
        console.log("Submitted");
        console.log("Start values:", selectedStartPoint);
        console.log("Selected values:", selectedValues);

        // useEffect(() => {
        //     if (totalDistance !== null || numVerices !== null) {
        //       console.log("Updated totalDistance:", totalDistance);
        //       console.log("Updated numVerices:", numVerices);
        //     }
        //   }, [totalDistance, numVerices]);
 
    };

    useEffect(() => {
        if (totalDistance !== null || numVerices !== null) {
          console.log("Updated totalDistance:", totalDistance);
          console.log("Updated numVerices:", numVerices);
        }
      }, [totalDistance, numVerices]);

    useEffect(() => {
        fetch('/api/history')
          .then(res => res.json())
          .then(data => {
            if (Array.isArray(data)) {
              setHistory(data);
            } else {
              console.error('Expected array, got:', data);
            }
          });
      }, []);

    return (
        
        <main className="p-4">
            <div className="justify-center text-center strong text-2xl font-bold text-orange-600" >KMUTT MAP</div>
            
            <div id='container' className="flex flex-col sm:flex-row sm:justify-center sm:items-start sm:gap-8">
                <SvgIcon className='ml-10 mr-10 mt-3 sm:items-center '/>
                
                <div id='checkBoxContainer' className='grid gap-4 sm:min-w-[300px] sm:max-w-[600px] w-full'>
                    <ComboBox
                        label="เลือกจุดเริ่มต้น"
                        className='mb-10 mt-10'
                        items={Building}
                        style={{width: '100%'}}
                        onValueChanged={handleStartPointChange}
                        disabled={isStartPointLocked}
                    />
                    <ComboBox
                        label="เลือกสถานที่ที่ต้องการจะแวะ"
                        items={Building.filter((item) => item.value !== selectedStartPoint && !selectedValues.includes(item.value))}
                        style={{width: '100%'}}
                        onValueChanged={handleValueChange}
                    />

                    <div className="mt-4 text-left text-sm text-gray-700">
                        <strong>Selected Start Point:</strong>{" "}
                        <ul>
                            {selectedStartPoint ? <li>{selectedStartPoint}</li> : <li>None</li>}
                        </ul>
                        <strong>Selected:</strong>{" "}
                        <ul>
                            {selectedValues.map((value, index) => (
                                <li key={index}>{value}</li>
                            ))}
                        </ul>
                        {/* <strong>Number of Vertices:</strong>
                        <ul>
                            {numVerices !== null ? <li>{numVerices}</li> : <li>None</li>}
                        </ul> */}
                        <strong>Total Distance:</strong>
                        <ul>
                            {totalDistance !== null ? <li>{totalDistance} meters</li> : <li>None</li>}
                        </ul>
                        <strong>Path:</strong>
                        <ul>
                            {totalDistance !== null ? <PathResult path={path} totalDistance={totalDistance} /> : <li>None</li>}
                        </ul>
                    </div>
                    <div id='button-container' className="justify-center text-center flex">
                        <Button 
                            className="max-w-50 max-h-10 text-white bg-gradient-to-br from-pink-500 
                            to-orange-400 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none 
                            focus:ring-pink-200 dark:focus:ring-pink-800 font-medium rounded-lg text-sm 
                            px-5 py-2.5 text-center me-2 mb-2 mr-4"
                            onClick = {handleClear}>
                            Clear
                            </Button>
                        <Button 
                            className="max-w-50 max-h-10 text-white bg-gradient-to-br from-pink-500 
                            to-orange-400 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none 
                            focus:ring-pink-200 dark:focus:ring-pink-800 font-medium rounded-lg text-sm 
                            px-5 py-2.5 text-center me-2 mb-2 ml-4"
                            onClick={handleSubmit}>
                                Submit
                            </Button>
                    </div>

                    <div className="mt-10 sm:text-center">
                        <History history={history} />
                    </div>            
                </div>
            </div>
        </main>
    );
}