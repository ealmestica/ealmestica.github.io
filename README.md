# Elijah Almestica ePortfolio

## Professional Self-Assessment

The skill set I have gained throughout the computer science program at SNHU has been critical for advancing my future career and thinking more like a computer scientist when it comes to solving problems. It has given me a sense of direction in what career I would like to pursue. In today's age, there is a world full of complex issues waiting to be solved. This is especially true as one considers the rapid pace of technology. One of the most important skills I learned in my previous courses was collaborating with other peers using Bit Bucket for versioning control. Working together, we developed a Jukebox and calculator app. Version control tools support team communication during software development by allowing team members to add comments as changes are made, and bugs are fixed, communicating to other members what has changed and the purpose. In addition, it allows members to identify who has made specific changes in case follow-up is necessary.

During the jukebox and calculator application project, I performed several code reviews. On the one hand, reviewing other people's work allowed me to see different ways to achieve similar results in the application with the code. At times, it would mean that I would find ways to improve my code, but at other times, it allowed me to point out improvements for my peers. In general, I received positive feedback about my code from my peers, which reassured me that my code was headed in the right direction. They also provided constructive feedback about my annotation formatting, which I decided to implement, considering the collaborative nature of developing an application. I wanted to ensure that comments and information were explicit, transparent, and easily understood by others who would review my code since it is one of the essential elements of working with a team.

Resolving issues during code reviews requires clear communication among team members. Team members must write descriptive and clear commit messages and succinct comments in the code. Explicit annotations will allow the team to discern what issues can be solved during code review. It is also crucial that the team grounds all of this work in a clear understanding of the project's purpose and the milestones of developing the software.	

We also learned about the Agile Methodology and used it to understand the company's goals and put a project together as part of a team. Agile is more of an adaptive style instead of plan-driven and follows an incremental approach. In agile, the implementation of a project has a less well-defined plan and evolves as the project progresses, allowing change within a project if expected. It separates the development life cycle into sprints and is considered a collection of many collaborative projects. During the project, I had the opportunity to practice with many different roles of a scrum team, such as the Scrum Master, Product Owner, Tester, and Developer, to meet the requirements of the client's needs. Most importantly, I learned that agile consists of various tools and practices such as sprint process, standup meetings, user stories, backlog, and test cases. These tools make it an actual transparent environment where team members can communicate and collaborate as a unified team that treats each other respectfully.

For our Data Structure and Algorithm course, we were given a real-world learning environment scenario of being in the role of the programmer to improve the efficiency of an eBid application to allow users to access information on the items sold through the eBid website. Our responsibility included submitting individual artifacts that employ specific algorithms and data structures to meet the requirements of certain features of the program. These features include implementing different types of bid id searches and sorting bids by title. We implemented a linked lists search algorithm to search for a node or, in this case, a bid within the structure of a singly linked list. The search starts at the list's head node. If the node's data matches the key, the matching node is returned. In addition, my favorite search algorithm in this course is the binary search tree. Since a BST uses a nonlinear approach, it can yield faster results when searching for big datasets compared to other search algorithms. A BST's order property is that any node's left subtree keys ≤ the node's key, and the right sub tree's keys ≥ the node's key. Thus, enabling fast searching for an item. For example, a 10,000 node list may require 10,000 comparisons, whereas a 10,000 node BST may only require 14 comparisons.

We mainly learned about two sorting algorithms: selection sort and quick sort. The selection sort handles the inputs as two parts, a sorted part, and an unsorted part. This type of algorithm uses two variables to keep track of both parts. Selection sort searches for the unsorted part of the array for the smallest element. The smallest element swaps with the leftmost element, and that part is then considered sorted.

Data structures are a vital aspect of a program for storing, retrieving, and organizing data efficiently in a digital space. Without it, the programs we wrote through the modules will be unable to retrieve data from a user or read from a data set. Choosing the proper data structure is equally important as it can affect the performance of a program. For example, choosing the wrong data structure type can have negative consequences yielding slow run times, unresponsive code, or bringing the program to a complete halt. When choosing a data structure, it is essential to know what kind of information will be stored, where existing data should be placed, how data should be sorted, and how much memory should be reserved for it. Choosing the proper data structure allowed us to choose the correct algorithm to complete the task and keep the code running smoothly.

In a previous class, I used an open-source RDBMS called MySQL to create a database from scratch and a table where I populated the fields and defined them with the appropriate data types within the table. I also learned the CRUD operations, adding different constraints, multi-line statements, auto increment, and much more. Then in a later class, I learned about a different type of database called MongoDB, a non-relational database that uses a NoSQL design to store its data. As part of the MEAN stack for the backend, we used the MongoDB database due to its ease of modifying schema based on scaling and functionality changes, as well as the ability to rapidly scale horizontally because of the non-relational nature of the database.

The artifact that I am submitting is the Zoo Authentication System. This project was completed during the course IT145 Foundation in Application Development. During the course, the project's purpose was to develop an authentication system that will only allow access when an employee inputs the appropriate credentials. Further, the authentication system was expected to allow each employee to access only data necessary for their roles. This system will also enable the user to log off when the work has been completed. Initially, this program had a non-graphical interface. For the final project, I have enhanced the program by adding a graphical interface with buttons and other features that would make it more appealing, added a database to store the credentials, and improved the security of the authentication system program.

## Software Design and Engineering
I used Java to develop the Authentication System UI by adding another class and using an embedded Java application package in Eclipse called Window Builder Swing Designer and then creating the initial code to read the inputs of the username and password field. I also coded the event actions for the login and exit buttons in my new interface. This allowed me to use the following objects: Labels, JPassword, TextField, and Buttons. I was able to get the username and password to reference the credentials text file to work successfully with the GUI login design. This enhancement helped highlight my skills in category one: Software Design and Engineering. This enhancement helped improve the design of the program as it now has an actual working login screen with buttons that lead the user to another screen displaying the greetings of the Zoo employees depending on the role of the user. The GUI allows the employees to interact easily with the program instead of a terminal console, which can confuse non-technical users. Thus, making it more user-friendly and increasing its appeal. I have added a screenshot to demonstrate the GUI. 

### Zoo Authentication login screen:
![image](https://user-images.githubusercontent.com/36233042/174531880-645f2d59-8540-4ba7-932f-dddf1c949c6e.png)

 
### Dialog message displaying correct login credentials when the password is entered correctly:
![image](https://user-images.githubusercontent.com/36233042/174532038-484ed8f3-8735-4a3a-a317-89c13b2d3f9e.png)

 
### Text pane screen displaying the greeting message for the correct authorized view:
![image](https://user-images.githubusercontent.com/36233042/174532080-2013e5a5-61ba-4733-b61d-8ce9034faa07.png)

 
### Dialog message displaying incorrect login details when password is entered incorrectly:
 ![image](https://user-images.githubusercontent.com/36233042/174532121-dc029c23-b2de-4af5-aca1-70b48bc46133.png)


### Dialog message confirming if you want to exit program when clicking the exit button:
 
![image](https://user-images.githubusercontent.com/36233042/174532142-1ec9df2b-dec4-4fa5-b37d-72a32ebb9c54.png)


## Algorithms and Data Structure
Based on today's security standards, the MD5 (message-digest algorithm) is no longer considered secure. Security experts and hackers have demonstrated techniques capable of easily hacking MD5. Some of these techniques involve brute force attacks and producing MD5 collisions. A brute force attack is a method of finding a password by trying out many possibilities. Whereas a collision is two words with the same hash generated. This poses a security risk for the MD5 hash algorithm, as it is low resistance against collisions. To increase the application's security, I enhanced the hash algorithm for the PasswordDigest.java class by using a more secure hash algorithm like SHA-512 (Secure Hash Algorithm) which addresses MD5's vulnerabilities. The SHA-512 converts text of any length into a fixed-size string. This means each output produces an SHA-512 length of 512 bits (64 bytes) compared to the MD5, which is only 128 bits in length (16 bytes). In terms of security, there is a significant difference between both of these hash algorithms. Below, I added screenshots of these two algorithms, including their hash values.

### SHA-512 (Secure Hash Algorithm): 
![image](https://user-images.githubusercontent.com/36233042/174532305-fe4a6120-6820-49dd-a646-5811ec9bf53b.png)

### SHA-512 generated hash values for password:
![image](https://user-images.githubusercontent.com/36233042/174532379-cc9ec6ae-c9ce-4c84-a305-9a21faacf954.png)

 
### MD5 (message-digest algorithm):
![image](https://user-images.githubusercontent.com/36233042/174532488-cdb0642f-b047-4cd2-b612-ea68b31237ab.png)

 
### MD5 generated hash values for the password:
 ![image](https://user-images.githubusercontent.com/36233042/174532509-5abbda40-5247-4e16-b858-2c2bbbc723c1.png)





## Database
For the enhancement update, I incorporated a database to the Zoo Authentication System program to store the employee's credential attributes information such as username, hash values (password), and roles. I ended up going with MongoDB (NoSQL) instead of MySQL. I created a Credential database and then created the Roles collection to store the Zoo employee's credentials, thereby replacing the Credential text file as it is not good practice to store users' credentials locally on a text file. After creating the Credential database and its collection, I modified the code for the AuthenticationSystemUI Class to connect the Credential database with Java. To get it working, I had to add the MongoDB Java driver as an external jar file to the build path of the project. See below for screenshots.

### MongoDB Credential database and Roles collection:
  ![image](https://user-images.githubusercontent.com/36233042/174532557-9e3b5abc-db40-4809-a846-7ac0b938bd27.png)
  ![image](https://user-images.githubusercontent.com/36233042/174532587-6e61eb89-f759-4070-8fa3-1355d78a0bed.png)

### Collection Objects:
![image](https://user-images.githubusercontent.com/36233042/174532646-0e701a26-c618-4619-9110-3ed4a2519681.png)

### Reference Library for External Jar Files:
 ![image](https://user-images.githubusercontent.com/36233042/174532682-159fdccb-6130-450a-af21-67b47c745cce.png)

### MongoDB Java Classes imported:
 ![image](https://user-images.githubusercontent.com/36233042/174532760-a4e8703e-8e37-4a4f-a3dc-0f2d3f74c863.png)

### New Java code to read credential from the database:
 ![image](https://user-images.githubusercontent.com/36233042/174532801-76397462-42df-4e18-a785-e6bdb4b07c9e.png)

### Old Java code to credentials from text file:

 ![image](https://user-images.githubusercontent.com/36233042/174532849-4c939dd2-8199-4ec4-956f-4815a7f2575a.png)



