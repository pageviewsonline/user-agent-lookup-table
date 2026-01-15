import {clientFamilies, operatingSystemFamilies, userAgents} from "./data.js";
import {getSourceCodeHeaderComment, writeFile} from "./utils.js";

function createEnumName( s ) {
    return s.toUpperCase().replaceAll("-", "_");
}

function exportUserAgentsDatabase() {

    let code = "";
    code += `package online.pageviews.useragentlookup;\n`;
    code += '\n';
    code += 'import java.util.HashMap;\n';
    code += 'import java.util.Map;\n';
    code += '\n';
    code += getSourceCodeHeaderComment();
    code += '\n';
    code += `public abstract class UserAgentsDatabase {\n`;
    code += '\n';
    code += '    public static final Map<String, UserAgentData> agents = new HashMap<>();\n';
    code += '\n';
    code += '    public static UserAgentData get(String originalUserAgent) {\n';
    code += '\n';
    code += '        String normalizedUserAgent = normalize(originalUserAgent);\n';
    code += '\n';
    code += '        return agents.get(normalizedUserAgent);\n';
    code += '\n';
    code += '    }\n';
    code += '\n';
    code += '    public static String normalize(String originalUserAgent) {\n';
    code += '\n';
    code += '        String normalizedUserAgent = originalUserAgent.replaceAll("\\\\d", "x");\n';
    code += '        normalizedUserAgent = normalizedUserAgent.toLowerCase();\n';
    code += '\n';
    code += '        return normalizedUserAgent;\n';
    code += '\n';
    code += '    }\n';
    code += '\n';
    code += '    static {\n';
    for( const ua of userAgents ) {
        code += `        agents.put("${ua.id}", new UserAgentData(ClientFamily.${createEnumName(ua.client_family)}, OperatingSystemFamily.${createEnumName(ua.os_family)}));\n`;
    }
    code += '    }\n';
    code += '\n';
    code += '}\n';
    code += '\n';

    writeFile("exported/java/UserAgentsDatabase.java", code);

}

function exportClientFamilies() {

    let code = "";
    code += `package online.pageviews.useragentlookup;\n`;
    code += '\n';
    code += getSourceCodeHeaderComment();
    code += '\n';
    code += `public enum ClientFamily {\n`;
    code += '\n';
    for( let i = 0; i < clientFamilies.length; i++ ) {
        const osf = clientFamilies[i];
        const delimiter = (i + 1) < clientFamilies.length ? "," : ";";
        code += `    ${createEnumName(osf.slug)}(${osf.id}, "${osf.slug}", "${osf.name}", "${osf.url}")${delimiter}\n`;
    }
    code += '\n';
    code += '    public static ClientFamily create(int id) throws UnknownClientFamilyException {\n';
    code += '       for (ClientFamily mode : ClientFamily.values()) {\n';
    code += '           if (mode.id == id) {\n';
    code += '               return mode;\n';
    code += '           }\n';
    code += '        }\n';
    code += '        throw new UnknownClientFamilyException(id);\n';
    code += '    }\n';
    code += '\n';
    code += '    private final int id;\n';
    code += '    private final String slug;\n';
    code += '    private final String name;\n';
    code += '    private final String url;\n';
    code += '\n';
    code += '    ClientFamily(int id, String slug, String name, String url) {\n';
    code += '        this.id = id;\n';
    code += '        this.slug = slug;\n';
    code += '        this.name = name;\n';
    code += '        this.url = url;\n';
    code += '    }\n';
    code += '\n';
    code += '    public int getID() {\n';
    code += '        return this.id;\n';
    code += '    }\n';
    code += '\n';
    code += '    public String getSlug() {\n';
    code += '        return this.slug;\n';
    code += '    }\n';
    code += '\n';
    code += '    public String getName() {\n';
    code += '        return this.name;\n';
    code += '    }\n';
    code += '\n';
    code += '    public String getURL() {\n';
    code += '        return this.url;\n';
    code += '    }\n';
    code += '\n';
    code += '}\n';

    writeFile("exported/java/ClientFamily.java", code);

}

function exportOperatingSystemFamilies() {

    let code = "";
    code += `package online.pageviews.useragentlookup;\n`;
    code += '\n';
    code += getSourceCodeHeaderComment();
    code += '\n';
    code += `public enum OperatingSystemFamily {\n`;
    code += '\n';
    for( let i = 0; i < operatingSystemFamilies.length; i++ ) {
        const osf = operatingSystemFamilies[i];
        const delimiter = (i + 1) < operatingSystemFamilies.length ? "," : ";";
        code += `    ${createEnumName(osf.slug)}(${osf.id}, "${osf.slug}", "${osf.name}", "${osf.url}")${delimiter}\n`;
    }
    code += '\n';
    code += '    public static OperatingSystemFamily create(int id) throws UnknownOperatingSystemException {\n';
    code += '        for (OperatingSystemFamily mode : OperatingSystemFamily.values()) {\n';
    code += '            if (mode.id == id) {\n';
    code += '                return mode;\n';
    code += '            }\n';
    code += '        }\n';
    code += '        throw new UnknownOperatingSystemException(id);\n';
    code += '    }\n';
    code += '\n';
    code += '    private final int id;\n';
    code += '    private final String slug;\n';
    code += '    private final String name;\n';
    code += '    private final String url;\n';
    code += '\n';
    code += '    OperatingSystemFamily(int id, String slug, String name, String url) {\n';
    code += '        this.id = id;\n';
    code += '        this.slug = slug;\n';
    code += '        this.name = name;\n';
    code += '        this.url = url;\n';
    code += '    }\n';
    code += '\n';
    code += '    public int getID() {\n';
    code += '        return this.id;\n';
    code += '    }\n';
    code += '\n';
    code += '    public String getSlug() {\n';
    code += '        return this.slug;\n';
    code += '    }\n';
    code += '\n';
    code += '    public String getName() {\n';
    code += '        return this.name;\n';
    code += '    }\n';
    code += '\n';
    code += '    public String getURL() {\n';
    code += '        return this.url;\n';
    code += '    }\n';
    code += '\n';
    code += '}\n';

    writeFile("exported/java/OperatingSystemFamily.java", code);
}

function exportUnknownOperatingSystemException() {

    let code = "";
    code += `package online.pageviews.useragentlookup;\n`;
    code += '\n';
    code += getSourceCodeHeaderComment();
    code += '\n';
    code += 'public class UnknownOperatingSystemException extends Exception {\n';
    code += '\n';
    code += '    public UnknownOperatingSystemException(int id) {\n';
    code += '        super("Unknown operating system family \\"" + id + "\\".");\n';
    code += '    }\n';
    code += '\n';
    code += '}\n';

    writeFile("exported/java/UnknownOperatingSystemException.java", code);
}

function exportUnknownClientFamilyException() {

    let code = "";
    code += `package online.pageviews.useragentlookup;\n`;
    code += '\n';
    code += getSourceCodeHeaderComment();
    code += '\n';
    code += 'public class UnknownClientFamilyException extends Exception {\n';
    code += '\n';
    code += '    public UnknownClientFamilyException(int id) {\n';
    code += '        super("Unknown client family \\"" + id + "\\".");\n';
    code += '    }\n';
    code += '\n';
    code += '}\n';

    writeFile("exported/java/UnknownClientFamilyException.java", code);
}

function exportUserAgentData() {

    let code = "";
    code += `package online.pageviews.useragentlookup;\n`;
    code += '\n';
    code += getSourceCodeHeaderComment();
    code += '\n';
    code += 'public class UserAgentData {\n';
    code += '\n';
    code += '    private final ClientFamily client;\n';
    code += '    private final OperatingSystemFamily operatingSystem;\n';
    code += '\n';
    code += '    public UserAgentData(ClientFamily client, OperatingSystemFamily operatingSystem) {\n';
    code += '        this.client = client;\n';
    code += '        this.operatingSystem = operatingSystem;\n';
    code += '    }\n';
    code += '\n';
    code += '    public ClientFamily getClient() {\n';
    code += '      return this.client;\n';
    code += '    }\n';
    code += '\n';
    code += '    public OperatingSystemFamily getOperatingSystem() {\n';
    code += '        return this.operatingSystem;\n';
    code += '    }\n';
    code += '\n';
    code += '    @Override\n';
    code += '    public String toString() {\n';
    code += '        return "[client=" + client.getName() + " os=" + operatingSystem.getName() + "]";\n';
    code += '    }\n';
    code += '\n';
    code += '}\n';

    writeFile("exported/java/UserAgentData.java", code);
}

/*
 * Init
 */

console.log("Starting Java export...")

exportUserAgentsDatabase();
exportClientFamilies();
exportOperatingSystemFamilies();
exportUnknownOperatingSystemException();
exportUnknownClientFamilyException();
exportUserAgentData();

console.log("Java export done.")