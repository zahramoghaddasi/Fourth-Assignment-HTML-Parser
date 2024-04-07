# Fifth Assignment: HTML Parser 🌐

## Introduction

This project delves into the practical application of HTML parsing techniques using Java and the JSoup library. The objective is to extract and manipulate data from a structured HTML document containing information about various countries. Key tasks include parsing the document, creating Java objects to represent the data, sorting the information based on different criteria, and presenting the results effectively.

## Why Learn Web Scraping? 📊

Mastering web scraping empowers individuals and businesses to glean valuable insights, automate tasks, and make informed decisions based on real-time data.

- In e-commerce, web scraping aids in monitoring competitors' prices, tracking product availability, and gathering customer reviews. In finance, it facilitates trend analysis, investment decisions, and risk assessment.

- Research, academia, journalism, and media professionals leverage web scraping for data collection, trend tracking, sentiment analysis, and investigative reporting.

By mastering web scraping, professionals can extract data efficiently, outperform competitors, and drive data-informed success in diverse industries.

## Prerequisites ✅

Before diving into this project, make sure you have the following tools and knowledge:

### Tools Needed:
- **Java 17 or higher** : Download the latest version from [Oracle's Java website](https://www.oracle.com/java/technologies/downloads/).
- **Git** : Install Git, a powerful version control system, from [Git's official website](https://git-scm.com/downloads).
- **Gradle** : Utilize Gradle (recommended version 7.6 or newer) as the build tool. You can find installation instructions [here](https://gradle.org/install/).

### Knowledge Required:
In addition to the tools mentioned above, familiarity with the following topics is crucial for successful project completion:
- **Jsoup** : Understanding how to access, parse, and manipulate HTML files using Jsoup.
- **HTML** : Knowledge of various HTML tags, their purposes, and how to identify and manipulate them using Jsoup.
- **CSS** : Understanding how to style HTML elements, work with CSS classes, and utilize selectors efficiently.

By having a solid grasp of these tools and concepts, you'll be well-equipped to excel in this project. 🚀

## Objectives 🎯

The primary objectives of this assignment are:

- Parsing an HTML file with country data.
- Extracting relevant information such as population, area, and other country attributes.
- Implementing Java classes to represent countries.
- Utilizing JSoup for HTML parsing.
- Applying sorting algorithms for organizing data by population, area, and country name.
- Displaying the sorted country information effectively.

## Tasks 📝

1. **Project Setup:**
    - Clone the repository to your local machine.
    - Open the project in an IDE like IntelliJ.

2. **JSoup Dependency:**
    - Add the JSoup dependency to your `build.gradle` file.

    ```gradle
    dependencies {
      testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
      testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
      implementation 'org.jsoup:jsoup:1.14.3'
    }
    ```

3. **Country Class:**
    - Create a `Country` class in Java to encapsulate country data.

4. **HTML Parsing with JSoup:**
   Utilize JSoup to parse the HTML file and extract relevant data i.e.
    - <span class="country-capital"> = for names of the countries
    - <span class="country-population"> = for population of the countries
    - <span class="country-area"> = for area of the countries
  keep in mind that these span tags are nested in other tags and div closures.

5. **Sorting:**
    - Implement sorting algorithms for various criteria (population, area, name).

6. **Displaying Results:**
    - Present the sorted country information clearly.

## Evaluation 🧐

Your success will be judged based on:

- Functionality of the code in parsing HTML, creating Java objects, and sorting data.
- Readability and maintainability of the code.
- Efficiency of sorting algorithms.
- Clarity of the output format.

## Bonus Objectives (For Advanced Users) 🌟

To enhance your project further:

- Fetch country data from live websites.
- Expand data extraction to additional websites.
- Develop a user interface for interactive querying and sorting.

## Submission 📁

To share your work:

1. Add your mentor as a contributor to the project.
2. Create a `develop` branch for implementing features.
3. Use Git for regular code commits.
4. Push your code to the remote repository.
5. Submit a pull request to merge the `develop` branch with `main`.

## Notes 📝

Here are some important points to keep in mind:

- The unit tests are provided to assist you in understanding the project requirements. Your final grade is not solely dependent on their results; they are meant to aid your learning process.
  
- Feel free to leverage ChatGPT for learning web scraping and resolving any challenges that you may not find solutions to on the internet. Utilize its capabilities to enhance your understanding and overcome obstacles effectively.
**but It is strictly prohibited to use ChatGPT or any other AI generative model for completing any section of this assignment. Failure to comply will result in a score of 0 without any warnings.**
- Your dedication and creative input are valued. Invest time and effort in the project as your hard work will be acknowledged and reflected in your final evaluation. The more effort you exert, the greater your potential for a higher score. Your commitment to the project is key to your success! 🏆✨

If you have any further questions or need clarification, do not hesitate to reach out to your mentor. Good luck with your project! 🌟

## Resources 📚

### Text Based Tutorials:
- [Jsoup Official website](https://jsoup.org/cookbook/)
- [Javatpoint](https://www.javatpoint.com/jsoup-tutorial)
- [Baeldung](https://www.baeldung.com/java-with-jsoup)
