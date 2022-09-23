package Ahmet;

public class main {
    public static void main(String[] args) {
        University university1= new University("ahmet","tirelioğlu", "pamukkalaüniversitesi", "turizm fakultesi",225,"ahmet_tirelioglu","fghjkl");
        System.out.println(university1.getName());
        System.out.println(university1);

        System.out.println("******************");

        University academician1 = new University("ramazan","varlıklı","akü","eğitim",80,"fgdsa","fghjk");
        System.out.println(academician1.getName());
        System.out.println(academician1.getLastName());
        System.out.println(academician1.getUniversityName());
        System.out.println(academician1.getFacultyName());
        System.out.println(academician1.getPhone());
        System.out.println("******************");

        University student1 = new University("öykü","çalışkan","dokuz eylül","mühendislik",11,"fgdsa","ghfds");
        System.out.println(student1.getName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getUniversityName());
        System.out.println(student1.getFacultyName());
        System.out.println(student1.getPhone());

        University[] universities ={university1, academician1, student1};
        for (University university : universities) {
            System.out.println("<li>" + university.getLastName() + "</li>");
        }
        System.out.println("</ul>");
    }
}
