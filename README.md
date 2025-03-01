# 🖥️ Online Code Editor (Multi-Language Execution Environment)

This project is a **multi-language online code execution environment** that supports Python, JavaScript, Java, and C++. It uses **Docker and Docker Compose** to containerize and run code securely in isolated environments.

## 🚀 Features
- Supports multiple programming languages: **Python, JavaScript, Java, and C++**
- Uses **Docker containers** for isolated and secure execution
- Easy setup with **Docker Compose**
- Automatically builds and runs code inside containers
- Mounts the project directory for real-time file access

---

## 💁️ Project Structure
```
OnlineCodeEditor/
│️️ Dockerfile.py      # Python environment
│️️ Dockerfile.js      # JavaScript environment
│️️ Dockerfile.java    # Java environment
│️️ Dockerfile.cpp     # C++ environment
│️️ docker-compose.yml # Configuration for multi-container setup
│️️ main.cpp           # Example C++ program
│️️ Main.java          # Example Java program
│️️ script.py          # Example Python script
│️️ script.js          # Example JavaScript script
│️️ README.md          # Documentation
```

---

## 🛠️ Setup & Usage

### 1️⃣ Prerequisites
- Install [Docker](https://www.docker.com/) and [Docker Compose](https://docs.docker.com/compose/install/)
- Ensure Docker is running

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/OnlineCodeEditor.git
cd OnlineCodeEditor
```

### 3️⃣ Build and Run Containers
```bash
docker-compose up --build
```

### 4️⃣ Verify Running Containers
```bash
docker ps
```

### 5️⃣ Execute Code in a Specific Language

#### ✅ **Run Python**
```bash
docker exec -it onlinecodeeditor-python python3 script.py
```

#### ✅ **Run JavaScript**
```bash
docker exec -it onlinecodeeditor-js node script.js
```

#### ✅ **Compile & Run Java**
```bash
docker exec -it onlinecodeeditor-java javac Main.java && java Main
```

#### ✅ **Compile & Run C++**
```bash
docker exec -it onlinecodeeditor-cpp ./program
```

---

## 🐛 Troubleshooting
- **Error: "file has already been closed"**  
  🔹 Restart Docker and try again.
  ```bash
  docker-compose down && docker-compose up --build
  ```
- **Container not starting?**  
  🔹 Check logs with:
  ```bash
  docker logs <container_id>
  ```
- **Modify code but changes don’t reflect?**  
  🔹 Rebuild the containers:
  ```bash
  docker-compose up --build
  ```

---

## 🐜 License
This project is licensed under the **MIT License**.

---

## 💡 Contributing
Pull requests are welcome! If you have ideas for improvements, feel free to open an issue.

---

## 🌟 Acknowledgements
Thanks to **Docker** and the **open-source community** for making containerization easy!

---

