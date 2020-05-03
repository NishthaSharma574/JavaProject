package Library;

import java.io.IOException;

public interface Service {
     void create()  throws IOException;
     void delete()  throws IOException;
     void viewAll() throws IOException;
     void update()  throws  IOException;

}
