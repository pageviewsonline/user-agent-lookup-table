package online.pageviews.useragentlookup;

/*
 * PageviewsOnline User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-10T14:29:37.525Z.
 */

public class UnknownOperatingSystemException extends Exception {

    public UnknownOperatingSystemException(int id) {
        super("Unknown operating system family \"" + id + "\".");
    }

}
