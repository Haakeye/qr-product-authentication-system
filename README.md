# QR-Based Product Authentication System

## Overview
This project is a full-stack system for detecting counterfeit products using QR code verification.

It consists of:
- Android application for scanning QR codes
- Java-based SOAP web service backend
- MySQL database for storing product and user data

The system verifies whether a product is genuine or fake based on QR code validation.

---

## Features

- QR Code Scanning (Android)
- Real-time Product Verification
- Fake vs Genuine Detection
- Role-Based Access:
  - Admin
  - Manufacturer
  - Distributor
  - Retailer
  - User
- OTP Verification
- Product Tracking (Approval logs)

---

## System Architecture

Android App → SOAP Web Service → MySQL Database

---

## Tech Stack

- Java (JSP, Servlets, Web Services)
- Android (Java)
- MySQL
- Apache Tomcat
- ZXing (QR Code Library)
- KSOAP2 (Android API calls)
- NetBeans / Eclipse

---

## Project Structure
app/ → Android Application
backend/ → Java Web Service (SOAP)
docs/ → Documentation & screenshots


---

## How to Run

### 1. Clone the Repository

git clone https://github.com/Haakeye/qr-product-authentication-system.git

---

### 2. Setup Database

Open MySQL and run:

CREATE DATABASE fakeproduct;

Then import:

source backend/Product service/DB/setup.sql;

---

### 3. Configure Backend

- Open backend project in NetBeans
- Configure Apache Tomcat server
- Add required JAR files in:

backend/Product service/web/WEB-INF/lib/

Required JARs:
- mysql-connector-java
- zxing
- gson
- commons libraries

---

### 4. Run Backend

Deploy project in Tomcat:

http://localhost:8080/Product_service/NewWebService?WSDL

---

### 5. Configure Android App

Open:

app/src/com/example/fake_product/Callservice.java

Update server URL:

String URL = "http://YOUR-IP:8080/Product_service/NewWebService?WSDL";

---

### 6. Run Android App

- Open in Android Studio
- Run on emulator or device
- Scan QR code to verify product

---

## API (SOAP Web Services)

- Register / Login
- Distributor Register / Login
- User Register / Login
- booked → Store QR scan
- verify → Check product authenticity
- getDeviceList1 → Get product history

---

## Database Tables

- admin
- manufacturer
- dist
- retailor
- user
- product
- approval

---

## Important Notes

- Change MySQL credentials in code
- Update server IP in Android app
- Ensure Tomcat server is running

---

## Future Improvements

- Blockchain-based product tracking
- AI-based counterfeit detection (Computer Vision)
- Cloud deployment (AWS / Azure)

---

## Author

Haarish Kumar  
GitHub: https://github.com/Haakeye
