public class StringMethod {
    public static void main(String[] args){
        String name="Gopinath";
        String fname="gopinath";
        System.out.println(name.hashCode()); // -2074015768
        System.out.println(name.equals(fname)); // false
        System.out.println(name.equalsIgnoreCase(fname)); // true
        System.out.println(name.length()); // 8
        System.out.println(name.charAt(3)); // i
        System.out.println(name.toUpperCase()); // GOPINATH
        System.out.println(name.toLowerCase()); // gopinath
        System.out.println(name.replace("Gopi","Gokul")); // Gokulnath
        System.out.println(name.contains("in")); // true
        System.out.println(name.isEmpty()); //false
        System.out.println(name.endsWith("th"));// true
        System.out.println(name.startsWith("go"));// false
        System.out.println(name.substring(6)); // th
        System.out.println(name.substring(0,4)); // Gopi
        char cname[]=name.toCharArray();
        for(char p : cname){
            System.out.print(p+"   "); // G   o   p   i   n   a   t   h
        }
        System.out.println("\n\n\n\n");
        StringBuffer Bname=new StringBuffer("Gopinath");
        System.out.println(Bname); // Gopinath
        Bname = Bname.insert(0,"My name is ");
        System.out.println(Bname);  // My name is Gopinath
        Bname = Bname.replace(11,19,"GopinathKing");
        System.out.println(Bname); // My name is GopinathKing
        Bname = Bname.delete(19,23);
        System.out.println(Bname); // Gopinath
        Bname = Bname.reverse();
        System.out.println(Bname); // htanipoG si eman yM
        Bname = Bname.reverse();
        Bname.setCharAt(3,'N');
        System.out.println(Bname); // My Name is Gopinath
        System.out.println(Bname.capacity()); // 24
        // System.out.println();
    }
}
