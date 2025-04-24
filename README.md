# Java-Login-Attendance-Manager

This repository contains my **first Java project** where I have cloned an existing **Login, User Management, and Attendance System** application. It is built using **Java Swing** for the desktop application interface and **MySQL** for managing the database.

The project allows users to:
- Register, view, update, and delete user details.
- Mark attendance twice a day and calculate the total duration for attendance.
- Generate and view QR codes for users.

---

## **Project Details**

### **Overview**
This is a **Java Swing-based desktop application** designed to manage user registrations, attendance, and QR code generation. The application allows administrators to:
- **Register new users** by entering details such as name, gender, email, and uploading their photo.
- **View a list of registered users**.
- **Update user details** like name, gender, and email.
- **Delete users** from the system.
- **Generate unique QR codes** for each user.
- **Mark attendance twice a day** and calculate the total duration of the user's attendance.
- **View attendance** records.

---

## **Components of the Project**

### 1. **Login Page**  
The login page is the entry point of the application. Users are required to enter a predefined username (`azhar`) and password (`azhar`) to access the system.  
- Once logged in, users can access all the functionalities such as user registration, attendance marking, and QR code generation.  

#### Screenshot:  
![Login Page](path-to-your-screenshot)

### 2. **User Registration Form**  
Admins can register new users by entering their details such as:
- **Name**
- **Gender**
- **Email**
- **Photo upload**

Once the details are entered, the user is added to the database. 

#### Screenshot:  
![User Registration Form](photos/Screenshot (54).png)

### 3. **View Registered Users**  
After users are registered, administrators can view all registered users in a list. From this page, they can:
- View user details.
- Update user information.
- Delete users.

#### Screenshot:  
![View Registered Users](path-to-your-screenshot)

### 4. **Update User Details**  
Admins can modify an existing user’s details such as:
- **Name**
- **Email**
- **Gender**
- **Photo**
  
Changes are then reflected in the database after clicking the "Update" button.

#### Screenshot:  
![Update User Details](path-to-your-screenshot)

### 5. **Delete User**  
If a user needs to be removed from the system, the admin can select the user and click the "Delete" button. This removes the user from both the GUI and the database.

#### Screenshot:  
![Delete User](path-to-your-screenshot)

### 6. **QR Code Generation**  
Once a user is registered, an admin can generate a unique **QR code** for that user. The QR code contains user-specific data that can be scanned by QR code readers.

#### Screenshot:  
![QR Code Generation](path-to-your-screenshot)

### 7. **Mark Attendance**  
Admins can mark attendance twice a day for each user:
- The **first attendance** is recorded when the user arrives.
- The **second attendance** is recorded when the user leaves.
- The system calculates the **total time spent** in the system by subtracting the arrival time from the departure time.

#### Attendance Calculation:  
For each day, the total attendance duration is calculated as:
```java
attendanceDuration = departureTime - arrivalTime;
```

#### Screenshot:  
![Mark Attendance](path-to-your-screenshot)

### 8. **View Attendance**  
Admins can view the attendance records for all users, including:
- **Arrival Time**
- **Departure Time**
- **Total Duration of Attendance**

#### Screenshot:  
![View Attendance](path-to-your-screenshot)

---

## **How the Database is Managed**

- **Database Configuration**:  
  The database will be automatically created when you run the application. All the tables for users, attendance, and QR codes will be set up during the first run.  
  You only need to change the database **URL** and **password** in the Java code to match your MySQL credentials.

  Update the **DB URL** and **password** in the `Database.java` (or similar) file:
  ```java
  String dbUrl = "jdbc:mysql://localhost:3306/yourDatabaseName";
  String dbUser = "yourMySQLUsername";
  String dbPassword = "yourMySQLPassword";
  ```

- **DAO (Data Access Object)**:  
  The DAO layer interacts with the MySQL database, handling operations like inserting new users, updating user details, and marking attendance. The application performs **CRUD operations** to manage the user data efficiently.

---

### **Technologies Used**:
- **Java 23**: The backend programming language used to build the logic of the application.
- **Java Swing**: Used for creating the graphical user interface (GUI), allowing for drag-and-drop components.
- **MySQL**: The relational database management system to store user data, attendance, and QR codes.
- **DAO (Data Access Object)**: Used to manage the interaction between Java and MySQL databases for performing CRUD operations.

---

## **How to Install and Run**:
1. **Clone this repository**:
   ```bash
   git clone https://github.com/yourusername/Java-Login-Attendance-Manager.git
   ```
2. **Set up the MySQL Database**:
   - The application will automatically create the necessary tables when you run the program.
   - You only need to update the **database URL** and **password** in the Java code to match your MySQL credentials:
     ```java
     String dbUrl = "jdbc:mysql://localhost:3306/yourDatabaseName";
     String dbUser = "yourMySQLUsername";
     String dbPassword = "yourMySQLPassword";
     ```
3. **Run the Application**:
   - Open the project in **NetBeans** or any Java IDE.
   - Compile and run the `Login.java` file to start the application.
4. **Login**: Use the predefined username and password (`azhar` / `azhar`) to access the system.

---

### **Future Enhancements**:
- Add **email validation** during user registration.
- Implement **password recovery** feature.
- Allow **bulk attendance marking** through CSV upload.

---

### **Contributors**:
- **Azharuddin Ali** (Project Owner)
