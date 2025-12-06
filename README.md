# 🎓 Student Data Management System (Java + JDBC + Oracle)

This project is a **console-based Java application** that allows users to insert student details along with an **image file (stored as BLOB)** into an Oracle database.  
It demonstrates Java fundamentals, JDBC connectivity, file handling, and database operations using `PreparedStatement`.

---

## 🚀 Features

- Insert new student record  
- Capture:
  - Student Name  
  - Student ID  
  - Student Address  
  - Student Photo (File InputStream → BLOB)
- Auto-validation for insert success/failure  
- JDBC-based Oracle DB connectivity  
- Clean service-layer architecture  

---

## 🗂️ Project Structure

src/
├── com.ani.beans
│ └── Student.java
├── com.ani.services
│ └── StudentService.java
└── com.ani.user
└── StudentDataUser.java


---

## 💻 Technologies Used

- **Java 8+**
- **Oracle Database**
- **JDBC**
- **File Handling (FileInputStream)**

---

## 📌 How It Works

1. User chooses the option from console:
   - `1` → Insert Student Data  
   - `2` → Exit

2. User enters:
   - Name  
   - ID  
   - Address  

3. Application reads an image file:  
   ```java
   File file = new File("C:\\Users\\ani\\OneDrive\\Pictures\\ganeshji.jpg");
   FileInputStream inputStream = new FileInputStream(file);
