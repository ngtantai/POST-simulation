# project1team2
Point of Sale Terminal Simulation
The software is a simulation of the POST system which shall be acted as a cash register system. The system runs the terminal to simulate all the processes starting from the begin state of the closed store to the end state of printing an invoice to customer.The system inherits the properties of a cash register system which includes a bar code scanner (UPC codes) of the products, a cash drawer and a credit card scanner.
 Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
Prerequisities
Primary: JDK (Java development kit)
Optional: IDK (Integrated Developing Environment)
Installing
The software was written in Java programming language.
Primary installation: JDK (Java development kit)
How to install it: https://www.ntu.edu.sg/home/ehchua/programming/howto/NetBeans_HowTo.html
Developing references: IDK (Integrated Developing Environment)
	1. Netbeans IDE (version 8.0.2 or above) 
		How to install it: https://www.ntu.edu.sg/home/ehchua/programming/howto/NetBeans_HowTo.html
	2. Eclipse IDE. 
		How to install it:
Running the tests
For local testing without IDK and an installed JDK for Windows:
1. Download/clone from https://github.com/ngtantai/POST-simulation.git
2. Extract zipped file.
3. Open and run command prompt.
4. Navigate to the directory containing the main file by typing
	cd "....\POST\build\classes\store"
5. Run the main class by typing
	java store.Store
Break down into end to end tests
Explain what these tests test and why
Give an example
Critical events/behaviors:
helpcustomer(customer):
	Iterate each customer
	retrieve their total items in cart(each item associates with specified price)
	Calculate total cost by adding all item prices.
checkout(customer):
	authenticate payment method
	generate and print out customer receipt based on type of payment.
License
This project is licensed under the terms of the SFSU – course 668 license.
