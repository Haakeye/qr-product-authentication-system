# QR-Based Product Authentication System

## Overview

This project is a full-stack application designed to detect counterfeit products using QR code verification.

It consists of:
- Android mobile application for scanning QR codes
- Java-based SOAP web service backend
- MySQL database for storing product and user data

The system allows users to verify whether a product is genuine or fake by scanning its QR code.

---

## Key Features

- QR Code scanning using Android application
- Real-time product verification
- Fake vs Genuine product detection
- Role-based system:
  - Admin
  - Manufacturer
  - Distributor
  - Retailer
  - User
- OTP verification system
- Product tracking using database logs

---

## System Architecture

Android App → SOAP Web Service → MySQL Database

- Android app scans QR code
- Calls backend using SOAP API (KSOAP2)
- Backend verifies product from database
- Result returned to mobile app

---

## Tech Stack

- Java (JSP, Servlets, Web Services)
- Android (Java)
- MySQL
- Apache Tomcat / GlassFish
- ZXing (QR Code processing)
- KSOAP2 (API communication)
- NetBeans / Eclipse

---

## Project Structure
app/ → Android Application
backend/ → Java Web Service
docs/ → Documentation & screenshots


---

## How to Run the Project

### 1. Clone the Repository

git clone https://github.com/Haakeye/qr-product-authentication-system.git

---

### 2. Setup Database

Open MySQL and run:

CREATE DATABASE fakeproduct;

Then import SQL file:

source backend/Product service/DB/database.sql;

---

### 3. Configure Backend

- Open backend project in NetBeans
- Configure Apache Tomcat or GlassFish server
- Ensure required JAR files are available:
  - mysql-connector-java
  - zxing
  - gson

---

### 4. Run Backend

Deploy project and open:

http://localhost:8080/Product_service/NewWebService?WSDL

---

### 5. Configure Android App

Open file:

app/src/com/example/fake_product/Callservice.java

Update server URL:

String URL = "http://YOUR-IP:8080/Product_service/NewWebService?WSDL";

---

### 6. Run Android App

- Open project in Android Studio
- Run on emulator or physical device
- Scan QR code to verify product

---

## API (SOAP Web Services)

The backend provides the following services:

- Register / Login (Retailer)
- Distributor Register / Login
- User Register / Login
- booked → Store QR scan details
- verify → Verify product authenticity
- getDeviceList1 → Retrieve product history

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

## Demo Screenshots

### Backend Output
![Backend](docs/images/backend.png)

### Product Page
![Product](docs/images/product_page.png)

### Android App
![App](docs/images/app.png)

---

## Blockchain Module (Experimental)

This project includes a basic blockchain implementation for storing product transaction history.

- Block.java → Defines block structure
- NoobChain.java → Builds blockchain from transaction data
- StringUtil.java → Hashing functions

Note: This module is experimental and not fully integrated with the system.

---

## Important Notes

- Update MySQL credentials in backend code
- Update server IP in Android app before running
- Ensure Tomcat/GlassFish server is running

---

## Future Improvements

- Blockchain-based secure tracking
- AI-based fake product detection (Computer Vision)
- Cloud deployment (AWS / Azure)

---

## Author

Haarish Kumar  
GitHub: https://github.com/Haakeye
