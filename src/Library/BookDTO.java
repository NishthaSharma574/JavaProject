package Library;

public class BookDTO extends BaseDTO {
    public String name2;
    //String authorname;

    public BookDTO(int id, String name)
    {
      this.id = id ;
      this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

   /* public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }*/

}
