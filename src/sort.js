import {userAgents} from "./data.js";
import {writeFile} from "./utils.js";

/*
 * Sort
 */

(() => {
    console.log("Sorting list of user agents...")
    userAgents.sort(( a, b ) => a.id.localeCompare(b.id));
    writeFile("data/user_agents.json", JSON.stringify(userAgents, undefined, '    '));
})();
