package com.quizapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.*;

@Controller
public class QuizController {

    // Question Model Class
    public static class Question {
        public String id, text, a, b, c, d, answer;
        public Question(String id, String text, String a, String b, String c, String d, String answer) {
            this.id = id; this.text = text; 
            this.a = a; this.b = b; this.c = c; this.d = d; this.answer = answer;
        }
    }

    // Master List: Total 45 Questions
    private List<Question> getMasterQuestionList() {
        List<Question> qList = new ArrayList<>();
        
        // SET 1: General CS / IT Basics
        qList.add(new Question("s1q1", "What does CPU stand for?", "Central Process Unit", "Central Processing Unit", "Computer Personal Unit", "Control Processing Unit", "B"));
        qList.add(new Question("s1q2", "Which language is used for web styling?", "HTML", "CSS", "Java", "Python", "B"));
        qList.add(new Question("s1q3", "What is the brain of the computer?", "RAM", "Hard Disk", "CPU", "Monitor", "C"));
        qList.add(new Question("s1q4", "Which is not an input device?", "Keyboard", "Mouse", "Monitor", "Scanner", "C"));
        qList.add(new Question("s1q5", "What does HTML stand for?", "Hyper Trainer Marking Language", "Hyper Text Markup Language", "Hyper Text Marketing Language", "Hyper Text Markup Leveler", "B"));
        qList.add(new Question("s1q6", "Which is a programming language?", "HTTP", "HTML", "Java", "FTP", "C"));
        qList.add(new Question("s1q7", "RAM is?", "Permanent memory", "Temporary memory", "Storage device", "Input device", "B"));
        qList.add(new Question("s1q8", "Which company developed Java?", "Microsoft", "Apple", "Sun Microsystems", "Google", "C"));
        qList.add(new Question("s1q9", "Which protocol is used for web browsing?", "FTP", "SMTP", "HTTP", "TCP", "C"));
        qList.add(new Question("s1q10", "Which is an operating system?", "MS Word", "Windows", "Chrome", "Excel", "B"));
        qList.add(new Question("s1q11", "What is full form of URL?", "Uniform Resource Locator", "Universal Resource Link", "Uniform Reference Link", "Universal Reference Locator", "A"));
        qList.add(new Question("s1q12", "Which is used to store data permanently?", "RAM", "Cache", "Hard Disk", "Register", "C"));
        qList.add(new Question("s1q13", "Which is not a programming language?", "Python", "Java", "HTML", "C++", "C"));
        qList.add(new Question("s1q14", "What does LAN stand for?", "Local Area Network", "Large Area Network", "Light Area Network", "Long Area Network", "A"));
        qList.add(new Question("s1q15", "Which device prints documents?", "Monitor", "Printer", "Keyboard", "CPU", "B"));

        // SET 2: Programming + Web Logic
        qList.add(new Question("s2q1", "Which symbol is used for comments in Java?", "//", "/* */", "#", "**", "A"));
        qList.add(new Question("s2q2", "Which tag is used for hyperlink in HTML?", "<link>", "<a>", "<href>", "<url>", "B"));
        qList.add(new Question("s2q3", "Which data type stores true/false?", "int", "char", "boolean", "float", "C"));
        qList.add(new Question("s2q4", "Which loop runs at least once?", "for", "while", "do-while", "none", "C"));
        qList.add(new Question("s2q5", "Which is backend language?", "HTML", "CSS", "Java", "Bootstrap", "C"));
        qList.add(new Question("s2q6", "Which is frontend language?", "Python", "Java", "HTML", "C++", "C"));
        qList.add(new Question("s2q7", "What is function?", "Variable", "Loop", "Block of code", "Data type", "C"));
        qList.add(new Question("s2q8", "Which operator is used for equality?", "=", "==", "!=", "<=", "B"));
        qList.add(new Question("s2q9", "Which is database?", "MySQL", "Java", "HTML", "CSS", "A"));
        qList.add(new Question("s2q10", "Which keyword is used to define class in Java?", "function", "class", "define", "object", "B"));
        qList.add(new Question("s2q11", "Which method is entry point in Java?", "start()", "run()", "main()", "init()", "C"));
        qList.add(new Question("s2q12", "Which symbol ends statement in Java?", ".", ":", ";", ",", "C"));
        qList.add(new Question("s2q13", "Which is used for styling?", "Java", "CSS", "Python", "SQL", "B"));
        qList.add(new Question("s2q14", "Which is not OOP concept?", "Inheritance", "Encapsulation", "Compilation", "Polymorphism", "C"));
        qList.add(new Question("s2q15", "Which is used for database query?", "HTML", "SQL", "CSS", "Java", "B"));

        // SET 3: Full Stack / NM / DSA
        qList.add(new Question("s3q1", "Which language is used to structure web pages?", "CSS", "HTML", "JavaScript", "Python", "B"));
        qList.add(new Question("s3q2", "Which database is relational?", "MongoDB", "Firebase", "MySQL", "Cassandra", "C"));
        qList.add(new Question("s3q3", "Bisection method is used to find?", "Integration", "Roots of equation", "Differentiation", "Matrix inverse", "B"));
        qList.add(new Question("s3q4", "Which data structure uses FIFO?", "Stack", "Queue", "Tree", "Graph", "B"));
        qList.add(new Question("s3q5", "Time complexity of binary search is?", "O(n)", "O(log n)", "O(n²)", "O(1)", "B"));
        qList.add(new Question("s3q6", "Which traversal is used in BFS?", "Stack", "Queue", "Array", "Tree only", "B"));
        qList.add(new Question("s3q7", "Newton-Raphson method requires?", "Only function", "Only matrix", "Function and derivative", "Integration limits", "C"));
        qList.add(new Question("s3q8", "Which method is used for solving linear equations?", "Euler Method", "Gauss Elimination", "Simpson Method", "Runge-Kutta", "B"));
        qList.add(new Question("s3q9", "Trapezoidal rule is used for?", "Differentiation", "Integration", "Root finding", "Sorting", "B"));
        qList.add(new Question("s3q10", "Error in numerical methods is due to?", "Exact calculation", "Approximation", "Compiler error", "Syntax error", "B"));
        qList.add(new Question("s3q11", "Which data structure uses LIFO?", "Queue", "Stack", "Linked List", "Array", "B"));
        qList.add(new Question("s3q12", "Worst-case time complexity of bubble sort?", "O(n)", "O(log n)", "O(n²)", "O(1)", "C"));
        qList.add(new Question("s3q13", "Which backend framework is Java based?", "Django", "Flask", "Spring Boot", "Laravel", "C"));
        qList.add(new Question("s3q14", "What connects frontend with database?", "API", "CSS", "Compiler", "IDE", "A"));
        qList.add(new Question("s3q15", "Which is an example of NoSQL?", "MySQL", "PostgreSQL", "MongoDB", "Oracle", "C"));

        return qList;
    }

    // Endpoint to Display Quiz
    @GetMapping("/quiz")
    public String quiz(Model model) {
        List<Question> allQuestions = getMasterQuestionList();
        
        // DYNAMIC SHUFFLE: Har baar questions ka order badal jayega
        Collections.shuffle(allQuestions);
        
        // RANDOM 15: 45 mein se koi bhi random 15 questions screen par aayengi
        model.addAttribute("questions", allQuestions.subList(0, 15));
        
        return "quiz";
    }

    // Endpoint to Handle Submission
    @PostMapping("/submit")
    public String submit(@RequestParam Map<String, String> allParams, Model model) {
        int totalScore = 0;
        List<Question> master = getMasterQuestionList();
        
        // Scoring Logic
        for (Question q : master) {
            String submittedAnswer = allParams.get(q.id);
            if (q.answer.equals(submittedAnswer)) {
                totalScore++;
            }
        }
        
        model.addAttribute("totalScore", totalScore);
        return "result";
    }
}