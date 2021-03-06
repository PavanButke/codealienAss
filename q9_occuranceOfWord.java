// In the string “The quick brown fox jumped over the lazy dog”, WAP to find the count of
// each word start char. Example: “hello how are you” has 2 words start with ‘h’ and one
// with ‘a’ and one with ‘y’, hence => {h: 2, a: 1, y: 1}. Result could be in any data structure
// of your choice.


import java.util.*;

class Main
{
    public static void main(String[] args) 
    {
        Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
        for (String string : "hello how are you”".split(" ")) {
            if(unique.get(string) == null)
                unique.put(string, 1);
            else
                unique.put(string, unique.get(string) + 1);
        }
        String uniqueString = join(unique.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(unique.values());

        System.out.println("Output = " + uniqueString );
        System.out.println("Values = " + value);

    }

    public static String join(Collection<String> s, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }
}