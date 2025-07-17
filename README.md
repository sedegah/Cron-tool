#  Cron Tool

A simple Java CLI utility that converts natural language scheduling expressions (like “Every Monday at 5pm”) into cron expressions. It also explains the cron expression and shows the next few run times.

---

##  Features

- Parse natural language into cron expressions
- Explain cron syntax in plain English
- Show next N execution times
- Supports UNIX-style cron

---

##  Requirements

- Java 17+
- Maven 3.6+

---

##  Project Structure

```

cron-tool/
├── src/
│   └── main/java/cron/
│       ├── Main.java
│       ├── CronParser.java
│       ├── CronExplainer.java
│       └── CronValidator.java
├── pom.xml
└── README.md

````

---

## 🔧 Build Instructions

1. **Clone or download** the repository:

```bash
git clone <https://github.com/sedegah/Cron-tool>
cd cron-tool
````

2. **Build the fat JAR (with dependencies included):**

```bash
mvn clean package
```

You’ll find the generated JAR in `target/cron-tool-1.0-shaded.jar`.

---

##  Run the Tool

```bash
java -jar target/cron-tool-1.0-shaded.jar
```

You’ll be prompted to enter a natural language scheduling command.

---

## Example

```bash
Enter command (e.g., 'Run every Monday at 5pm'):
Every 15 minutes on weekdays

Generated Cron: */15 * * * 1-5
Explanation: every 15 minutes
- 2025-07-17T10:45Z[Atlantic/Reykjavik]
- 2025-07-17T11:00Z[Atlantic/Reykjavik]
- 2025-07-17T11:15Z[Atlantic/Reykjavik]
```

---

## Notes

* The output time zone is based on your system settings.
* Cron format used: **UNIX**

---

## Credits

* Uses [cron-utils](https://github.com/jmrozanec/cron-utils) for parsing and explanation

---

##  License

MIT — free to use, modify, and distribute.

