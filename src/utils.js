import fs from "node:fs";

export function writeFile( filename, contents ) {
    console.log(`Writing file "${filename}"...`)
    fs.writeFileSync(filename, contents, "utf8");
}

export function getSourceCodeHeaderComment() {
    let code = "";
    code += '/*\n';
    code += ' * PageviewsOnline Site Analytics User Agent Lookup Table\n';
    code += ' * https://github.com/pageviewsonline/user-agent-lookup-table/\n';
    code += ' *\n';
    code += ` * Generated ${new Date().toISOString()}.\n`;
    code += ' */\n';
    return code;
}