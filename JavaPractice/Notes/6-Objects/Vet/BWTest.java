public class BWTest {
    public static void main(String[] args) {
        
        //write the file
        BufferWriter.writeString("Hello World");
        BufferWriter.saveAndClose();

        //read the file
        System.out.println(BufferWriter.readString());
    }
    
}
