package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-09-13T07:47:54.635Z.
 */

public class UnknownClientFamilyException extends Exception {

    public UnknownClientFamilyException(int id) {
        super("Unknown client family \"" + id + "\".");
    }

}
