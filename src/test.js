import {clientFamilies, getClientFamilyBySlug, getOperatingSystemFamilyBySlug, operatingSystemFamilies, userAgents} from "./data.js";

console.log("Starting tests...");

/*
 * Test for duplicated user agents.
 */
(() => {
    for( let i = 0; i < userAgents.length; i++ ) {
        for( let k = 0; k < userAgents.length; k++ ) {

            // Don't look at the same object
            if( i === k ) {
                continue;
            }

            if( userAgents[i].id === userAgents[k].id ) {
                throw new Error(`Found duplicated user agent key "${userAgents[i].id}" (${i} vs ${k}).`)
            }

        }
    }
})();

(() => {
    const sorted = userAgents.slice().sort(( a, b ) => a.id.localeCompare(b.id));
    if( JSON.stringify(userAgents) !== JSON.stringify(sorted) ) {
        throw new Error("The list of user agents doesn't seem to be sorted.")
    }
})();

/*
 * Test user agents have valid property data.
 */
(() => {
    for( let i = 0; i < userAgents.length; i++ ) {
        const userAgent = userAgents[i];

        if( userAgent.id !== userAgent.id.toLowerCase() ) {
            throw Error(`User agent "${userAgent.id}" is not in lower case".`)
        }

        if( getClientFamilyBySlug(userAgent.client_family) === undefined ) {
            throw Error(`User agent "${userAgent.id}" has invalid client family "${userAgent.client_family}".`)
        }

        if( getOperatingSystemFamilyBySlug(userAgent.os_family) === undefined ) {
            throw Error(`User agent "${userAgent.id}" has invalid operating system family "${userAgent.os_family}".`)
        }

    }
})();

/*
 * Test that all client families are in order.
 */
(() => {
    for( let i = 0; i < clientFamilies.length; i++ ) {
        if( clientFamilies[i].id !== i ) {
            throw Error(`Client family at index ${i} does not have correct id (${clientFamilies[0].id}).`)
        }
    }
})();

/*
 * Test that all operating system families are in order.
 */
(() => {
    for( let i = 0; i < operatingSystemFamilies.length; i++ ) {
        if( operatingSystemFamilies[i].id !== i ) {
            throw Error(`Operating system family at index ${i} does not have correct id (${operatingSystemFamilies[0].id}).`)
        }
    }
})();

console.log("Tests done.");
