# E-MailGeneration Application System

# Program Details

A company has different types of customers, like Business, Returning, Frequent, New and VIP.
The management of the company needs to send customer specific emails to their customers. They
would need to have an application that generates emails from a base template for different types of
customers.

• How is the flexibility, of your implementation. e.g., how you add or remove in future new types?

    This application creates and sends out appropriate emails to a specific type of customer at runtime
    based on the customer type.Simple implementation the Main.java file demonstrates specific customers
    added to each customer type and the factories send out the appropriate email.The company only has to
    mention the type of which customer they required to send the email.If a new type customer is needed,
    is only need to create the concrete creator and concrete customer.  

• How is the simplicity and understandability of your implementation?

    It's a flexibile implementation where different types of the customers implement the customer 
    interface.With the help of the UML.It is easy to follow the code and the implementation of the 
    factory method.The EmailCenter.java file gets the necessary details which are passed into the 
    respective factory which generates or send the appropriate email to customers.

• How you avoided duplicated code?

     Due to the simple implementation I avoided duplicated code by letting the factory method to create
     the required class from the concrete class.

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




