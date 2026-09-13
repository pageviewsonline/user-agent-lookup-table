import {clientFamilies, clientFamilyTypes, getClientFamilyBySlug, getClientFamilyTypeBySlug, getOperatingSystemFamilyBySlug, operatingSystemFamilies, userAgents} from "./data.js";

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

/*
 * Test user agents are sorted.
 */
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

        // Normalized user agents must not contain digits (they should be replaced with "x")
        if( /\d/.test(userAgent.id) ) {
            throw Error(`User agent "${userAgent.id}" contains numbers.`)
        }

        if( getClientFamilyBySlug(userAgent.client_family) === undefined ) {
            throw Error(`Invalid client family "${userAgent.client_family}" for user agent "${userAgent.id}".`)
        }

        if( getOperatingSystemFamilyBySlug(userAgent.os_family) === undefined ) {
            throw Error(`Invalid operating system "${userAgent.os_family}" for user agent "${userAgent.id}".`)
        }

    }
})();

/*
 * Test each client family.
 */
(() => {
    for( let i = 0; i < clientFamilies.length; i++ ) {
        const cf = clientFamilies[i];
        if( cf.id !== i ) {
            throw Error(`Client family at index ${i} does not have correct id (${cf.id}).`)
        }
        if( !Object.hasOwn(cf,"url")) {
            throw Error(`Client family  ${cf.name} is missing URL property.`)
        }
        if( getClientFamilyTypeBySlug(cf.type) === undefined ) {
            throw Error(`Invalid client family type "${cf.type}" for client family "${cf.slug}".`)
        }
    }
})();

/*
 * Test each client family type.
 */
(() => {
    for( let i = 0; i < clientFamilyTypes.length; i++ ) {
        const cft = clientFamilyTypes[i];
        if( cft.id !== i ) {
            throw Error(`Client family type at index ${i} does not have correct id (${cft.id}).`)
        }
    }
})();

/*
 *  Test each operating system family.
 */
(() => {
    for( let i = 0; i < operatingSystemFamilies.length; i++ ) {
        const os = operatingSystemFamilies[i]
        if( os.id !== i ) {
            throw Error(`Operating system family at index ${i} does not have correct id (${os.id}).`)
        }
        if( !Object.hasOwn(os,"url")) {
            throw Error(`Operating system ${os.name} is missing URL property.`)
        }
    }
})();

console.log("Tests done.");
