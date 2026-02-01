---

# Similarity 

CA : EaGPjP2qHdMSpm35jkicDps3nvawLrGkrTQn3oCDBAGS

[Similarity](https://www.similarity.in//) is a **real-time plagiarism detection platform** designed to analyze and compare code submissions efficiently. It integrates an open-source plagiarism detection engine with a scalable backend, optimized to handle high-traffic loads. The system supports real-time processing of 10,000+ code submissions within 30 minutes, leveraging Java, Spring Boot, React, PostgreSQL, Azure, and AWS RDS.

With a robust architecture that includes **multithreading** and **concurrent server execution**, Similarity ensures fast and accurate plagiarism detection. The platform has achieved **40,000+ website views** in just one week and sustains **500 daily active users** across **50+ countries**.

![image](https://github.com/user-attachments/assets/d52dd8ca-37a7-40bc-ae7b-150e8cb2e9d0)


---

# Table of Contents

1. [Introduction](#introduction)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Project Structure](#project-structure)
5. [Future Enhancements](#future-enhancements)

---

# Introduction

1. On the Home Page, navigate to the Contest button.
![image](https://github.com/user-attachments/assets/f1469f33-8ea9-4545-99e1-20ce30d6bbb6)


2. Select the desired contest from the available list.
![image](https://github.com/user-attachments/assets/76bb24dd-1fa8-4a34-af38-26ba37419729)


3. Choose a specific question from the contest.
![image](https://github.com/user-attachments/assets/d1f50ed7-e6e2-4c80-ac34-ee707af1d048)


4. You will see a list of all users detected for plagiarism in this question.
![image](https://github.com/user-attachments/assets/a1f2efd1-e161-4e0d-92c4-d7043693991a)


5. Click on any specific user from the list.

6. The selected user's code will appear on the left, and all the users with matching code will be displayed on the right.
![image](https://github.com/user-attachments/assets/6bcca272-3e14-407a-a8cb-5edf206fc3ea)


7. Upon clicking the Code button, you will get a Report Solution option, which will redirect you to the LeetCode leaderboard ranking to report the user.
![image](https://github.com/user-attachments/assets/86e81dbe-3d9a-48ed-bd0d-46d829da3e05)



---

# Features

1. Real-time plagiarism detection using JPlag for accurate code similarity analysis.

2. Optimized API processing with high throughput.

3. Efficient report generation through multithreading.

4. Scalable infrastructure using cloud technologies.

5. User-friendly web interface built with React and Tailwind.

6. Secure storage with PostgreSQL and cloud-based databases.

7. Mobile-responsive design for seamless access across devices.

---

# Technologies Used

- Backend:
  - **Spring Boot** – API development and request handling.

  - **Spring Data JPA** – Simplified database interactions.

  - **PostgreSQL** – Relational database for efficient data storage.

  - **Lombok** – Reduces boilerplate code in Java.

  - **JPlag** – Plagiarism detection engine for analyzing code similarity.
 
---

# Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/backend/similarity/
│   │       ├── controller/
│   │       │   ├── CodesController.java
│   │       │   ├── ContactController.java
│   │       │   ├── QuestionController.java
│   │       │   └── SubmissionsController.java
│   │       ├── dto/
│   │       │   ├── CodeDTO.java
│   │       │   ├── ContactDTO.java
│   │       │   ├── MatchDTO.java
│   │       │   ├── QuestionDTO.java
│   │       │   └── SubmissionDTO.java
│   │       ├── model/
│   │       │   ├── Codes.java
│   │       │   ├── Contest.java
│   │       │   ├── Difficulty.java
│   │       │   ├── Question.java
│   │       │   ├── Results.java
│   │       │   └── ResultsdId.java
│   │       ├── repository/
│   │       │   ├── CodesRepository.java
│   │       │   ├── ContestRepository.java
│   │       │   ├── QuestionRepository.java
│   │       │   └── ResultsRepository.java
│   │       └── service/
│   │           ├── CodesService.java
│   │           ├── ContestService.java
│   │           ├── EmailService.java
│   │           ├── QuestionService.java
│   │           ├── ResultsService.java
│   │           └── SimilarityApplication.java (Main Application Class)
│   └── resources/
│       └── ... (Configuration files, static resources)
```

![upscalemedia-transformed](https://github.com/user-attachments/assets/8c78656f-5245-460a-8ef2-613a253cf45a)


---

# Future Enhancements

1. **Predicted Contest Rating:** Implement a system to predict users' ratings after each contest based on their performance and similarity analysis.

2. **Multi-Platform Support:** Extend plagiarism detection to platforms like CodeChef, ensuring a broader impact and wider usability.

3. **Verification for Recruiters & Referrers:** Introduce an easy-to-use verification system that allows recruiters and referrers to check if a candidate has legitimate contest ratings or has been flagged for plagiarism, along with details on which contests they were involved in.

---
 

