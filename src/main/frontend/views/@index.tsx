// TODO Replace with your own main view.
import React from "react";

import {ViewConfig} from "@vaadin/hilla-file-router/types.js";
import mapImg from "./img/map.jpg";

export const config: ViewConfig = {
    menu: {
        exclude: true
    },
};

export default function MainView() {
    return (
        <main className="p-m">
            <div className="justify-center text-center strong text-2xl font-bold mb-m ">
                KMUTT MAP
            </div>
            <div className="flex justify-center">
                <img src={mapImg} alt="Map" style={{width: "65vw", height: "auto"}}/>
            </div>
        </main>
    );
}