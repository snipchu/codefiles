public class ArrayUtil
{
    private static boolean isinlist(String[] x, String i) {
        for (String r: x) {
            if (i.equals(r)) { return true; }
        }
        return false;
    }
    
    public static String[] noDupes(String [] x) {
        int foo=0;
        String[] myarray = new String[x.length];
        for (String i:x) {
            if (!isinlist(myarray,i)) {
                myarray[foo] = i;
                foo++;
            }
        }
        return noNulls(myarray);
    }
    
    public static String[] reverse(String [] x) {
        String[] myarray = new String[x.length];
        String temp = x[x.length-1];
        for (int i=0; i<=x.length/2; i++) {
            myarray[i] = temp;
            myarray[x.length-1-i] = x[i];
            temp = x[x.length-i-2];
            System.out.println();
        }
        return myarray;
    }
    
    public static String[] noNulls(String [] x) {
        int foo=0;
        for (String i: x) { if (i==null) {foo++;} }
        String[] myarray = new String[x.length-foo];
        foo=0;
        for (String i:x) {
            if (i!=null) {
                myarray[foo] = i;
                foo++;
            }
        }
        return myarray;
    }
    
    
    public static String[] ascending(String [] x) {
        // make a duplicate of the array bc im a loser
        String[] myarray = new String[x.length];
        for (int i=0; i<x.length; i++) {myarray[i] = x[i];}
        
        for (int i=0; i<x.length; i++) {
            int smallest=i;
            //get smallest
            for (int j=i; j<x.length; j++) {
                if (myarray[smallest].compareTo(myarray[j])>=0) {
                    smallest = j;
                }
            }
            String temp = myarray[smallest];
            myarray[smallest] = myarray[i];
            myarray[i] = temp;
        }
        
        return myarray;
    }
    
    public static String[] descending(String [] x) {
        // make a duplicate of the array bc im a loser
        String[] myarray = new String[x.length];
        for (int i=0; i<x.length; i++) {myarray[i] = x[i];}
        
        for (int i=0; i<x.length; i++) {
            int smallest=i;
            //get smallest
            for (int j=i; j<x.length; j++) {
                if (myarray[smallest].compareTo(myarray[j])<=0) {
                    smallest = j;
                }
            }
            String temp = myarray[smallest];
            myarray[smallest] = myarray[i];
            myarray[i] = temp;
        }
        
        return myarray;
    }
    
    
    public static String[] allCaps(String [] x) {
        String[] myarray = new String[x.length];
        for (int i=0; i<x.length; i++) {
            myarray[i] = x[i].toUpperCase();
        }
        return myarray;
    }
    
    public static String[] noCaps(String [] x) {
        String[] myarray = new String[x.length];
        for (int i=0; i<x.length; i++) {
            myarray[i] = x[i].toLowerCase();
        }
        return myarray;
    }
    
    
    public static String[] add(String [] x, int q, String qq) {
        String[] myarray = new String[x.length+1];
        for (int i=0; i<myarray.length; i++) {
            if (i<q) {
                myarray[i] = x[i];
            } else if (i>q) {
                myarray[i] = x[i-1];
            } else {
                myarray[i] = qq;
            }
        }
        return myarray;
    }
    
    public static String[] remove(String [] x, String q) {
        String[] myarray = new String[x.length-1];
        int thisissostupid = 0;
        for (String i:x) {
            if (!i.equals(q)) {
                myarray[thisissostupid] = i;
                thisissostupid++;
            } 
        }
        return myarray;
    }
    
    public static void main() {
        String[] array = {"F", "A", "B", "B", "C", "C", "D","b", "a"};
        array=reverse(array);
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
