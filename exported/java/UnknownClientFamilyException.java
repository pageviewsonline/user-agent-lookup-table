package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-04-12T08:34:46.130Z.
 */

public class UnknownClientFamilyException extends Exception {

    public UnknownClientFamilyException(int id) {
        super("Unknown client family \"" + id + "\".");
    }

}
