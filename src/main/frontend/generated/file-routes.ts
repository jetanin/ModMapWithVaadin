import { createRoute as createRoute_1 } from "@vaadin/hilla-file-router/runtime.js";
import type { AgnosticRoute as AgnosticRoute_1 } from "@vaadin/hilla-file-router/types.js";
import * as Page_1 from "../views/@index.js";
import * as Page_2 from "../views/history.js";
import * as Page_3 from "../views/Svg.js";
const routes: readonly AgnosticRoute_1[] = [
    createRoute_1("", Page_1),
    createRoute_1("history", Page_2),
    createRoute_1("Svg", Page_3)
];
export default routes;
