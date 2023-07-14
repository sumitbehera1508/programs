/*A student scores marks in subjects in a semester. A semester has 5 or 6 subjects
depending of MCA course. Define a class called Score that contains subject code, name
and marks in that subject. Define a class called Student having an array of objects of
Score class in it following object composition. Process result of students in different
semesters.*/

public class exp6 {

    public static void main(String sumit[]) {
        Student Sumit = new Student("Sumit", "2224100003");
        Score sub1 = new Score("Introduction to Computation", "PPCCA101", 83);
        Score sub2 = new Score("Computer Organization andArchitecture", "PPCCA102", 92);
        Score sub3 = new Score("Web Design and Development","PPCCA103",84);
        Score sub4 = new Score("Computational Mathematics Statistics","Core 4",75);
        Score sub5 = new Score("Business Communication","PMCMH105",83);
        Score lab1 = new Score("Introduction to Computation Lab","PLCCA101",88);
        Score lab2 = new Score("Web Design and Development Lab","PLCCA103",82);
        Score lab3 = new Score("Business Communication Lab","PLCMH105",95);

        Sumit.addMarks(sub1);
        Sumit.addMarks(sub2);
        Sumit.addMarks(sub3);
        Sumit.addMarks(sub4);
        Sumit.addMarks(sub5);
        Sumit.addMarks(lab1);
        Sumit.addMarks(lab2);
        Sumit.addMarks(lab3);

        Sumit.details();
    }
}

class Score {
    public String SubjectCode, SubjectName;
    public int Marks;

    Score(String SubjectName, String SubjectCode, int mark) {
        this.Marks = mark;
        this.SubjectCode = SubjectCode;
        this.SubjectName = SubjectName;
    }
}

class Student {
    public String name;
    public String Roll;
    public String sem1Subjects[] = new String[8];
    public int sem1Marks[] = new int[8];
    public String sem1SubjectCode[] = new String[8];
    public Score sem1Scores[] = new Score[8];

    Student(String name, String Roll) {
        this.Roll = Roll;
        this.name = name;
    }

    int i = 0;

    public void addMarks(Score c) {
        if (i > 7) {
            System.out.println("Invalid range");
        } else {
            sem1Marks[i] = c.Marks;
            sem1Scores[i] = c;
            sem1SubjectCode[i] = c.SubjectCode;
            sem1Subjects[i] = c.SubjectName;
            i++;
        }
    }

    public void changeMarks(Score c) {
        int j = 0;
        for (; j < 8; j++) {
            if (sem1Scores[j] == c)
                break;
        }
        if (j == 8) {
            System.out.println("invalid Score ");
            return;
        }
        sem1Marks[j] = c.Marks;
    }

    public void details(){
        System.out.println("the name is "+this.name+" :");
        for(int i=0;i<8;i++){
            System.out.println("\tSubject Name : "+sem1Subjects[i]+"\tSubject Code : "+sem1SubjectCode[i]+"\tMark : "+sem1Marks[i]);
        }
    }
}