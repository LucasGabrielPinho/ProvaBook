public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("R. Korth", "korth@example.com", 'm');
        authors[1] = new Author("Abraham Silberschatz", "silberschatz@example.com", 'm');
        Book bd = new Book("Sistema do Banco de Dados : ", authors, 80.50, 15);
        System.out.println("Teste de print \n" + bd.toString());
    }
}