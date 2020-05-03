package Library;

import java.util.*;
import java.util.HashMap;

class InvalidException extends Exception
{
    InvalidException(String s)
    {
        super(s);
    }
}
public class DAO<M,N> {
    HashMap<M,N> hm = new HashMap<>();

    public void create(M id,N obj1)
    {
        try
        {
           if(hm.containsKey(id))
           {
               throw new InvalidException("Duplicate ID");
           }
           else
           {
               hm.put(id,obj1);
               System.out.println("Successfully Entered");
           }
        }
        catch (InvalidException i)
        {
            System.out.println(i.toString());
        }
    }

    public void delete(M id)
    {
        try
        {
            if(hm.isEmpty())
            {
                throw new InvalidException("Nothing to be Deleted");
            }
            else
            {
                 hm.remove(id);
                System.out.println("Book Deleted Successfully");
            }
        }
        catch(InvalidException i)
        {
            System.out.println(i.toString());
        }
    }


    public void viewAll() {
       /* Iterator<I> integerIterator = hm.keySet().iterator();
        while (integerIterator.hasNext()) {
            System.out.printf("%d\n", integerIterator.next());
        }
        Iterator<B> bookDTOIterator = hm.values().iterator();

        while (bookDTOIterator.hasNext())
        {
            System.out.println(bookDTOIterator.hasNext());
        }*/

           Set<Map.Entry<M, N>> set = hm.entrySet();
           Iterator<Map.Entry<M, N>> itr = set.iterator();

           while (itr.hasNext()) {
               Map.Entry e = itr.next();
               System.out.println(e.getKey() +" " + e.getValue());
       }

    }

    public void update(M id,N obj4)
    {
        hm.replace(id,obj4);
        System.out.println("Updated Successfully");
    }
}
