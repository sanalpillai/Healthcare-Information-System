# Healthcare Information System

## Description
This Java Swing application, created for INFO 5100 – Application Engineering Development (Fall 2023), is crafted to introduce students to the foundational concepts of Java classes, object-oriented programming, the Swing framework, and event handling. It showcases the transfer of data between Java Swing forms and objects, focusing on a healthcare information management context.

## Features
- **Create Person**: Implements a GUI to input personal details into a `Person` object with attributes such as name, SSN, website URL, email, picture, and more.
- **Create Address**: Facilitates the input of location details into an `Address` object, including GPS coordinates, city, state, and country.
- **Create Driver**: Captures driver's license information and stores it in a `Driver` object.
- **Create Vehicle Registration**: Records vehicle details like model and serial number into a `Vehicle Registration` object.
- **Create Patient**: Allows for the entry of patient information including patient ID, primary doctor, visit dates, allergies, medication status, and insurance coverage into a `Patient` object.
- **Create Doctor**: Saves a doctor's professional information in a `Doctor` object, detailing name, office address, doctor ID, specialty, and more.
- **Create Insurance Coverage**: Gathers insurance details and records them in an `Insurance` object, including corporate ID, address, premium, deductible, and a statement of benefits.
- **Display Patient Report**: Generates a detailed report displaying all the attributes entered, formatted for clarity and ease of understanding.

## How to Run
1. Clone the repository to your local machine.
2. Open the Netbeans IDE or any other Java IDE that supports Swing applications.
3. Import the project into your IDE.
4. Ensure that the Java Development Kit (JDK) is installed on your machine.
5. Build the project to resolve any dependencies.
6. Run the application from the main class which contains the main method.

## Dependencies
- Java Runtime Environment (JRE) 1.8 or higher.
- Java Cryptography Architecture (JCA) for implementing secure password hashing.
- Any additional libraries used should be listed here, along with instructions on how to install or integrate them into the project.

## Security Measures
- Passwords are hashed using the SHA-256 hashing algorithm provided by the Java Cryptography Architecture.
- Best practices are followed to ensure that all user data is handled securely.
- The application includes functionality to prevent the reuse of previously used passwords.

## Contributions
This project is currently not open for contributions. However, feedback on the functionality and security of the application is always welcome.

## License
This project is released under the MIT License. See the LICENSE file in the repository for full details.

## Acknowledgements
Special thanks to the instructors and peers at Northeastern University for their guidance and support throughout the development of this project.

---

Developed by: Sanal Pillai
