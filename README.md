## Fifth Assignment HTML Parser: **Embarking on a Global Parsing Adventure** ️

**Greetings, fellow explorers!**  This project beckons you to embark on a captivating journey into the realm of HTML parsing using Java and JSoup.  Prepare to unlock the secrets hidden within a web page brimming with details about the fascinating world's diverse countries, meticulously categorized by population, area, and alphabetical order.   Let's delve deeper and unravel the intricacies of this exciting pursuit!

## Prerequisites ✅

**To embark on this enriching exploration, you'll require a few essential tools:**

* **Java 17 or later:**  [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
* **Git version control system:** [https://git-scm.com/downloads](https://git-scm.com/downloads)
* **Gradle build tool (version 7.6+ recommended):** [https://gradle.org/install/](https://gradle.org/install/)

## Objectives 

**Our central mission entails:**

* Parsing a well-structured HTML file containing details of approximately 150 countries.
* Extracting valuable data such as population, area, and potentially other pertinent country attributes.
* Constructing robust Java classes to represent countries with relevant information.
* Leveraging the JSoup library to navigate the intricacies of the HTML structure.
* Employing sophisticated sorting algorithms for a structured approach:
    - Population (ascending or descending)
    - Area (ascending or descending)
    - Alphabetical order (by country name)
* Presenting the sorted country information in a lucid and well-organized format.

## Tasks 

**Let's embark on a step-by-step approach to conquer this challenge:**

1. **Project Setup:**
    - clone this repository into your own computer.
    - open the project in intellij.

3. **JSoup Dependency:**
    - Integrate the JSoup dependency into your `build.gradle` file:

<br>

    ```gradle
    dependencies {
      testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
      testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
      implementation 'org.jsoup:jsoup:1.14.3'
    }
    ```

4. **Country Class:**
    - Develop a Java class named `Country` with attributes to encapsulate country data:
        - Name (String)
        - Population (long)
        - Area (double) - Consider adding units (e.g., square kilometers)
        - (Optional) Other relevant country attributes

5. **HTML Parsing with JSoup:**
    - Utilize JSoup's `parse()` method to convert the HTML file into a JSoup `Document` object.
    - Navigate the HTML structure using selector methods (e.g., `select()`, `getElementsByTag()`) to locate elements containing country information.
    - Extract pertinent data and populate your `Country` objects.

6. **Sorting:**
    - Implement sorting algorithms (e.g., quicksort, mergesort) for various criteria or you can utilize java's built in sort:
        - Population (ascending or descending)
        - Area (ascending or descending)
        - Alphabetical order (by country name) - Use `String.compareTo()` or similar methods
    - Create helper methods or classes for handling sorting logic.

7. **Displaying Results:**
    - Present the sorted country information in a clear and well-organized format, potentially using:
        - System.out (`System.out.println()`) for simple text output
        - A data visualization library (e.g., JavaFX) for rich graphical displays

## Evaluation 

**Your triumph will be assessed based on:**

- The functionality of your code: effectively parsing the HTML, creating `Country` objects, and sorting data.
- Readability and maintainability of your code (clear variable names, proper formatting).
- Efficiency of your sorting algorithms for handling a large dataset of countries.
- Clarity and user-friendliness of the output format.

## Bonus Objectives (For the Audacious Explorer)

**To elevate your project to even greater heights:**

- Enhance your application by fetching country data directly from a live website using Java's URL connection capabilities (i will include the link for the website down in the resources section).
- Expand data extraction to other websites that you may find interesting (you can scrape only one more website).
- Develop a user interface for interactive querying and sorting of country data i.e. you can make a menu for the user to ask your program a rank in certain criteria and recieve the appropriate country.

## Submission 

**Share your triumphant code with the world!**

1. Add your mentor to your project as a contributer first so that by the time your project is done and dusted you can assign a pull request to them.
2. Make a new branch called `develop` and implement the features there.
3. Employ Git to regularly commit your code advancements.
4. Push your code to the remote repository that you forked for evaluation.
5. make a pull request inorder for the `develop` branch to be merged with `main`

## Resources 
