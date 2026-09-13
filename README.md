# PageviewsOnline User Agent Lookup Table

This repository contains a normalized, curated dataset of user agent strings, stored as JSON files and designed to be used
as a lookup table to derive simple user agent data, such as the client and operating system.

It is used as a component of
[PageviewsOnline Site Analytics](https://www.pageviews.online/?utm_source=lookup-github-repo&utm_medium=link&utm_campaign=readme),
but is published here for general-purpose use.

The dataset is complemented by simple helper scripts that validate the data and export it to other programming languages
(currently Java).


## Features

- Normalized, human-reviewed user agent dataset
- Simple and predictable lookup behavior
- JSON-based format, easy to inspect and version-control
- Lightweight validation scripts
- Export helpers for other languages (e.g. Java)
- Actively used in a production SaaS environment


## Getting Started

The core of this project is the set of JSON data files in the `data/` directory. A small set of Node.js scripts
(no dependencies) validates the data and exports it:

- `npm run test` - Validates the JSON data and checks for structural or consistency errors.
- `npm run build` - Sorts the user agents, validates the data and exports it to all supported languages.
- `npm run export:java` - Exports the Java sources only, without sorting or validating.

These tools are intentionally minimal, focusing on data correctness and portability rather than complex processing.

### Using the Java export

The generated Java sources are in `exported/java/` (package `online.pageviews.useragentlookup`) and can be copied into
your project as-is:

```java
import online.pageviews.useragentlookup.*;

UserAgentData data = UserAgentsDatabase.get(userAgentHeader); // userAgentHeader must not be null

if (data == null) {
    // User agent is not in the dataset
} else if (data.getClient().getType() == ClientFamilyType.BOT) {
    // Bot traffic
} else {
    String client = data.getClient().getName();          // e.g. "Google Chrome"
    String os = data.getOperatingSystem().getName();     // e.g. "Windows"
}
```

`ClientFamily`, `ClientFamilyType` and `OperatingSystemFamily` are enums. Each has a numeric id that can be stored
and turned back into the enum with `create(int id)`.


## Normalized User Agent Strings

The primary goal of this project is to extract high-level, stable information from user agent strings in a fast and
predictable way.

To support this, each user agent string is normalized before lookup. Normalization removes unstable variation (such as
version numbers and casing differences) while preserving the structural and semantic meaning of the user agent.

User agent strings are normalized using the following steps, in this order:

1. Remove all double quote characters (`"`).
   Some clients and proxies wrap the user agent in quotes; they carry no meaning.
2. Replace all numeric digits (`0-9`) with the placeholder character `x`.
   This removes noise caused by version changes while preserving token structure and length.
3. Convert the entire string to lowercase.
   User agent tokens are case-insensitive by convention, and lowercasing ensures consistent and reliable lookups.

For example, the following user agent string:

```
Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36
```

is normalized to:

```
mozilla/x.x (windows nt xx.x; winxx; xxx) applewebkit/xxx.xx (khtml, like gecko) chrome/xxx.x.x.x safari/xxx.xx
```

This makes user agents easier to group, compare, and maintain over time, while remaining sufficiently accurate for
high-level client and operating system classification, and resilient to future version changes.


## Lookup Behavior

User agent matching is performed against normalized strings, and only exact matches count. There is intentionally no
partial or heuristic matching: a user agent that is not in the dataset returns no result (`null` in Java). This keeps
behavior predictable and debuggable.


## Data Format

The data is split into four files that reference each other by `slug`, like tables in a relational database:

| File | Contents |
|---|---|
| `data/user_agents.json` | Normalized user agents: `id` (the normalized string), `client_family` and `os_family` |
| `data/client_families.json` | Clients such as `chrome` or `googlebot`: `id`, `slug`, `type`, `name`, `url` |
| `data/client_family_types.json` | Client categories: `unknown`, `app`, `bot`, `webview`, `browser` |
| `data/operating_system_families.json` | Operating systems such as `android` or `windows`: `id`, `slug`, `name`, `url` |

Exact fields may evolve over time as the dataset grows.


## Project Philosophy

The goal of this project is not to provide a foolproof or perfectly accurate user agent detection system, but rather a
practical, best-effort solution that improves over time through real-world usage and community contributions.

User agent detection is inherently imperfect:

- There is **no formal standard or specification** governing the structure or contents of user agent strings
- Many user agents intentionally **spoof or imitate** other user agents for compatibility and legacy reasons

Instead of chasing complete accuracy, this project focuses on being:

- Practical
- Maintainable
- Transparent
- Good enough for real-world analytics and classification

Heuristic parsing and complex regular expressions often trade predictability for marginal accuracy gains.
This project favors:

- Transparency over magic
- Curated data over opaque logic
- Explainable results over speculative detection

The dataset should therefore be viewed as a **best-effort solution**, not a source of guaranteed or authoritative truth.


## Contributing

Contributions are very welcome and help improve the overall quality and accuracy of this project.

The most impactful way to contribute is by adding or updating user agent entries:

1. Normalize the user agent string (see [Normalized User Agent Strings](#normalized-user-agent-strings)) and add it to
   `data/user_agents.json`.
2. Use an existing client family and operating system family. If none fits, append a new entry to the end of
   `data/client_families.json` or `data/operating_system_families.json` with the next free `id`.
3. Run `npm run build` to sort the data, validate it and regenerate the exported sources.
4. Submit a pull request with the data and/or code changes.

Even partial or incomplete information is useful and appreciated - every contribution helps improve coverage and
long-term reliability.


## Versioning & Stability

The dataset may change over time as user agents evolve.

Classifications are not considered breaking changes, even between minor versions. Consumers should treat results as
best-effort hints, not contractual guarantees.

Family and type ids are permanent: entries are only ever appended, so an id is never renumbered or reused. Stored ids
can safely be turned back into enums later.


## License

This project and its data are released under the Apache License 2.0 - see [LICENSE](LICENSE)
([plain-language summary](https://www.tldrlegal.com/license/apache-license-2-0-apache-2-0)).

Commercial use, modification, and redistribution are permitted.


## Trademark

PageviewsOnline, Two-Dot-Oh, and any associated logos, service names, or branding are trademarks of Two-Dot-Oh.

This project is open source; however, use of the PageviewsOnline name or any associated branding in connection
with a product, service, or offering is not permitted without prior written consent.

Forks and derivative works must use a different name and branding and must not imply endorsement by or affiliation
with PageviewsOnline or Two-Dot-Oh.
