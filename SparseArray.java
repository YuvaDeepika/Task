import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays{

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
HashMap<String,Integer> a=new HashMap<String,Integer>();
ArrayList<Integer> arr=new ArrayList<>();
for(int i=0;i<strings.length;i++)
{
    if(a.containsKey(strings[i])==true)
    {
        int v=a.get(strings[i]);
        a.put(strings[i],v+1);
    }
    else
    {
        a.put(strings[i],1);
    }
}
for(int i=0;i<queries.length;i++)
{
    if(a.containsKey(queries[i]))
    {
       arr.add(a.get(queries[i]));
    }
    else{
       arr.add(0);
    }
}
int a1[]=new int[arr.size()];
for(int i=0;i<arr.size();i++)
{
    int y=arr.get(i);
    a1[i]=y;
}
return a1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
