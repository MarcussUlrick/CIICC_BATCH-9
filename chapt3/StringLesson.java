package chapt3;

public class StringLesson {
    public static void main(String[] args) {
        String name = "fluffy";
        String a = "1";
            a = "0";
            a+="2";
            a+="3";
        String b = "1";
        String name2 = "fluffy";
            name = null;
            name2 = null;
        String name3 = new String("fluffy");

            System.out.println(a);
            System.out.println(name3.indexOf('l'));
            System.out.println(name3.length());
            System.out.println(name3.substring(3));
            System.out.println(name3.substring(3,4));
            System.out.println(name3.substring(3,5));

            System.out.println(name3.toUpperCase());
            System.out.println("MARCUSS".toLowerCase());

            // equals method

            System.out.println("abc".equals("ABC"));

            System.out.println("ABC".startsWith("A"));
            System.out.println(name3.endsWith("y"));
            System.out.println("abce".contains("e"));

            System.out.println("abcabc".replace('a', 'A'));
            System.out.println("Marcuss".replace("Marcuss", "pogi"));
            System.out.println("\t   a b x\n".trim());

        }
    }

