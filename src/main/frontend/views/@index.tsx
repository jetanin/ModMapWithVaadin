import { CheckboxGroup } from '@vaadin/react-components';
import { Checkbox } from '@vaadin/react-components';
import { MultiSelectComboBox } from '@vaadin/react-components';
import React, {useState} from "react";

import {ViewConfig} from "@vaadin/hilla-file-router/types.js";
import mapImg from "./img/map.jpg";

export const config: ViewConfig = {
    menu: {
        exclude: true
    },
};

export default function MainView() {
    const [selectedCheckboxes, setSelectedCheckboxes] = useState<string[]>([]);

    const handleCheckboxChange = (event: React.ChangeEvent<HTMLInputElement>, value: string) => {
        if (event.target.checked) {
            // Add the value to the selectedCheckboxes array
            setSelectedCheckboxes((prev) => [...prev, value]);
        } else {
            // Remove the value from the selectedCheckboxes array
            setSelectedCheckboxes((prev) => prev.filter((item) => item !== value));
        }
    };

    const e = 1;

    return (
        <main className="p-m">
            <div className="justify-center text-center strong text-2xl font-bold text-orange-600">KMUTT MAP</div>
            
            <div id='container' className="flex">
                <img className="justify-left m-5 h-max w-4/6"  src={mapImg} alt="Map" ></img>
                
            <div id='checkBoxContainer' className='grid'>
                <MultiSelectComboBox label="เลือกสถานที่ที่ต้องการจะแวะ"
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
                        { label: '● N20 อาคารเรียนรวม 1 (Classroom Building 1)' }
                    ]}
                    style={{maxWidth: '600px', minWidth: '300px', width: '100%'}}/>
                </div>

                {/* <CheckboxGroup theme="vertical" label="เลือกสถานที่ที่ต้องการจะแวะ" style={{ whiteSpace: "pre-line" }}>
                    <Checkbox value={"S1"} label="S1 อาคารวิศวกรรมเครื่องกล 4 (Mechanical Engineering Building 4)"/>
                    <Checkbox value={"S2"} label="S2 อาคารจอดรถ (Car Parking Building)" />
                    <Checkbox value={"S3"} label={"S3 อาคารสถาบันนวัตกรรมการเรียนรู้เฉลิมพระเกียรติ 80 พรรษา มูลนิธิไทยคม \n(Innovation Learning Institute of 80 Year Commemoration of King Rama IX) \nรร.ดรุณสิกขาลัย (Darunsikkhalai School For Innovative Learning)"} />
                    <Checkbox value={"S4"} label={"S4 อาคารวิศววัฒนะ (Engineering Building : Wissawa Wattana Building) \nวิศวกรรมหล่อโลหะ (Foundry Engineering Laboratory) \nวิศวกรรมแม่พิมพ์ขึ้นรูป (Metal Forming Engineering Laboratory) \nวิศวกรรมโยธาและโลจิสติกส์ (Civil and Logistics Engineering Laboratory) \nวิศวกรรมเครื่องกล (Mechanical Engineering Laboratory) \nวิศวกรรมอุตสาหการ, วิศวกรรมเครื่องมือและวัสดุ, วิศวกรรมคอมพิวเตอร์ \n(Production Engineering, Tools and Materials Engineering, \nComputer Engineering Laboratory)"} />
                    <Checkbox value={"S5"} label={"S5 บ้านธรรมรักษา 2 (Dhammaraksa Residence Hall 2 : Male Dormitory)"} />
                    <Checkbox value={"S6"} label={"S6 บ้านธรรมรักษา 1 (Dhammaraksa Residence Hall 1 : Male Dormitory)"} />
                    <Checkbox value={"S7"} label={"S7 อาคารพัฒนาเด็กเล็ก มจธ. (KMUTT Child Development Building)"} />
                    <Checkbox value={"S8"} label={"S8 อาคารโรงประลองเทคโนโลยีและวัสดุ \n(Technology and Materials Workshop Building)"} />
                    <Checkbox value={"S9"} label={"S9 อาคารเรียนและปฏิบัติการคณะพลังงาน สิ่งแวดล้อมและวัสดุ\n(School of Energy Environment and Materials Building)"} />
                    <Checkbox value={"S10"} label={"S10 อาคารสังคมสีเขียว มจธ. (KMUTT Green Society Building)"} />
                    <Checkbox value={"S11"} label={"S11 อาคารเรียนรวม 5 (Classroom Building 5)"} />
                    <Checkbox value={"S12"} label={"S12 อาคารเรียนรวม 4 (Classroom Building 4)"} />
                    <Checkbox value={"S13"} label={"S13 อาคารเรียนรวม 3 (Classroom Building 3)"} />
                    <Checkbox value={"S14"} label={"S14 อาคารพระจอมเกล้าราชานุสรณ์ 190 ปี \n(King Mongkuts 190th Anniversary Memorial Building)"} />
                    <Checkbox value={"S15"} label={"S15 อาคารภาควิชาวิศวกรรมเคมี \n(Department of Chemical Engineering Building)"} />
                    <Checkbox value={"N1"} label={"N1 อาคารศูนย์ต้อนรับ (Welcome Center Building)"} />
                    <Checkbox value={"N2"} label={"N2 อาคารสำนักงานอธิการบดี (Office of The President Building)"} />
                    <Checkbox value={"N3"} label={"N3 อาคารภาควิชาเคมี (Department of Chemistry Building)"} />
                    <Checkbox value={"N4"} label={"N4 อาคารภาควิชาฟิสิกส์ - คณิตศาสตร์ \n(Department of Physics - Mathematics Building)"} />
                    <Checkbox value={"N5"} label={"N5 อาคารศูนย์เครื่องมือวิทยาศาสตร์เพื่อมาตรฐานและอุตสหกรรม \n(Scientific Instrument Center for Standards and Industry Building)"} />
                    <Checkbox value={"N6"} label={"N6 อาคารภาควิชาจุลชีววิทยา (Department of Microbiology Building)"} />
                    <Checkbox value={"N7"} label={"N7 อาคารปฏิบัติการพื้นฐานทางวิทยาศาสตร์ \n(Fundamental Science Laboratory Building)"} />
                    <Checkbox value={"N8"} label={"N8 สถานีสูบน้ำ (Water Pump Building)"} />
                    <Checkbox value={"N9"} label={"N9 อาคารสถาบันวิทยาการหุ่นยนต์ภาคสนาม \n(Institute of Field Robotics Building)"} />
                    <Checkbox value={"N10"} label={"N10 อาคารสำนักหอสมุด (KMUTT Library Building)"} />
                    <Checkbox value={"N11"} label={"N11 อาคารคณะเทคโนโลยีสารสนเทศ \n(School of Information Technology Building)"} />
                    <Checkbox value={"N12"} label={"N12 อาคารอเนกประสงค์ (Utility Exchange Building)"} />
                    <Checkbox value={"N13"} label={"N13 อาคาร Workshop & Greenhouse (Workshop & Greenhouse Building)"} />
                    <Checkbox value={"N14"} label={"N14 อาคารไฟฟ้าแรงสูง (Hi - Voltage Building)"} />
                    <Checkbox value={"N15"} label={"N15 อาคารเรียนและปฏิบัติทางศิลปศาสตร์ (School of Liberal Arts Building)"} />
                    <Checkbox value={"N16"} label={"N16 อาคารการเรียนรู้พหุวิทยาการ (Learning Exchange Building)"} />
                    <Checkbox value={"N17"} label={"N17 อาคารเรียนรวม 2 (Classroom Building 2)"} />
                    <Checkbox value={"N18"} label={"N18 อาคารปฏิบัติการทางวิศวกรรมอุตสาหการ 4 \n(Production Engineering Laboratory Building 4)"} />
                    <Checkbox value={"N19"} label={"N19 อาคารปฏิบัติการทางวิศวกรรมอุตสาหการ 5 \n(Production Engineering Laboratory Building 5)"} />
                    <Checkbox value={"N20"} label={"N20 อาคารเรียนรวม 1 (Classroom Building 1)"}/>
                </CheckboxGroup> */}
                
            </div>
        </main>
    );
}