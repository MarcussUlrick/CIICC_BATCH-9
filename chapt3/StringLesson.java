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
            System.out.println(name3.indexOf('l')); //index of
            System.out.println(name3.length()); // length
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

    class Sbuilder {
        public static void main(String[] args) {
            
            String alpha = "";

            for(char current ='a'; current<='z'; current++)
            alpha +=current;
            System.out.println(alpha);

            
            //mutability and chaining
            StringBuilder sb = new StringBuilder("start");
            System.out.println(sb);
            sb.append("+middle");
            System.out.println(sb);
            StringBuilder same = sb.append("+end");
            System.out.println(sb);
            System.out.println(same);

            StringBuilder abc = new StringBuilder("animals");
            String sub = abc.substring(abc.indexOf("a", abc.indexOf("als")));
            int len = abc.length();
            char ch = abc.charAt(6);
            System.out.println(sub + " " + len + " " + ch);

            // append(String str) using it w/out comment
            // insert() adds characters to the StringBuilder at the requested index.
            // delete(int start, int end) / deleteCharAt(int index)
            //reverse()
            // String toString()

            String s = sb.toString();
            System.out.println(s);

            same.reverse();
            System.out.println(same);

            //Understanding Equality

            StringBuilder one = new StringBuilder();
             StringBuilder two = new StringBuilder();
              StringBuilder three =one.append("a");
              System.out.println(one == two);
              System.out.println(one == three);

            String x = "Hello World";
            String z = " Hello World".trim();
            System.out.println(x == z); // false

            String e = "Hello World";
            String f = " Hello World".trim();
            System.out.println(e.equals(z)); // true
        
        }
    }

    class Tiger {
        public static void main(String[] args) {
            Tiger t1 = new Tiger();
            Tiger t2 = new Tiger();
            Tiger t3 = t1;

            System.out.println(t1 == t1); // true
            System.out.println(t1 == t2); // false
            System.out.println(t1.equals(t2)); // true

        }
    }