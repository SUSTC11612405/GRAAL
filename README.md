# GRAAL
GRAph ALigner: Algorithm to align two networks or graphs. This implementation is specific for program dependency graph to detect code similarity.

# Updated
# GRAAL(Graph Aligner) Client
Spring MVC app for creating program dependence graphs and aligning program dependence graphs of two different programs.
This app is just an interface for interacting with [GRAAL](https://github.com/kanthkumar46/GRAAL)

# Running the app
* Clone [GRAAL](https://github.com/kanthkumar46/GRAAL) and all its dependencies ([ORCA](https://github.com/kanthkumar46/ORCA) & [Libraries-Support](https://github.com/kanthkumar46/libraries-support))
* Run ***mvn clean install*** on GRAAL and all its dependencies
* Clone this App and run ***mvn clean spring-boot:run***
* Access the app on http://localhost:8080