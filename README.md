# PageviewsOnline User Agent Lookup Table

This repository contains a normalized, curated dataset of user agent strings, stored as JSON files and designed to be used
as a lookup table in order to derive simple user agent data, such as the user agent client and operating system.

It is used as a component of
[PageviewsOnline](https://www.pageviews.online/?utm_source=lookup-github-repo&utm_medium=link&utm_campaign=readme),
but is published here for general-purpose use.

The dataset is complemented by simple helper scripts to validate the data and export it into other formats or programming
languages (such as Java).





## Project Philosophy

The goal of this project is **not** to provide a foolproof or perfectly accurate user-agent detection system,
but rather a **practical, best-effort solution** that improves over time through real-world usage and
community contributions.

User agent detection is inherently imperfect. Instead of chasing complete accuracy, this project focuses on being:

- Practical
- Maintainable
- Transparent
- Good enough for real-world analytics and classification

Accuracy improves over time through curated updates, real-world usage, and community contributions.

Heuristic parsing and complex regular expressions often trade predictability for marginal accuracy gains.

This project favors:

- Transparency over magic
- Curated data over opaque logic
- Explainable results over speculative detection



## Features

- Normalized, human-reviewed user agent dataset
- Simple and predictable lookup behavior
- JSON-based format, easy to inspect and version-control
- Lightweight validation scripts
- Export helpers for other languages (e.g. Java)
- Actively used in a production SaaS environment



## Normalized User Agent Strings

The primary goal of this project is to extract high-level, stable information from user agent strings in a fast and predictable way.

To support this, each user agent string is normalized before processing. Normalization removes unstable variation (such as version
numbers and casing differences) while preserving the structural and semantic meaning of the user agent.

User agent strings are normalized using the following steps:

1) Replace all numeric digits (`0-9`) with the placeholder character `x`
This removes noise caused by version changes while preserving token structure and length.

2) Convert the entire string to lowercase
User agent tokens are case-insensitive by convention, and lowercasing ensures consistent and reliable lookups.


For example, the following user agent string:

```
Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36
```

Is normalized to:

```
mozilla/x.x (windows nt xx.x; winxx; xxx) applewebkit/xxx.xx (khtml, like gecko) chrome/xxx.x.x.x safari/xxx.xx
```

This normalization approach makes user agents easier to group, compare, and maintain over time, while remaining sufficiently accurate
for high-level client and operating system classification.

By eliminating version-specific and case-related variability, the lookup process becomes more predictable and resilient to future user
agent changes.





## Data Format

Each normalized user agent entry includes:

- `id` - The normalized user agent string
- `client_family` - High-level client classification (e.g. browser, bot, app)
- `os_family` - High-level operating system classification

Exact fields may evolve over time as the dataset grows.





## Lookup Behavior

User agent matching is performed against normalized strings.

Exact matches are preferred; partial or heuristic matching is intentionally avoided to keep behavior predictable and
debuggable.





## Contributing

Contributions are very welcome and help improve the overall quality and accuracy of this project.

The most impactful way to contribute is by adding or updating normalized user agent entries in the `user_agents.json` file,
along with any relevant classification data.

Once your changes are ready, please submit a pull request containing the necessary data and/or code updates.

Even partial or incomplete information is useful and appreciated - every contribution helps improve coverage and long-term
reliability.





## Getting Started (Quick Guide)

The core of this project is the set of JSON data files, located in the `data/` directory.

To help maintain and reuse this data, the repository includes a small set of simple Node.js scripts that perform basic validation
and export tasks.

Common available commands:

- `npm run test` - Validates the JSON data and checks for structural or consistency errors.
- `npm run build` - Builds, sorts and exports the normalized data into other programming language formats (such as Java) for easier integration.

These tools are intentionally minimal, focusing on data correctness and portability rather than complex processing.




## User-Agent Strings Are Not Reliable

Deriving accurate information from user-agent strings is inherently unreliable for several reasons:

- There is **no formal standard or specification** governing the structure or contents of user-agent strings
- Many user-agents intentionally **spoof or imitate** other user-agents for compatibility and legacy reasons

Because of this, it is extremely difficult to determine user-agent data in a fully accurate and consistent way.

This library should therefore be viewed as a **best-effort solution**, not a source of guaranteed or authoritative
truth.

With continued usage and community contributions, accuracy can improve over time.





## Versioning & Stability

The dataset may change over time as user agents evolve.

Classifications are not considered breaking changes, even between minor versions.

Consumers should treat results as best-effort hints, not contractual guarantees.





## License

This project and its data are released under the
[Apache License 2.0 (Apache-2.0)](https://www.tldrlegal.com/license/apache-license-2-0-apache-2-0).

Commercial use, modification, and redistribution are permitted.

Contributions are welcome and appreciated.





## Trademark

PageviewsOnline, Two-Dot-Oh, and any associated logos, service names, or branding are trademarks of Two-Dot-Oh.

This project is open source; however, use of the PageviewsOnline name or any associated branding in connection
with a product, service, or offering is not permitted without prior written consent.

Forks and derivative works must use a different name and branding and must not imply endorsement by or affiliation
with PageviewsOnline or Two-Dot-Oh.
