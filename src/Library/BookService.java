package Library;

import java.io.*;

public class BookService implements Service {
    private int id;
    private String bookname;
    private String author;
    private String newname;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BookDTO bookdto;
    DAO dao = new DAO();

    @Override
    public void create() throws IOException {
        System.out.println("Enter ID");
        id = Integer.parseInt(br.readLine().trim());
        System.out.println("Enter BookName");
        bookname=br.readLine().trim();
        System.out.println("Enter Author Name");
        author=br.readLine().trim();
        bookdto = new BookDTO(id,bookname);
        dao.create(id,bookdto);
    }

    @Override
    public void delete() throws IOException {

        System.out.println("Enter ID you want to delete");
        id = Integer.parseInt(br.readLine().trim());
        dao.delete(id);

    }

    @Override
    public void viewAll() {
    dao.viewAll();
    }

    @Override
    public void update() throws IOException {

        System.out.println("Enter ID of book whose Name is to be updated");
        id = Integer.parseInt(br.readLine().trim());
        //System.out.println("Enter Old Name");
       // bookname=br.readLine().trim();
        System.out.println("Enter New Book Name");
        newname=br.readLine().trim();
        bookdto = new BookDTO(id,bookname);
        dao.update(id,bookdto);


    }

}
