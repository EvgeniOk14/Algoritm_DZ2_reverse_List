import java.util.LinkedList;

public class PrintList
{

    public void print(LinkedList<Node> list1)
    {
        for(int i = 0; i < list1.size(); i++)
               {
                   System.out.println("list1: " + i + " " + list1.get(i).value);
               }
        }
    }

