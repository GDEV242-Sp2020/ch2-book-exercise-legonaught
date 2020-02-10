/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int  borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isTextBook)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = isTextBook;
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void printDetails()
    {
        System.out.println("----------------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pages);
        if(refNumber != "")
        {
            System.out.println("Refrence ID: " + refNumber);
        }
        else
        {
            System.out.println("ZZZ");
        }
        System.out.println("# times obtained from library: " + borrowed);
        System.out.println("----------------------------------------");
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Refrence ID must be at least 3 digits.");
        }
    }
    
    public void borrow()
    {
        borrowed += 1;
    }
    
    public void isCourseText()
    {
        
    }
}
