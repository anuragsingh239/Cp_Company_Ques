public class JavaStringsQuiz {
    public static void main(String[] args) {
//        String name="JavaConceptOfTheDay".substring(4);
//        System.out.println(name);
//        System.out.println("1".concat("2").repeat(5));
//        System.out.println("1".concat("2").repeat(5).charAt(7));
//        String string="String".replace('i','0');
//        System.out.println(string.substring(2,5));
//        System.out.println("Java"==new String("Java"));
//        String str=" Java\tConcept\tOf\tThe\tDay  ".strip();
//        System.out.println(str);
//        if("string".toUpperCase()=="STRING"){
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }
//        TO COMPARE STRING IN JAVA
//        String str1="java";
//        String str2="java";
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode()==str2.hashCode());
//        String str1="java";
//        String str2=new String("java");
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode()==str2.hashCode());
//        String str1=new String("java");
//        String str2=new String("java");
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode()==str2.hashCode());
//        String str1="java";
//        String str2=str1.intern();
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode()==str2.hashCode());
//        String str1="java";
//        String str2=str1.intern();
//        String str3=new String("java");
//        System.out.println(str1==str2);
//        System.out.println(str2==str3);
//        System.out.println(str3==str1);
//        String s1="1";
//        System.out.println(s1.concat("2").concat("3"));
//        System.out.println("java"+1000+2000+3000);
//        String str1=new String("java");
//        String str2=new String("java");
//        System.out.println(str1==str2);
//        System.out.println(str1==str2.intern());
//        System.out.println(str1.intern()==str2.intern());
//        System.out.println("0".indent(0));
//        System.out.println("1".indent(1));
//        System.out.println("2".indent(2));
//        System.out.println("3".indent(3));
//        System.out.println("4".indent(4));System.out.println("5".indent(5));
//    System.out.println("A".compareTo("B"));
//    System.out.println("B".compareTo("A"));
//    String string="JAVA";
//    StringBuffer sbuffer=new StringBuffer(string);
//    StringBuilder sbuilder=new StringBuilder(string);
//        System.out.println(string.equals(sbuffer));
//        System.out.println(string.equals(sbuilder));
//        System.out.println(sbuffer.equals(sbuilder));
//        "ABC123abc".chars().forEach(System.out::println);
//        String s1="null"+null+1;
//        System.out.println(s1);
//        String s2=1+null+"null";Shows error
//        System.out.println(s1);
        String str="Java Concept Of The Day";
        System.out.println(str.indexOf('a')+str.indexOf("Day"));
        System.out.println(str.indexOf('a',5));
    }
}
