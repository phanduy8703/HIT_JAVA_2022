package Bai_1;

public class a {
    public static void main(String[] args) {
        Author a = new Author("Duy", "abc@gmail.com", 'm');
        Book b = new Book("A", a, 100, 1000);
        a.setEmail("xyz@gmail.com");
        System.out.println(a);
        System.out.println("name is: " + a.getName());
        System.out.println("gender is: " + a.getGender());
        System.out.println("email is: " + a.getEmail());
        b.setPrice(99);
        b.setQty(999);
        System.out.println(b);
        System.out.println("name is: " + b.getName());
        System.out.println("price is: " + b.getPrice());
        System.out.println("qty is: " + b.getQty());
        System.out.println("author is: " + b.getAuthor());
        System.out.println("author's name is: " + b.getAuthor().getName());
        System.out.println("author's email is: " + b.getAuthor().getEmail());
        System.out.println("author's gender is: " + b.getAuthor().getGender());
    }
}
