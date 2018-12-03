public class testAuthor {
    public static void main(String[] args) {
        Author author = new Author("J.K. Roaling", "jkroaling@email.com", 'f');
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());

        author.setEmail("newMail@email.com");

        System.out.println(author.toString());
    }
}
