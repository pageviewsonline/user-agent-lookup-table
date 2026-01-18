package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-18T13:20:01.329Z.
 */

public class UnknownOperatingSystemException extends Exception {

    public UnknownOperatingSystemException(int id) {
        super("Unknown operating system family \"" + id + "\".");
    }

}
