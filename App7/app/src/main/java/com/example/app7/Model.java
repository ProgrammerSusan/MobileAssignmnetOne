package com.example.app7;

public class Model
{
    public static int qnumber = 0, rightans = 0;
    public static boolean correct = true;
    public static String q, a1, a2, a3, a4;
    public static String[] questions =
            {"Which of the following is not a computer language?",
            "Who was the famous Computer Scientist who broke the nazi Enigma code in WWII?",
            "What two characters is Binary code comprised of?",
            "Which of these is the lowest level language?",
            "What does a high level language mean?",
            "What value type is a whole number?",
            "What value type is a single letter?",
            "Who was the first programmer?",
            "What is the Float type used for?",
            "How to you change between types temporarily?"};
    public static String[][] answers =
            {{"Java", "C++", "Basic", "HTML"},
            {"Alan Turing", "Bill Gates", "Steve Jobs", "Stephen Hawking"},
            {"1's and 2's", "0's and 2's", "1's and 0's", "3's and 2's"},
            {"Assembly code", "Java", "Python", "SQL"},
            {"It has a lot of words", "It is close to spoken language",
                    "It is close to binary", "It is hard"},
            {"Digit", "Integer", "Float", "Number"},
            {"String", "Character", "Letter", "Digit"},
            {"Bill Gates", "Ada Lovelace", "Steve Jobs", "Alan Turing"},
            {"Very big numbers", "decimals up to six places behind the decimal point",
                "Binary numbers", "Negative values"},
            {"Switching", "Conversion", "Type Casting", "You can't"}};
    public static char[] key = {'d','a','c','a','b','b','b','b','b','c'};

    public static void answer(boolean a,boolean b,boolean c,boolean d)
    {
        if(a)
            if(key[qnumber]=='a')
            {
                correct = true;
                rightans++;
            }
            else
                correct = false;
        else if(b)
            if(key[qnumber]=='b')
            {
                correct = true;
                rightans++;
            }
            else
                correct = false;
        else if(c)
            if(key[qnumber]=='c')
            {
                correct = true;
                rightans++;
            }
            else
                correct = false;
        else
            if(key[qnumber]=='d')
            {
                correct = true;
                rightans++;
            }
            else
                correct = false;

        if(qnumber==10)
            qnumber = 0;
        else
            qnumber++;
            //generate();
    }

    public static void initialize()
    {
        qnumber = 0;
        q = questions[qnumber];
        a1 = answers[qnumber][0];
        a2 = answers[qnumber][1];
        a3 = answers[qnumber][2];
        a4 = answers[qnumber][3];
        rightans = 0;
    }
}
