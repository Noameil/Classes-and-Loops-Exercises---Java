public class Main {
    public static void main(String[] args) {
        //Exercise 1 - Start

        Word dog = new Word("כלב", "Dog");
        System.out.println(dog);

        //Exercise 1 - End

        //Exercise 2 - Start

        //1. למחלקה Unknown יש 3 בנאים. (int, int), (), (int, double)

        //2. חתימת השיטה get1 היא ()

        //3. חתימת השיטה f היא (int, int)

        //Exercise 2 - End

        //Exercise 3 - Start

        //א. השיטה לא מקבלת כלום ולא מחזירה כלום אלא מדפיסה 10 כוכביות אחת מתחת לשנייה בעזרת לולאת for

        //ב. השיטה מקבלת מספר שלם, בודקת כמה מספרים עד המספר שמתקבל מתחלקים ב-3 ללא שארית, ומחזירה את המספר כמספר שלם

        //ג. השיטה מקבלת מספר שלם, מחלקת אותו ב-10 עד שהוא מגיע ל-0, ומחזירה כמה פעמים זה לקח בתור מספר שלם

        //Exercise 3 - End

        //Exercise 4 - Start

        Book b1 = new Book("Oliver Twist", "Charles Dikens", 200);

        System.out.println(b1);
        System.out.println("Book Name: " + b1.getName());
        System.out.println("Author Name: " + b1.getAuthor());
        System.out.println("Book Pages: " + b1.getNumberOfPages());
    }
}