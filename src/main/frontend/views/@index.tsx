<meta name="viewport" content="width=device-width, initial-scale=1.0" />
import '../styles/tailwind.css';

import { Button } from '@vaadin/react-components';
import { ComboBox } from '@vaadin/react-components';
import React, {useEffect, useState, useRef} from "react";
import {ViewConfig} from "@vaadin/hilla-file-router/types.js";
import axios from 'axios';
import { Toaster, toast } from 'sonner'

import History from '../components/History';
import PathResult from '../components/PathResult';
import ZoomableImage from '../components/map';


export const config: ViewConfig = {
    menu: {
        exclude: true
    },
};

export default function MainView() {
    const [selectedStartPoint, setSelectedStartPoint] = useState<string | null>(null);
    const [tempStartPoint, setTempStartPoint ] =useState<string | null >(null);
    const [selectedValues, setSelectedValues] = useState<string[]>([]);
    const [tempWaypoint, setTempWaypoint ] =useState<string | null >(null);
    const [isStartPointLocked, setIsStartPointLocked] = useState<boolean>(false);
    const [isWaypointLocked, setIsWaypointLocked] = useState<boolean>(true);
    const [totalDistance, setTotalDistance] = useState<number | null>(null);
    const [numVerices, setNumVerices] = useState<number | null>(null);
    const [history, setHistory] = useState<any[]>([]);
    const [path, setPath] = useState<string[]>([]);
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
        let startValue = event.detail.value;
        setSelectedStartPoint(startValue);
        setIsStartPointLocked(true);
        setIsWaypointLocked(false);
        console.log(startValue);
    };

    const handleValueChange = (event: any) => {
        let value = event.detail.value;
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
        setTempStartPoint('');
        setTempWaypoint('');
        setPath([]);
        toast.success('Cleared');
        console.log("Start values:", selectedStartPoint);
        console.log("Cleared values:", selectedValues);
        console.log("NumVertices:", numVerices);
        console.log("Total Distance:", totalDistance);
        console.log("Path:", path);
    };
    
    const handleSubmit = async () => {
        if (!selectedStartPoint || selectedValues.length === 0) {
            toast.warning('Please select a start point and at least one waypoint.');
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
                toast.success('Summited');
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
                toast.warning(`Error: ${response.data.message}`);
            }
        } catch (error) {
            console.error("Error submitting data:", error);
            toast.warning("An unexpected error occurred. Please try again.");
        }
        console.log("Submitted");
        console.log("Start values:", selectedStartPoint);
        console.log("Selected values:", selectedValues);
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
        <main className="p-10 bg-orange-100">
            <Toaster position='top-center' richColors/>
            <div className="justify-center text-center strong text-4xl font-bold text-orange-600 mb-7 lg:justify-center" >MOD MAP</div>
            
            <div id='all-container' className="xl:flex lg:grid justify-center sm:gap-6 gap-4 ">
                <ZoomableImage />
                {/* <div id='checkBoxContainer' className='grid gap-4 sm:min-w-[300px] sm:max-w-[600px] w-full'> */}
                <div id="checkBoxContainer" className="xl:flex-col lg:grid lx:w-2/5 lg:w-full gap-4 px-2 justify-center xl:ml-20 xl:left-3.5 xl:pl-200">
                    <ComboBox
                        label="Select Your Start Point"
                        className='mb-10 mt-10 p-5 bg-white shadow-md shadow-orange-800 rounded-l w-full justify-center text-l'
                        items={Building}
                        onValueChanged={handleStartPointChange}
                        disabled={isStartPointLocked}
                    />
                    <div className='text-l'>
                        <ComboBox
                            label="Select Your Waypoint(s)"
                            className='mb-10 mt-10 p-5 bg-white shadow-md shadow-orange-800 rounded-l w-full justify-center text-l'
                            items={Building.filter((item) => item.value !== selectedStartPoint && !selectedValues.includes(item.value))}
                            onValueChanged={handleValueChange}
                            disabled={isWaypointLocked}
                        />
                    </div>

                    <div className="mt-4 mb-8 text-left text-gray-700 sm:text-center justify-center p-5 bg-white shadow-md shadow-orange-800 rounded-l w-full text-xl">
                        <strong>Selected Start Point:</strong>{" "}
                        <ul>
                            {selectedStartPoint ? <li className='text-l'>{selectedStartPoint}</li> : <li className='text-l'>None</li>}
                        </ul>
                            <strong>Waypoint:</strong>{" "}
                        <ul>
                            {selectedValues.map((value, index) => (
                                <li className='text-l'key={index}>{value}</li>
                            ))}
                            {totalDistance !== null ? <PathResult path={path} totalDistance={totalDistance} /> : <li> </li>}
                        </ul>
                    </div>
                    <div id='button-container' className="justify-center text-center flex">
                        <Button 
                            className="max-w-50vw max-h-10 text-white bg-gradient-to-br from-pink-500 
                            to-orange-400 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none 
                            focus:ring-pink-200 dark:focus:ring-pink-800 font-medium rounded-lg  
                            px-5 py-2.5 text-center me-2 mb-2 mr-4 text-xl"
                            onClick = {handleClear}>
                            Clear
                        </Button>
                        <Button 
                            className="max-w-50 max-h-10 text-white bg-gradient-to-br from-pink-500 
                            to-orange-400 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none 
                            focus:ring-pink-200 dark:focus:ring-pink-800 font-medium rounded-lg text-xl 
                            px-5 py-2.5 text-center me-2 mb-2 ml-4"
                            onClick={handleSubmit}>
                                Submit
                            </Button>
                    </div>

                    <div className="mt-5 lg:text-center">
                        <History history={history} />
                    </div>
                </div>
            </div>
        </main>
    );
}