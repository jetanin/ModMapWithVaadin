import { ComboBox } from '@vaadin/react-components';
import React, {useEffect, useState, useRef} from "react";
import { MultiSelectComboBox, MultiSelectComboBoxElement } from '@vaadin/react-components';
import  SvgIcon  from "./Svg.jsx";
import {ViewConfig} from "@vaadin/hilla-file-router/types.js";

export const config: ViewConfig = {
    menu: {
        exclude: true
    },
};

export default function MainView() {
    const [selectedValues, setSelectedValues] = useState<string[]>([]);
    const comboBoxRef = useRef<MultiSelectComboBoxElement>(null);
    
  
    useEffect(() => {
        const comboBox = comboBoxRef.current;
        if (!comboBox) return;
    
        const handleValueChange = (event: Event) => {
          const customEvent = event as CustomEvent;
          const value = (customEvent.detail as any)?.value;
          if (Array.isArray(value)) {
            setSelectedValues(value);
          }
        };
    
        comboBox.addEventListener('value-changed', handleValueChange);
    
        return () => {
          comboBox.removeEventListener('value-changed', handleValueChange);
        };
      }, []);

    // const handleValueChange = (event: Event) => {
    //     const customEvent = event as CustomEvent<{ value: unknown }>;
    //     const selected = customEvent.detail.value;
      
    //     if (Array.isArray(selected) && selected.every(item => typeof item === 'string')) {
    //       setSelectedValues(selected);
    //     } else {
    //       console.warn("Unexpected value format:", selected);
    //       setSelectedValues([]);
    //     }
    //   };

    return (
        
        <main className="p-m">
            <div className="justify-center text-center strong text-2xl font-bold text-orange-600">KMUTT MAP</div>
            
            <div id='container' className="flex">
                <SvgIcon className='ml-10 mr-10 mt-3'/>
                
                <div id='checkBoxContainer' className='grid'>
                <ComboBox
                    label="เลือกจุดเริ่มต้น"
                        items={[
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
                        ]}
                        style={{maxWidth: '1000px', minWidth: '300px', width: '550px'}}
                        // onValueChanged={handleValueChange}
                />
                <MultiSelectComboBox
                    label="เลือกสถานที่ที่ต้องการจะแวะ"
                        items={[
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
                        ]}
                        style={{maxWidth: '1000px', minWidth: '300px', width: '550px'}}
                        // onValueChanged={handleValueChange}
                    />

                    <div className="mt-4 text-left text-sm text-gray-700">
                        <strong>Selected:</strong>{" "}
                        {/* {selectedValues.length > 0
                        ? selectedValues.join(", ")
                        : "ยังไม่มีการเลือก"} */}
                        {selectedValues.map((val) => (
                            <li key={val}>{val}</li>
                        ))}
                    </div>
                </div>
            </div>
        </main>
    );
}