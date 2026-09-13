import fs from "node:fs";

export const userAgents = readUserAgents();
export const clientFamilies = readClientFamilies();
export const clientFamilyTypes = readClientFamilyTypes();
export const operatingSystemFamilies = readOperatingSystemFamilies();

export function readUserAgents() {
    const data = fs.readFileSync("data/user_agents.json", "utf8");
    return JSON.parse(data);
}

function readClientFamilies() {
    const data = fs.readFileSync("data/client_families.json", "utf8");
    return JSON.parse(data);
}

function readClientFamilyTypes() {
    const data = fs.readFileSync("data/client_family_types.json", "utf8");
    return JSON.parse(data);
}

function readOperatingSystemFamilies() {
    const data = fs.readFileSync("data/operating_system_families.json", "utf8");
    return JSON.parse(data);
}

export function getClientFamilyBySlug( slug ) {
    for( const cf of clientFamilies ) {
        if( slug === cf.slug ) {
            return cf;
        }
    }
    return undefined;
}

export function getClientFamilyTypeBySlug( slug ) {
    for( const cft of clientFamilyTypes ) {
        if( slug === cft.slug ) {
            return cft;
        }
    }
    return undefined;
}

export function getOperatingSystemFamilyBySlug( slug ) {
    for( const osf of operatingSystemFamilies ) {
        if( slug === osf.slug ) {
            return osf;
        }
    }
    return undefined;
}